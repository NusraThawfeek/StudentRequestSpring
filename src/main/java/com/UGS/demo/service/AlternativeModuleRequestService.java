package com.UGS.demo.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.UGS.demo.entity.AlternativeModuleRequest;
import com.UGS.demo.entity.LateChanges;
import com.UGS.demo.entity.Module1;
import com.UGS.demo.entity.ModuleDiscontinue;
import com.UGS.demo.repository.AlternativeModuleRequestRepository;
import com.UGS.demo.repository.ModuleDiscontinueRepository;

@Service
public class AlternativeModuleRequestService {
	
@Autowired	
private AlternativeModuleRequestRepository repo;

@Autowired
private ModuleService moduleService;

@Autowired
private ModuleDiscontinueRepository ModuleDiscontinueRepository;

@Autowired
private StudentReqService sservice;

public void submitAlternativemoduleRequest(String annex, String[] discontinueMcode,
		String[] currentGrade, String comment) {
	// TODO Auto-generated method stub
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date enteredDate = new Date();

	AlternativeModuleRequest req= new AlternativeModuleRequest(annex, enteredDate,"",false,"Alternative",comment);
	repo.save(req);
	
	List<ModuleDiscontinue> ModuleDiscontinueList = new ArrayList();

	for (int i = 0; i < discontinueMcode.length; i++) {
//		public ModuleDiscontinue(AlternativeModuleRequest alterModuleRequest, Module1 module,
//				String alterMcode, String offeringSem, String currentGrade) 
		 ModuleDiscontinue MdDs = new ModuleDiscontinue (req, moduleService.getModuleById(discontinueMcode[i]),"","",
				currentGrade[i]);

		 ModuleDiscontinueList.add(MdDs);
	}
	ModuleDiscontinueRepository.saveAll(ModuleDiscontinueList);
	sservice.sendmail(req);
}

public List<AlternativeModuleRequest> getAllRequest() {

	return null;
}

public AlternativeModuleRequest getModuleDiscontinue(int rid) {
	// TODO Auto-generated method stub
	
	return repo.findById(rid).orElse(null);
}

public List<AlternativeModuleRequest> pastAlternativeModuleRequest(int sid) {
	// TODO Auto-generated method stub
	return null;
}

public String updateRequest(int rid, String decision, String[] alterMcode, String[] offeringSem) {
	// TODO Auto-generated method stub
	return null;
}
}
