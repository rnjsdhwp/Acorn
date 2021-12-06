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

//		특정 데이터 삭제
		deleteEx(collection);
		
		show(collection);
	}

	private static void deleteEx(MongoCollection<Document> collection) {
		Bson key = eq("status", "D");
//		지정된 객체 중 가장 먼저 나타나는 값을 제거
//		collection.deleteOne(key);
//		지정된 객체가 존재하는 모든 값 제거
		collection.deleteMany(key);
	}

	private static void show(MongoCollection<Document> collection) {
		FindIterable<Document> docs = collection.find();
		
		for(Document doc : docs)
			System.out.println(doc);
	}

	
}