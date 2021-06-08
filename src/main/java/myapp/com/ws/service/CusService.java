package myapp.com.ws.service;

import java.util.List;

import myapp.com.ws.io.entity.Cacus;
import myapp.com.ws.shared.dto.CusDto;

public  interface CusService {
	List<CusDto> findCustomer(String xopid);
	Cacus findByXcus(String cacus);
}
