package myapp.com.ws.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myapp.com.ws.io.entity.Cacus;
import myapp.com.ws.io.entity.Caitem;
import myapp.com.ws.io.repository.CusRepository;
import myapp.com.ws.io.repository.ItemRepository;
import myapp.com.ws.shared.dto.CusDto;
import myapp.com.ws.shared.dto.ItemDto;

@Service
public class ItemServiceImpl implements myapp.com.ws.service.ItemService {
	
	@Autowired
	ItemRepository itemRepository;

	@Override
	public List<ItemDto> findAllByZactive(String zactive) {
		List<ItemDto> returnValue = new ArrayList<>();

		List<Caitem> items = itemRepository.findAllByZactive("1");

		for (Caitem itemEntity : items) {
			ItemDto itemDto = new ItemDto();
			BeanUtils.copyProperties(itemEntity, itemDto);
			returnValue.add(itemDto);
		}

		return returnValue;
	}

}
