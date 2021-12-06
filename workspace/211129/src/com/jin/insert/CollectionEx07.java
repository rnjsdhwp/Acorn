package com.jin.insert;

import java.util.HashMap;
import java.util.Map;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class CollectionEx07 {

	public static void main(String[] args) {
		final String DB_NAME = "test";
		final String COLLECTION_NAME = "testCollection";
		
//		기본 정보로 연결
		MongoClient mongoClient = MongoClients.create();
//		데이터베이스 정보 얻기
		MongoDatabase db = mongoClient.getDatabase(DB_NAME);
		
//		데이터베이스에 있는 collection 정보 얻기
		MongoCollection<Document> collection = db.getCollection(COLLECTION_NAME);

//		Map을 document에 저장
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("미디어파일", "음원");
		Document doc = new Document();
		doc.put("map", map);
		
//		collection에 추가
		collection.insertOne(doc);
		
//		collection에 있는 document 읽기
		FindIterable<Document> docs = collection.find();
		
		for(Document dc : docs) 
			System.out.println(dc);
	}

}
