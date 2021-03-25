package com.UGS.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UGS.demo.entity.AlternativeModuleRequest;
import com.UGS.demo.entity.ModuleDiscontinue;
import com.UGS.demo.entity.ModuleDiscontinueKey;



public interface ModuleDiscontinueRepository extends JpaRepository<ModuleDiscontinue, ModuleDiscontinueKey> {

	List<ModuleDiscontinue> findByAlterModuleRequest(AlternativeModuleRequest alterModuleRequest);
}
