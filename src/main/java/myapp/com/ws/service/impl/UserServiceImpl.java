package myapp.com.ws.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import myapp.com.ws.io.entity.Xusers;
import myapp.com.ws.io.repository.UserRepository;
import myapp.com.ws.service.UserService;
import myapp.com.ws.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
//	@Autowired
//	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public UserDto createUser(UserDto userDto) {

		if (userRepository.findByZemail(userDto.getZemail()) != null)
			throw new RuntimeException("User Already Exists");

		Xusers xusers = new Xusers();
		BeanUtils.copyProperties(userDto, xusers);

		//xusers.setXpassword(bCryptPasswordEncoder.encode(userDto.getXpassword()));

		Xusers storeduser = userRepository.save(xusers);

		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storeduser, returnValue);

		return returnValue;
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Xusers xusers = userRepository.findByZemail(email);

		if (xusers == null)
			throw new UsernameNotFoundException(email);

		return new User(xusers.getXusersPK().getZemail(), xusers.getXpassword(), new ArrayList<>());

	}

	@Override
	public UserDto getUser(String email) {
		Xusers xusers = userRepository.findByZemail(email);
		if (xusers == null)
			throw new UsernameNotFoundException(email);
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(xusers, returnValue);
		return returnValue;
	}

	@Override
	public UserDto findUserByXposition(String eid) {
		Xusers xusers = userRepository.findUserByXpositionAndZactive(eid,"1");
		
		if (xusers == null)
			throw new UsernameNotFoundException(eid);
		UserDto returnValue = new UserDto();
		returnValue.setZemail(xusers.getXusersPK().getZemail());
		
		
		BeanUtils.copyProperties(xusers, returnValue);

		return returnValue;
	}

	@Override
	public UserDto updateUser(String eid, UserDto userDto) {
		Xusers xusers = userRepository.findUserByXpositionAndZactive(eid,"1");
		
		if (xusers == null)
			throw new UsernameNotFoundException(eid);
		
		xusers.setXname(userDto.getXname());
		xusers.setXname(userDto.getXname());
		
		Xusers updatedEntity =userRepository.save(xusers);
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(updatedEntity, returnValue);

		return returnValue;

	}

	@Override
	public void delateaUser(String id) {
		Xusers xusers = userRepository.findUserByXpositionAndZactive(id,"1");
		
		if (xusers == null)
			throw new UsernameNotFoundException("User id :"+id +" not found");
		
		
		userRepository.delete(xusers);
		
	}

	@Override
	public List<UserDto> getUsers(int page, int limit) {
		List<UserDto> returnValue = new ArrayList<>();
		
		if(page>0) page = page-1;
		
		Pageable pageableRequest =  (Pageable) PageRequest.of(page, limit);
		
		Page<Xusers> usersPage = userRepository.findAll(pageableRequest);
		List<Xusers> users = usersPage.getContent();
		
        for (Xusers userEntity : users) {
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(userEntity, userDto);
            returnValue.add(userDto);
        }
		
		return returnValue;
	}

	@Override
	public String findOpid(String xposition) {
		return userRepository.findOpid(xposition);
	}

}
