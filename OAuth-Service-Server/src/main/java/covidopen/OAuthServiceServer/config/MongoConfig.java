package covidopen.OAuthServiceServer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoConfig {

	private String host = "127.0.0.1";
	private int port = 27017;
	private String database = "slhn_user";
	
	private String connectionString = "mongodb://root:root@"+host+":" + port + "/" + database;
	public @Bean MongoClient mongoClient() {
		return MongoClients.create(connectionString);
	}
	
	public @Bean MongoTemplate mongoTemplate() {
		return new MongoTemplate(mongoClient(), database);
	}
}
