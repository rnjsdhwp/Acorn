package com.jin.insert;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class CollectionEx03 {

	public static void main(String[] args) {
		final String DB_NAME = "local";
		
//		�⺻ ������ ����
		MongoClient mongoClient = MongoClients.create();
//		�����ͺ��̽� ���� ���
		MongoDatabase db = mongoClient.getDatabase(DB_NAME);
		
//		collection ����
		db.getCollection("secondCollection").drop();
		
//		�����ͺ��̽��� �ִ� collection ���� ���
		MongoIterable<String> collections = db.listCollectionNames();
		
		for(String collection : collections)
			System.out.println(collection);
	}

}
