package covidopen.OAuthServiceServer.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import covidopen.OAuthServiceServer.model.mongo.User;

public interface UserRepository extends MongoRepository<User, Long> {
	Optional<User> findByUsername(String username);
}
