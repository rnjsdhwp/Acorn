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
import static com.mongodb.client.model.Projections.excludeId;
import static com.mongodb.client.model.Projections.fields;
public class FindEx03 {
	final static String DB_NAME = "SelectDB";
	final static String COLLECTION_NAME = "SelectCollection";

	private static void find(MongoCollection<Document> collection) {
//		찾을 키값
		Bson key = eq("status", "A");
//		find에 key를 입력함으로써 원하는 key, value 값을 찾을 수 있다.
		FindIterable<Document> docs = collection.find(key);

		for (Document doc : docs)
			System.out.println(doc);

		System.out.println();
//		추출된 정보 중 item과 status만 보여주기
//		fields는 여러 데이터를 지정할 경우 사용
		docs.projection(
				fields(
						include("item", "status"), excludeId()
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