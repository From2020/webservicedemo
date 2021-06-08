package myapp.com.ws.ui.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import myapp.com.ws.service.ItemService;
import myapp.com.ws.service.UserService;
import myapp.com.ws.shared.dto.ItemDto;
import myapp.com.ws.shared.dto.UserDto;
import myapp.com.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("item")
public class ItemController {
	@Autowired
	ItemService ItemDto;

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<ItemDto> getItem() {
		List<ItemDto> returnValue = new ArrayList<>();

		returnValue = ItemDto.findAllByZactive("1");

//		for(ItemDto itemDto:items) {
//			UserRest userRest = new UserRest();
//			BeanUtils.copyProperties(userDto, userRest);
//			returnValue.add(userRest);
//		}
		return returnValue;

	}

}
