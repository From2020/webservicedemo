package myapp.com.ws.service;

import java.util.List;

import org.springframework.stereotype.Service;

import myapp.com.ws.io.repository.OpdoorderDetailRepository;
import myapp.com.ws.shared.dto.OrderDetailDTO;
import myapp.com.ws.shared.dto.OrderDto;
import myapp.com.ws.ui.model.request.OrderDetailRequsetModel;

@Service
public interface OrderdetailService {
	public List<OrderDetailRequsetModel>  createOrderDetail(List<OrderDetailRequsetModel> orderdetail,String dornum);
}
