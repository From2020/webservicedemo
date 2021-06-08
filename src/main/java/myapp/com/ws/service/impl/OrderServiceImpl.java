package myapp.com.ws.service.impl;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myapp.com.ws.io.entity.Cacus;
import myapp.com.ws.io.entity.Opordheader;
import myapp.com.ws.io.repository.CusRepository;
import myapp.com.ws.io.repository.OpordRepository;
import myapp.com.ws.service.OpordService;
import myapp.com.ws.shared.dto.OrderDto;


@Service
public class OrderServiceImpl implements OpordService {

	@Autowired
	OpordRepository oporderRepository;
	@Autowired
	CusRepository cusRepository;

	@Override
	public OrderDto createOrder(OrderDto orderDto) {

		if (oporderRepository.findByXordernum(orderDto.getXordernum()) != null)
			throw new RuntimeException("OrderNo Already Exists");

		Opordheader order = new Opordheader();	
		BeanUtils.copyProperties(orderDto, order);

		Cacus customer = cusRepository.findByXcus(orderDto.getXcus());
		LocalDateTime dateTime = LocalDateTime.parse(orderDto.getXdate());
        Date date = java.sql.Timestamp.valueOf(dateTime);
		order.setXdate(date);
		order.setXsp(customer.getXsp());
		order.setXfm(customer.getXfm());
		order.setXrsm(customer.getXrsm());
		order.setZid(100010);
		order.setXstatusord("Open");
		
		Opordheader storedOrder = oporderRepository.save(order);

		OrderDto returnValue = new OrderDto();
		BeanUtils.copyProperties(storedOrder, returnValue);

		return returnValue;
	}
}
