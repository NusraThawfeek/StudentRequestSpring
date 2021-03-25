package com.UGS.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UGS.demo.entity.FACmember;
@Repository
public interface FACmemberRepo  extends JpaRepository<FACmember,Integer>{

}
