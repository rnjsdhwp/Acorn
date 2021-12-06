package com.jin.insert;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class CollectionEx04 {

	public static void main(String[] args) {
		final String DB_NAME = "test";
		final String COLLECTION_NAME = "testCollection";
		
//		�⺻ ������ ����
		MongoClient mongoClient = MongoClients.create();
//		�����ͺ��̽� ���� ���
		MongoDatabase db = mongoClient.getDatabase(DB_NAME);
		
//		�����ͺ��̽��� �ִ� collection ���� ���
		MongoCollection<Document> collection = db.getCollection(COLLECTION_NAME);

//		collection�� �����ϱ� ���� key, value ���� ����
		Document doc = new Document();
		doc.put("firstKey", "firstValue");
		doc.put("id", "jin");
		doc.put("pw", "jin1234");
		
//		collection�� �߰�
		collection.insertOne(doc);
		
//		collection�� �ִ� document �б�
		FindIterable<Document> docs = collection.find();
		
		for(Document dc : docs) 
			System.out.println(dc);
	}

}
