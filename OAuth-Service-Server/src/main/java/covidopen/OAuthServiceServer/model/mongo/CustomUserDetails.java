package covidopen.OAuthServiceServer.model.mongo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import covidopen.OAuthServiceServer.service.RoleService;

public class CustomUserDetails extends User implements UserDetails{
	
	@Autowired
	private RoleService roleService;
	
	public CustomUserDetails(final User user) {
		super(user);
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities(){
		List<Role> listRole = new ArrayList<Role>();
		getRoles_id()
			.stream()
			.map(role_id -> listRole.add(roleService.getById(role_id)));
		return  listRole.stream()
						.map(role -> new SimpleGrantedAuthority("ROLE_" + role.getName()))
						.collect(Collectors.toList());
	}
	
	@Override
	public String getUsername() {
		return super.getUsername();
	}
	
	@Override
	public String getPassword() {
		return super.getPassword();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
