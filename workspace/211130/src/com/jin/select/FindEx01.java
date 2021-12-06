package com.jin.select;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import static com.mongodb.client.model.Filters.eq;

public class FindEx01 {
	final static String DB_NAME = "SelectDB";
	final static String COLLECTION_NAME = "SelectCollection";

	private static MongoCollection<Document> getCollection() {
		MongoClient mongoClient = MongoClients.create();
		MongoDatabase db = mongoClient.getDatabase(DB_NAME);
		
		return db.getCollection(COLLECTION_NAME);
	}

	public static void main(String[] args) {
		MongoCollection<Document> collection = getCollection();

		find(collection);
	}

	private static void find(MongoCollection<Document> collection) {
//		ã�� Ű��
		Bson key = eq("status", "A");
//		find�� key�� �Է������ν� ���ϴ� key, value ���� ã�� �� �ִ�.
		FindIterable<Document> docs = collection.find(key);
		
		for(Document doc : docs)
			System.out.println(doc);
	}

	
}