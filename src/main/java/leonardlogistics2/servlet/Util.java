/**
 * 
 */
package leonardlogistics2.servlet;

import java.util.ArrayList;
import java.util.List;
 
import org.bson.Document;
 
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
/**
 * @author Patrick
 *
 */
public class Util {
    private static MongoClient getConnection() {

    	MongoClientURI uri = new MongoClientURI(
    			"mongodb+srv://dridgen:Devops2019@leonard2-kvjur.mongodb.net/test?retryWrites=true&w=majority");

    	MongoClient mongoClntObj = new MongoClient(uri);

        return mongoClntObj;
    }
 
    // Method to search a user in the mongodb
    public static boolean searchUserInDb(String username, String password) {
        boolean user_found = false;
//        String db_name = "leonard2",
//                db_collection_name = "Users";
 
        // Get the mongodb connection
//        MongoDatabase db = getConnection().getDatabase(db_name);
 
        // Get the mongodb collection.
//        MongoCollection col = db.getCollection(db_collection_name);
 
        // Get the particular record from the mongodb collection        
//        List obj = new ArrayList();
//        obj.add(new BasicDBObject("id", loginId));
//        obj.add(new BasicDBObject("pwd", loginPwd));
 
        // Form a where query
//        BasicDBObject whereQuery = new BasicDBObject();
//        whereQuery.put("$and", obj);
//        System.out.println("Sql query is?= " + whereQuery.toString());
// 
//        FindIterable<Document> cursor = col.find(whereQuery);
//        for(Document doc : cursor) {
//            System.out.println("Found?= " + doc);
//            user_found = true;
//        }
        if("paddymcg".equals(username)&&"lyit".equals(password)) {
        	user_found=true;
        }
        return user_found;
    }
}
