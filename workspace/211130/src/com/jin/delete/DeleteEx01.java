package com.jin.delete;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import static com.mongodb.client.model.Filters.eq;

public class DeleteEx01 {
	final static String DB_NAME = "SelectDB";
	final static String COLLECTION_NAME = "SelectCollection";

	private static MongoCollection<Document> getCollection() {
		MongoClient mongoClient = MongoClients.create();
		MongoDatabase db = mongoClient.getDatabase(DB_NAME);
		
		return db.getCollection(COLLECTION_NAME);
	}

	public static void main(String[] args) {
		MongoCollection<Document> collection = getCollection();

//		Ư�� ������ ����
		deleteEx(collection);
		
		show(collection);
	}

	private static void deleteEx(MongoCollection<Document> collection) {
		Bson key = eq("status", "D");
//		������ ��ü �� ���� ���� ��Ÿ���� ���� ����
//		collection.deleteOne(key);
//		������ ��ü�� �����ϴ� ��� �� ����
		collection.deleteMany(key);
	}

	private static void show(MongoCollection<Document> collection) {
		FindIterable<Document> docs = collection.find();
		
		for(Document doc : docs)
			System.out.println(doc);
	}

	
}