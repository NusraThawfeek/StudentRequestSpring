package com.UGS.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UGS.demo.entity.LateModuleChangeRequest;



public interface LateModuleChangeRequestRepository extends JpaRepository<LateModuleChangeRequest, Integer> {

	//List<LateModuleChangeRequest> findByStd(Student std);
}
