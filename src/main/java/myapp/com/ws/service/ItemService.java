package myapp.com.ws.service;

import java.util.List;

import myapp.com.ws.shared.dto.ItemDto;

public interface ItemService {
	List<ItemDto> findAllByZactive(String zactive);
}
