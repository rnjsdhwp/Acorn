package com.jin.insert;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class CollectionEx06 {

	public static void main(String[] args) {
		final String DB_NAME = "test";
		final String COLLECTION_NAME = "testCollection";
		
//		�⺻ ������ ����
		MongoClient mongoClient = MongoClients.create();
//		�����ͺ��̽� ���� ���
		MongoDatabase db = mongoClient.getDatabase(DB_NAME);
		
//		�����ͺ��̽��� �ִ� collection ���� ���
		MongoCollection<Document> collection = db.getCollection(COLLECTION_NAME);

		
		Document doc = new Document();
		doc.put("����",  "java");
		doc.put("����", "�ִ� 1õ��");
		
		Document docDetail = new Document();
		docDetail.put("����", "�ֻ�");
		docDetail.put("������", "����");
		
		doc.put("���γ���", docDetail);
		
//		collection�� �߰�
		collection.insertOne(doc);
		
//		collection�� �ִ� document �б�
		FindIterable<Document> docs = collection.find();
		
		for(Document dc : docs) 
			System.out.println(dc);
	}

}
