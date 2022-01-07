package com.jin.Notepad;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;

import static com.mongodb.client.model.Filters.eq;
//import static com.mongodb.client.model.Projections.excludeId;
import static com.mongodb.client.model.Projections.exclude;

import java.util.ArrayList;
import java.util.List;

public class FileDaoImpl implements IFileDao{
//	DB Name
	final private String DB_NAME = "NotepadDB";
//	Collection Name
	final private String COLLECTION_NAME = "Notepad";
	private MongoCollection<Document> collection;
	
	public FileDaoImpl() {
		collection = MongoClients.create()
				.getDatabase(DB_NAME)
				.getCollection(COLLECTION_NAME);				
	}
	@Override
	public void Insert(String key, String value) {
//		isDuplicate에서 중복되면 true, 아니면 false 반환
		if(isDuplicate(key, value))	return;
		Document doc = new Document();
		doc.put(key, value);
		collection.insertOne(doc);
	}
	private boolean isDuplicate(String key, String value) {
//		중복된 key, value 찾기
		Bson doc = eq(key, value);
		FindIterable<Document> docs = collection.find(doc);
//		찾은 데이터의 첫 번째 값이 null이면 중복데이터가 없는 것이므로 false 반환
		if(docs.first()==null)	return false;
		return true;
	}
	@Override
	public List<String> select() {
		FindIterable<Document> docs = collection.find();
		List<String> pathLst = new ArrayList<String>();
		
//		docs.projection(excludeId());
		docs.projection(exclude("_id"));
		for(Document doc : docs) {
			String tmp = doc.values().toString();
//			System.out.println(tmp.replace("[", "").replace("]", ""));
			pathLst.add(tmp.replace("[", "").replace("]", ""));
		}
		
		return pathLst;
	}
}
