package com.UGS.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UGS.demo.entity.LeaveRequest;




public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Integer> {
	
	//List<LeaveRequest> findByStd(Student std);
}

