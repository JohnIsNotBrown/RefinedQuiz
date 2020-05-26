package src;

import com.mongodb.*;
import java.util.logging.*;

public class Database {
    //public void nameAge()

    public void callme(String name, int age, int score){
        try{
            Logger.getLogger("org.mongodb.driver").setLevel(Level.WARNING);
            MongoClient mongo = new MongoClient("localhost", 27017);
            //grabbing the database name 
			DB db = mongo.getDB("results");
			
            //System.out.println("Database successfully connected");
            System.out.println();
            
            //db.createCollection("results",new BasicDBObject());
            //db.createCollection("main",new BasicDBObject());
            //seeing out all the collections in the database 
            
            //db.getCollectionNames().forEach(System.out::println);
			
			//System.out.println(db.getCollection("posts"));
			
			//this is getting the post collections and inserting to it or just finding a certain file from it
			DBCollection table = db.getCollection("First Test");
			BasicDBObject doc = new BasicDBObject();
			//doc.put("name","peter");
			//doc.put("status","the best");
			
            doc.put("name", name);
            doc.put("age", age);
            doc.put("score", score);
            table.insert(doc);
			// DBCursor cursor = table.find(doc);
			
			// while(cursor.hasNext()) {
			// 	System.out.println(cursor.next());
            // }
            System.out.println();
        }
        catch(Exception e) {
			System.out.println("Nice try boy!");
		}
    }
    
}