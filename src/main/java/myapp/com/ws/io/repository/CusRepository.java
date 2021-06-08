package myapp.com.ws.io.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import myapp.com.ws.io.entity.Cacus;

public interface  CusRepository extends PagingAndSortingRepository<Cacus, String> {
	
    @Query(value="select * from cacus where xsp=?1 or xfm=?1 or xrsm=?1" , nativeQuery = true)	
	List<Cacus> findCustomer(String xopid);
    
    Cacus findByXcus(String xcus);
}
