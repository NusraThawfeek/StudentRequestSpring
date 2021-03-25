package com.UGS.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.UGS.demo.entity.FACmember;
import com.UGS.demo.entity.StudentReq;
import com.google.common.base.Optional;

import io.swagger.annotations.ApiParam;

@Repository
public interface StudentReqRepo extends JpaRepository<StudentReq, Integer> {
	
	
	
	@Query(value = "SELECT *,0 AS clazz_ \r\n"
			+ " FROM student_req r, commented c\r\n"
			+ " WHERE  r.rid=c.rid and c.uid=:uid", nativeQuery = true)
	List<StudentReq> findByuid(@Param("uid") FACmember uid);
	
	@Query(value = " SELECT distinct(r.rid),r.current_status,r.entereddatetime,r.is_send_to_fac_board,r.annex_path,r.type,0 AS clazz_ \r\n"
			+ "FROM student_req r\r\n"
			+ "	WHERE  r.rid not in(SELECT r.rid\r\n"
			+ "	FROM student_req r, commented c\r\n"
			+ "	WHERE  r.rid=c.rid and c.uid=:uid)", nativeQuery = true)
	List<StudentReq> findByuidnew(@Param("uid") FACmember uid);
		

}
