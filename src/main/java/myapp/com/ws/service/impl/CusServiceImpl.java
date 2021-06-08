package myapp.com.ws.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import myapp.com.ws.io.entity.Cacus;
import myapp.com.ws.io.entity.Xusers;
import myapp.com.ws.io.repository.CusRepository;
import myapp.com.ws.io.repository.UserRepository;
import myapp.com.ws.service.CusService;
import myapp.com.ws.shared.dto.CusDto;
import myapp.com.ws.shared.dto.UserDto;

@Service
public class CusServiceImpl implements CusService {
	@Autowired
	CusRepository cusrepository;

	@Override
	public List<CusDto> findCustomer(String xopid) {
		List<CusDto> returnValue = new ArrayList<>();

		List<Cacus> customers = cusrepository.findCustomer(xopid);

		for (Cacus cusEntity : customers) {
			CusDto cusDto = new CusDto();
			BeanUtils.copyProperties(cusEntity, cusDto);
			returnValue.add(cusDto);
		}

		return returnValue;
	}

	@Override
	public Cacus findByXcus(String cacus) {
		return cusrepository.findByXcus(cacus);
	}

}
