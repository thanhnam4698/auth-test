package covidopen.OAuthServiceServer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import covidopen.OAuthServiceServer.model.mongo.Role;

public interface RoleRepository extends MongoRepository<Role, Long> {

}
