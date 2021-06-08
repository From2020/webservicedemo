package myapp.com.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myapp.com.ws.io.entity.Oporddetail;
import myapp.com.ws.io.entity.OporddetailPK;
import myapp.com.ws.io.repository.OpdoorderDetailRepository;
import myapp.com.ws.service.OrderdetailService;
import myapp.com.ws.ui.model.request.OrderDetailRequsetModel;

@Service
public class OrderdetailServiceImpl implements OrderdetailService {

	@Autowired
	OpdoorderDetailRepository opdoorderDetailRepository;

	@Override
	public List<OrderDetailRequsetModel> createOrderDetail(List<OrderDetailRequsetModel> orderdetail, String dornum) {
		Oporddetail orderentity = new Oporddetail();
		int rowindex = 0;
		for (OrderDetailRequsetModel i : orderdetail) {
			rowindex += 1;
			orderentity.setOporddetailPK(new OporddetailPK(100010, dornum, rowindex));
			orderentity.setXitem(i.getXitem());
			orderentity.setXqtyord(i.getXqtyord());
			orderentity.setXrate(i.getXrate());
			opdoorderDetailRepository.save(orderentity);

		}

		return null;
	}

}
