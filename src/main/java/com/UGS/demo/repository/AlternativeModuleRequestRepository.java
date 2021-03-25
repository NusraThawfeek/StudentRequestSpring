package com.UGS.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UGS.demo.entity.AlternativeModuleRequest;





public interface AlternativeModuleRequestRepository extends JpaRepository<AlternativeModuleRequest, Integer> {

	//List<AlternativeModuleRequest> findByStd(Student std);
}
