package myapp.com.ws.ui.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import myapp.com.ws.io.entity.Cacus;
import myapp.com.ws.io.entity.Xusers;
import myapp.com.ws.service.CusService;
import myapp.com.ws.service.UserService;
import myapp.com.ws.shared.dto.CusDto;
import myapp.com.ws.shared.dto.UserDto;
import myapp.com.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("customer")
public class CusController {
	@Autowired
	CusService cusService;

	@GetMapping(path = "/{id}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public List<CusDto> getCustomer(@PathVariable String id) {
		System.out.println("customer called");

		List<CusDto> returnValue = new ArrayList<>();

		 returnValue = cusService.findCustomer(id);

//		for (CusDto userDto : users) {
//			CusDto userRest = new CusDto();
//			BeanUtils.copyProperties(userDto, userRest);
//			returnValue.add(userRest);
//		}
		System.out.println(returnValue.size() +" size");
		return returnValue;

	}
}
