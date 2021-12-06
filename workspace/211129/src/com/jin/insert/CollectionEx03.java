package com.jin.insert;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class CollectionEx03 {

	public static void main(String[] args) {
		final String DB_NAME = "local";
		
//		기본 정보로 연결
		MongoClient mongoClient = MongoClients.create();
//		데이터베이스 정보 얻기
		MongoDatabase db = mongoClient.getDatabase(DB_NAME);
		
//		collection 제거
		db.getCollection("secondCollection").drop();
		
//		데이터베이스에 있는 collection 정보 얻기
		MongoIterable<String> collections = db.listCollectionNames();
		
		for(String collection : collections)
			System.out.println(collection);
	}

}
