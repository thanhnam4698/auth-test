package covidopen.OAuthServiceServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableEurekaClient
@SpringBootApplication
public class OAuthServiceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuthServiceServerApplication.class, args);
	}

}
