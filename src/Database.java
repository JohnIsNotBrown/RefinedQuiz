package src;

import com.mongodb.*;
import com.mongodb.client.FindIterable;

import java.util.logging.*;

public class Database {
    // public void nameAge()

    public void callMe(String name, int age, int score) {
        try {
            Logger.getLogger("org.mongodb.driver").setLevel(Level.WARNING);
            MongoClient mongo = new MongoClient("localhost", 27017);

            DB db = mongo.getDB("results");

            System.out.println();

            DBCollection table = db.getCollection("First Test");
            BasicDBObject doc = new BasicDBObject();
       
            doc.put("name", name);
            doc.put("age", age);
            doc.put("score", score);
            table.insert(doc);
    
            System.out.println();
        } catch (Exception e) {
            System.out.println("Nice try boy!");
        }
    }

    //this returns the top 5 scores orted by the database
    public void topFive()
    {
        try {
            Logger.getLogger("org.mongodb.driver").setLevel(Level.WARNING);
            MongoClient mongo = new MongoClient("localhost", 27017);
            DB db = mongo.getDB("results");

            DBCollection table = db.getCollection("First Test");
            DBCursor cursor = table.find().sort(new BasicDBObject("score",-1)).limit(5);

            while(cursor.hasNext())
            {
                System.out.println(cursor.next());
            }
        }
        catch(Exception e )
        {
            System.out.println("Better luck next time");
        }
    }
    
    // this takes in the name of the user you want to find and returns their name and score
    public void findMe(String name) {
        try {
            Logger.getLogger("org.mongodb.driver").setLevel(Level.WARNING);

            MongoClient mongo = new MongoClient("localhost", 27017);

            DB db = mongo.getDB("results");

            DBCollection table = db.getCollection("First Test");
            BasicDBObject doc = new BasicDBObject();

            doc.put("name", name);

            DBCursor cursor = table.find(doc);

            System.out.println("Name: " + name);
            if (cursor.hasNext()) {
                while (cursor.hasNext()) {
                    System.out.println("Score: " + cursor.next().get("score") + "\n");
                    System.out.println();
                }
            } else {
                System.out.println("Sorry couldn't find who you were looking for!");
            }

        } catch (Exception e) {
            System.out.println("Nice try lil boy, youngboy better!");
        }
    }

}