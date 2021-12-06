import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoIterable;

public class DriverTest {

	public static void main(String[] args) {
//		"127.0.0.1" => localhost
		final String MongoDB_IP = "127.0.0.1";
		final String MongoDB_PORT = "27017";
		
//		����
//		MongoClient mongoClient = MongoClients.create();
		MongoClient mongoClient = 
				MongoClients.create("mongodb://"+MongoDB_IP+":"+MongoDB_PORT);
//		��� �о���̱�
		MongoIterable<String> databases = mongoClient.listDatabaseNames();
		
		for(String db : databases) {
			System.out.println(db);
		}
	}

}
