package smf.server.mongodb;

/**
 * Created by OPERMAN Timoty on 03/05/2017.
 */
import com.mongodb.*;

import java.net.UnknownHostException;

public class MongoDBHelloWorld {
    public static void main(String[] args) {

            //
            // Creates a new instance of MongoDBClient and connect to localhost
            // port 27017.
            //
            MongoClient client = new MongoClient(
                    new ServerAddress("localhost", 27017));

            //
            // Gets the peopledb from the MongoDB instance.
            //
            DB database = client.getDB("test");

            //
            // Gets the persons collections from the database.
            //
            DBCollection collection = database.getCollection("docs");

            //
            // Gets a single document / object from this collection.
            //
            DBObject document = collection.findOne();

            //
            // Prints out the document.
            //
            System.out.println(document);

    }
}
