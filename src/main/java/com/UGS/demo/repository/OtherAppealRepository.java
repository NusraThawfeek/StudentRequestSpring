package com.UGS.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UGS.demo.entity.OtherAppeal;



public interface OtherAppealRepository extends JpaRepository<OtherAppeal, Integer> {

	//List<OtherAppeal> findByStd(Student std);
}
