package covidopen.OAuthServiceServer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import covidopen.OAuthServiceServer.model.mongo.CustomUserDetails;
import covidopen.OAuthServiceServer.model.mongo.User;
import covidopen.OAuthServiceServer.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		Optional<User> userOptional = userRepository.findByUsername(username);
		userOptional.orElseThrow(() -> new UsernameNotFoundException("Username not found"));
		return userOptional.map(CustomUserDetails::new).get();
	}
}
