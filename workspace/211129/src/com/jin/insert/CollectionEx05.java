package com.jin.insert;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class CollectionEx05 {

	public static void main(String[] args) {
		final String DB_NAME = "test";
		final String COLLECTION_NAME = "testCollection";
		
//		기본 정보로 연결
		MongoClient mongoClient = MongoClients.create();
//		데이터베이스 정보 얻기
		MongoDatabase db = mongoClient.getDatabase(DB_NAME);
		
//		데이터베이스에 있는 collection 정보 얻기
		MongoCollection<Document> collection = db.getCollection(COLLECTION_NAME);

//		collection의 생성자를 통해 Key, value를 저장할 수 있다.
		Document doc = new Document("pw", "jin1234");
		
//		collection에 추가
		collection.insertOne(doc);
		
//		collection에 있는 document 읽기
		FindIterable<Document> docs = collection.find();
		
		for(Document dc : docs) 
			System.out.println(dc);
	}

}
