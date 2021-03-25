package com.UGS.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.UGS.demo.controller.MailController;
import com.UGS.demo.entity.FACmember;
import com.UGS.demo.entity.StudentReq;
import com.UGS.demo.repository.StudentReqRepo;

@Service
public class StudentReqService {

@Autowired
private StudentReqRepo Srepo;

@Autowired
private MailController mailController;
	
@Autowired
public StudentReqService(StudentReqRepo Srepo,MailController mailController) {
	this.Srepo=Srepo;
	this.mailController=mailController;
	
}


public  List<StudentReq> getStudentReqs() {
	
	return Srepo.findAll();
}

//public StudentReq postStudentReq(StudentReq c) {
//	
//	return Srepo.save(c);
//}

public Optional<StudentReq> getStudentReq( int rid) {
	
	return Srepo.findById(rid);
}
//public StudentReq updateStudentReq(StudentReq c) {
//	
//	return Srepo.save(c);
//	
//}
public void deleteStudentReq( int rid) {
	
	
	StudentReq c =Srepo.getOne(rid);
	Srepo.delete(c);
	
}


public List<StudentReq> getPastReq(FACmember uid) {
	// TODO Auto-generated method stub
	return Srepo.findByuid(uid);
}


public List<StudentReq> getNewReq(FACmember uid) {
	// TODO Auto-generated method stub
	return Srepo.findByuidnew(uid);
}


public void sendmail(StudentReq s) {
	mail(s);
	
}
public void mail(StudentReq s) {

	MultiValueMap<String, String> mMap = new LinkedMultiValueMap<>();
	mMap.add("emailTo", "nusra0408@gmail.com");
	mMap.add("emailFrom", "teamaliens.b18it@gmail.com");
	mMap.add("emailSubject", "New Request");

	
	mailController.sendmail(mMap);

} 




}
