package myapp.com.ws.io.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import myapp.com.ws.io.entity.Opordheader;
import myapp.com.ws.shared.dto.OrderDto;




public interface OpordRepository extends PagingAndSortingRepository<Opordheader, String> {

	
	public Opordheader findByXordernum(String ordnum);
	
}
