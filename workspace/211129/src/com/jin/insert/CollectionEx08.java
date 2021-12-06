package com.jin.insert;

import java.util.HashMap;
import java.util.Map;

import org.bson.Document;
import org.bson.json.JsonObject;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class CollectionEx08 {

	public static void main(String[] args) {
		final String DB_NAME = "test";
		final String COLLECTION_NAME = "testCollection";
		
//		�⺻ ������ ����
		MongoClient mongoClient = MongoClients.create();
//		�����ͺ��̽� ���� ���
		MongoDatabase db = mongoClient.getDatabase(DB_NAME);
		
//		�����ͺ��̽��� �ִ� collection ���� ���
		MongoCollection<Document> collection = db.getCollection(COLLECTION_NAME);

//		JSON�� document�� ����
		String json = "{'jsonkey':'jsonvalue', 'two':2}";
//		{'jsonkey':'jsonvalue', 'two':2}
//		���ڿ��� json �������� ��ȯ
		JsonObject jsonObj = new JsonObject(json);
		
		Document doc = new Document();
		doc.put("json", jsonObj);
		
//		collection�� �߰�
		collection.insertOne(doc);
		
//		collection�� �ִ� document �б�
		FindIterable<Document> docs = collection.find();
		
		for(Document dc : docs) 
			System.out.println(dc);
	}

}
