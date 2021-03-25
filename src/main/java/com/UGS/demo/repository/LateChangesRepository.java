package com.UGS.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UGS.demo.entity.LateChanges;
import com.UGS.demo.entity.LateChangesKey;

public interface LateChangesRepository extends JpaRepository<LateChanges, LateChangesKey> {

}
