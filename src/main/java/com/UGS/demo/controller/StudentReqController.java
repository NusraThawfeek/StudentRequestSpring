package com.UGS.demo.controller;

import java.awt.print.Printable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.UGS.demo.entity.FACmember;
import com.UGS.demo.entity.StudentReq;
import com.UGS.demo.repository.StudentReqRepo;
import com.UGS.demo.service.StudentReqService;

@RestController
public class StudentReqController {

	
	@Autowired
	StudentReqService sservice;
	
	@CrossOrigin(origins = "http://localhost:3000" )
	@GetMapping("/StudentReq")
	public  List<StudentReq> getStudentReqs() {
	
		return sservice.getStudentReqs();
	}
	
	@RequestMapping("/StudentReq/{rid}")
	@ResponseBody
	public Optional<StudentReq> getStudentReq(@PathVariable int rid) {
	
		return sservice.getStudentReq(rid);
	}
	
	@CrossOrigin(origins = "http://localhost:3000" )
	@GetMapping("/PastReq/{uid}")
	public List<StudentReq> getPastReq(@PathVariable FACmember uid) {
		
		return sservice.getPastReq(uid);
	}
	
	@CrossOrigin(origins = "http://localhost:3000" )
	@GetMapping("/NewReq/{uid}")
	public List<StudentReq> getNewReq(@PathVariable FACmember uid) {
		
		return sservice.getNewReq(uid);
	}
	
	
	
	
	@PostMapping("/StudentReq")
	public StudentReq getStudentReq( @ModelAttribute StudentReq c) {
	
		sservice.getStudentReq(c);
		return c;
	}
	
	@PutMapping("/StudentReq")
	public StudentReq updateStudentReq(@ModelAttribute StudentReq c) {
	
		sservice.updateStudentReq(c);
		return c;
	}
	
	@DeleteMapping("/StudentReq/{rid}")
	public String deleteStudentReq(@PathVariable int rid) {
	
		sservice.deleteStudentReq(rid);
		return "Deleted successfully";
	}
	
	
	
}
