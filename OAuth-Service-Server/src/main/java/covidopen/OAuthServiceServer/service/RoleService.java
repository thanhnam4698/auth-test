package covidopen.OAuthServiceServer.service;

import org.springframework.beans.factory.annotation.Autowired;

import covidopen.OAuthServiceServer.model.mongo.Role;
import covidopen.OAuthServiceServer.repository.RoleRepository;

public class RoleService {
	@Autowired
	private RoleRepository roleRepository;
	
	public Role getById(long id) {
		return roleRepository.findById(id).orElse(null);
	}
}
