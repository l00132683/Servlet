package com.jcg.mongodb.servlet;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Util {

	// Method to make a connection to the mongodb server listening on a default port
	private static MongoClient getConnection() {
		String uri = "mongodb://leonard2-kvjur.mongodb.net/?ssl=true&replicaSet=globaldb&maxIdleTimeMS=120000&retrywrites=false";
		MongoClient mongoClntObj= new MongoClient(new MongoClientURI(uri));

		return mongoClntObj;
	}

	// Method to search a user in the mongodb
	public static boolean searchUserInDb(String loginId, String loginPwd) {
		boolean user_found = false;
		String requiredLogin = "paddymcg", requiredP = "lyit";
		String db_name = "leonard2",
				db_collection_name = "Users";
//
		// Get the mongodb connection
		MongoDatabase db = getConnection().getDatabase("hello");
		System.out.println(db.getName());
		// Get the mongodb collection.
//		MongoCollection<Document> col = db.getCollection(db_collection_name);
//		System.out.println(col.getNamespace());
//		// Get the particular record from the mongodb collection		
//		List<BasicDBObject> obj = new ArrayList<BasicDBObject>();
//		obj.add(new BasicDBObject("username", loginId));
//		obj.add(new BasicDBObject("pwd", loginPwd));
//
//		BasicDBObject whereQuery = new BasicDBObject();
////		whereQuery.put("$and", obj);
//		System.out.println("Sql query is?= " + whereQuery.toString());
//
//		FindIterable<Document> cursor = col.find(whereQuery);
//		for(Document doc : cursor) {
//			System.out.println("Found?= " + doc);
//			user_found = true;
//		}
		System.out.println("Outside if:"+loginId + " " + loginPwd);
		if("paddymcg".equals(loginId) && "lyit".equals(loginPwd)) {
			System.out.print("inside loop:"+loginId +" - " + loginPwd);
			user_found=true;
		}
		return user_found;
	}
}