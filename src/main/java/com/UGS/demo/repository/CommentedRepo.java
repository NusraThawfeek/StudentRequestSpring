package com.UGS.demo.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.UGS.demo.entity.Commented;
import com.UGS.demo.entity.CommentedKey;
import com.UGS.demo.entity.FACmember;
import com.UGS.demo.entity.StudentReq; 

@Repository
public interface CommentedRepo extends JpaRepository<Commented,CommentedKey>{


	List<Commented> findByrid(StudentReq rid);
	List<Commented> findByuid(FACmember uid);
	List<Commented> findByRidAndUid(StudentReq rid, FACmember uid);
	

	
//	List<Range> getRangeFromAndTo(String productId, String goodToUse);

	
}
