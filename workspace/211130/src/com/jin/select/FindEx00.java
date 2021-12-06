package com.jin.select;

import java.util.Arrays;

import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class FindEx00 {
	final static String DB_NAME = "SelectDB";
	final static String COLLECTION_NAME = "SelectCollection";

	private static MongoCollection<Document> getCollection() {
		MongoClient mongoClient = MongoClients.create();
		MongoDatabase db = mongoClient.getDatabase(DB_NAME);
		
		return db.getCollection(COLLECTION_NAME);
	}

	public static void main(String[] args) {
		MongoCollection<Document> collection = getCollection();

		upload(collection);
	}

	private static void upload(MongoCollection<Document> collection) {
		collection.insertMany(Arrays.asList(
				Document.parse("{ item: 'journal', status: 'A', " + "size: { h: 14, w: 21, uom: 'cm' }, "
						+ "instock: [ { warehouse: 'A', qty: 5 }]}"),
				Document.parse("{ item: 'notebook', status: 'A',  " + "size: { h: 8.5, w: 11, uom: 'in' }, "
						+ "instock: [ { warehouse: 'C', qty: 5}]}"),
				Document.parse("{ item: 'paper', status: 'D', " + "size: { h: 8.5, w: 11, uom: 'in' }, "
						+ "instock: [ { warehouse: 'A', qty: 60 }]}"),
				Document.parse("{ item: 'planner', status: 'D', " + "size: { h: 22.85, w: 30, uom: 'cm' }, "
						+ "instock: [ { warehouse: 'A', qty: 40}]}"),
				Document.parse("{ item: 'postcard', status: 'A', " + "size: { h: 10, w: 15.25, uom: 'cm' }, "
						+ "instock: [ { warehouse: 'B', qty: 15 }, " + "{ warehouse: 'C', qty: 35 } ] }")));
	}
}