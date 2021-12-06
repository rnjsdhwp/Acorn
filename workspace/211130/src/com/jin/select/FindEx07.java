package com.jin.select;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import static com.mongodb.client.model.Filters.eq;

import static com.mongodb.client.model.Projections.include;
import static com.mongodb.client.model.Projections.slice;
import static com.mongodb.client.model.Projections.fields;
public class FindEx07 {
	final static String DB_NAME = "SelectDB";
	final static String COLLECTION_NAME = "SelectCollection";

	private static void find(MongoCollection<Document> collection) {
//		ã�� Ű��
		Bson key = eq("status", "A");
//		find�� key�� �Է������ν� ���ϴ� key, value ���� ã�� �� �ִ�.
		FindIterable<Document> docs = collection.find(key);

		for (Document doc : docs)
			System.out.println(doc);

		System.out.println();
//		����� ���� �� item�� status�� �����ֱ�
//		slice�� �迭 ������ ó�� �� �� �κи� �����ϴ� ���
//		������ ��� �� �κк��� ������.
//		slice([�о� ���� ��ü], [����])
		docs.projection(
				fields(
						include("item", "status"), slice("instock", -1)
					)
				);

		for (Document doc : docs)
			System.out.println(doc);

	}

	private static MongoCollection<Document> getCollection() {
		MongoClient mongoClient = MongoClients.create();
		MongoDatabase db = mongoClient.getDatabase(DB_NAME);

		return db.getCollection(COLLECTION_NAME);
	}

	public static void main(String[] args) {
		MongoCollection<Document> collection = getCollection();

		find(collection);
	}

}