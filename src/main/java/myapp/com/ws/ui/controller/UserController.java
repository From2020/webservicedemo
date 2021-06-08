package myapp.com.ws.ui.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import myapp.com.ws.service.UserService;
import myapp.com.ws.shared.dto.UserDto;
import myapp.com.ws.ui.model.request.UserDetailRequestModle;
import myapp.com.ws.ui.model.response.OperationStatusModel;
import myapp.com.ws.ui.model.response.RequestOperationName;
import myapp.com.ws.ui.model.response.RequestOperationStatus;
import myapp.com.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(path="/{id}",produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public UserRest getUser(@PathVariable String id) {
		UserRest returnValue = new UserRest();
		UserDto userDto = userService.findUserByXposition(id);
		BeanUtils.copyProperties(userDto, returnValue);
		String opid = userService.findOpid(userDto.getXposition());
		returnValue.setXopid(opid);
		return returnValue;
	}
	
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public UserRest createUser(@RequestBody UserDetailRequestModle UserDetail) {
		UserRest returnRespons = new UserRest();
		UserDto useDto = new UserDto();
		
		BeanUtils.copyProperties(UserDetail, useDto);
		UserDto createUser = userService.createUser(useDto);
		BeanUtils.copyProperties(createUser, returnRespons);
		
		return returnRespons;
	}
	
	@PutMapping(path="/{id}",produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public UserRest updateUser(@PathVariable String id, @RequestBody UserDetailRequestModle UserDetail) {
		UserRest returnRespons = new UserRest();
		UserDto useDto = new UserDto();
		
		BeanUtils.copyProperties(UserDetail, useDto);
		UserDto updatedUser = userService.updateUser(id,useDto);
		BeanUtils.copyProperties(updatedUser, returnRespons);
		
		return returnRespons;
	}
	
	@DeleteMapping(path="/{id}",produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public OperationStatusModel deleteUser(@PathVariable String id) {
		
		OperationStatusModel returnRespons = new OperationStatusModel();
		returnRespons.setOperationName(RequestOperationName.DELETE.name());
		userService.delateaUser(id); 
		returnRespons.setOperationResult(RequestOperationStatus.SUCCESS.name());
		return returnRespons;
	}
	
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<UserRest> getUsers(@RequestParam(value="page",defaultValue = "0") int page,
			@RequestParam(value="limit",defaultValue = "2") int limit
			)
	{
		List<UserRest> returnValue = new ArrayList<>();
		
		List<UserDto> users = userService.getUsers(page,limit);
		
		for(UserDto userDto:users) {
			UserRest userRest = new UserRest();
			BeanUtils.copyProperties(userDto, userRest);
			returnValue.add(userRest);
		}
		return returnValue;
		
		
	}
}
