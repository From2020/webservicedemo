package myapp.com.ws.io.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import myapp.com.ws.io.entity.Xusers;

@Repository
public interface UserRepository extends PagingAndSortingRepository<Xusers, String> {

	@Query(value = "select top 1 a.* from xusers a join zbusiness b on a.zid=b.zid "
			+ "where a.zemail=?1", nativeQuery = true)
	public Xusers findByZemail(String zemail);

	@Transactional
	@Modifying
	@Query(value = "delete from xusers a join zbusiness b on a.zid=b.zid " + "where a.zemail=?1", nativeQuery = true)
	public void deleteByZemail(String zemail);

	@Query(value = "SELECT zemail FROM xusers where xrole=?1", nativeQuery = true)
	public String roleHasChild(String xrole);
	
	@Query(value="Select b.xopid from xusers a join pdmst b on  a.xposition=b.xposition where a.xposition=?1",nativeQuery = true)
	public String findOpid(String xposition);

	public Xusers findUserByXpositionAndZactive(String eid,String active);

	public Xusers deleteByXposition(String id);

	public Page<Xusers> findAll(Pageable pageable);

}