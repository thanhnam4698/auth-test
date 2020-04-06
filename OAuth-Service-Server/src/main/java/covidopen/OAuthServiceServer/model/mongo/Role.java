package covidopen.OAuthServiceServer.model.mongo;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Role {
	@Id
	private String name;
}
