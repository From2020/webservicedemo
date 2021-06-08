package myapp.com.ws.io.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;


import myapp.com.ws.io.entity.Caitem;

public interface ItemRepository extends PagingAndSortingRepository<Caitem, String> {
	
	List<Caitem>  findAllByZactive(String zactive);

}
