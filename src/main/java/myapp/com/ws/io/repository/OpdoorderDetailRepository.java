package myapp.com.ws.io.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import myapp.com.ws.io.entity.Oporddetail;
import myapp.com.ws.io.entity.OporddetailPK;

public interface OpdoorderDetailRepository extends PagingAndSortingRepository<Oporddetail,OporddetailPK> {
	
}
