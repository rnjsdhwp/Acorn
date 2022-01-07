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
//		isDuplicate���� �ߺ��Ǹ� true, �ƴϸ� false ��ȯ
		if(isDuplicate(key, value))	return;
		Document doc = new Document();
		doc.put(key, value);
		collection.insertOne(doc);
	}
	private boolean isDuplicate(String key, String value) {
//		�ߺ��� key, value ã��
		Bson doc = eq(key, value);
		FindIterable<Document> docs = collection.find(doc);
//		ã�� �������� ù ��° ���� null�̸� �ߺ������Ͱ� ���� ���̹Ƿ� false ��ȯ
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
