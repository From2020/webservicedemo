package myapp.com.ws.service;


import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import myapp.com.ws.shared.dto.UserDto;


public interface UserService extends UserDetailsService {
	
	public UserDto createUser(UserDto userDto);

	UserDetails loadUserByUsername(String args) throws UsernameNotFoundException;
	
	public UserDto getUser(String email);
	
	public UserDto findUserByXposition(String eid);
	
	public String findOpid(String xposition);
	
	public UserDto updateUser(String eid,UserDto userDto);
	
	void delateaUser(String id);
	
	List<UserDto> getUsers(int page,int limit);
	
}
