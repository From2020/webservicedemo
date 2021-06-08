package myapp.com.ws.ui.controller;

import java.text.ParseException;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myapp.com.ws.io.entity.Cacus;
import myapp.com.ws.service.CusService;
import myapp.com.ws.service.OpordService;
import myapp.com.ws.service.OrderdetailService;
import myapp.com.ws.shared.dto.OrderDetailDTO;
import myapp.com.ws.shared.dto.OrderDto;
import myapp.com.ws.ui.model.request.OrderDetailRequsetModel;
import myapp.com.ws.ui.model.request.OrderRequestModel;
import myapp.com.ws.ui.model.response.OrderRest;

@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	OpordService orderservice;
	@Autowired
	OrderdetailService orderDetailService;
	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public OrderRest createUser(@RequestBody OrderRequestModel orderRequest) throws ParseException {
		OrderRest returnRespons = new OrderRest();
		OrderDto orderDto = new OrderDto();
		BeanUtils.copyProperties(orderRequest, orderDto);
		List<OrderDetailRequsetModel> detail = orderRequest.getOporddetailReqModel();
		BeanUtils.copyProperties(orderRequest, orderDto);
		OrderDto createOrder = orderservice.createOrder(orderDto);
		orderDetailService.createOrderDetail(detail,orderRequest.getXordernum());
		BeanUtils.copyProperties(createOrder, returnRespons);
		return returnRespons;
	}

}
