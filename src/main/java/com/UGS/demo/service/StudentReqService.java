package com.UGS.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UGS.demo.entity.FACmember;
import com.UGS.demo.entity.StudentReq;
import com.UGS.demo.repository.StudentReqRepo;

@Service
public class StudentReqService {
	
private StudentReqRepo Srepo;
	
@Autowired
public StudentReqService(StudentReqRepo Srepo) {
	this.Srepo=Srepo;
}


public  List<StudentReq> getStudentReqs() {
	
	return Srepo.findAll();
}

public StudentReq getStudentReq(StudentReq c) {
	
	return Srepo.save(c);
}

public Optional<StudentReq> getStudentReq( int rid) {
	
	return Srepo.findById(rid);
}
public StudentReq updateStudentReq(StudentReq c) {
	
	return Srepo.save(c);
	
}
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




}
