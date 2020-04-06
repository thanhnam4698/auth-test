package covidopen.OAuthServiceServer.model.mongo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="slhn_users")
public class User {
	 @Id
	 private String username;
	 private String password;
	 private String name;
	 private String phone;
	 private String access_token;
	 private String email;
	 private String address;
	 private List<Long> roles_id;
	 private int validateEmail;
	 private long lastVisitTime;
	 
	 public User(User user) {
        this.email = user.email;
        this.username = user.username;
        this.name = user.name;
        this.password = user.password;
        this.roles_id = user.roles_id;

     }
}
