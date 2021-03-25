package com.UGS.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.UGS.demo.entity.LeaveRequest;
import com.UGS.demo.service.LeaveRequestService;



@RestController
@CrossOrigin(origins = "*")
public class LeaveRequestController {

	@Autowired
	private LeaveRequestService service;
	
	@PostMapping("/request/leaverequest")
	public LeaveRequest submitLeaveRequest( @RequestParam String leaveType, @RequestParam String on, @RequestParam Date from, @RequestParam Date to, 
			@RequestParam int localWeeks, @RequestParam int localDays, @RequestParam int overseasWeeks, @RequestParam int overseasDays, 
			@RequestParam int totalWeeks, @RequestParam int totalDays, @RequestParam int semesterWeeks, @RequestParam int semesterDays,
			@RequestParam int vacationWeeks, @RequestParam int vacationDays, @RequestParam String reason, @RequestParam String annex) {
		
		return service.submitLeaveRequest(leaveType, on, from, to, localWeeks, localDays,
				 overseasWeeks, overseasDays, totalWeeks, totalDays, semesterWeeks, semesterDays,
				 vacationWeeks, vacationDays, reason, annex);
	}
	
	@GetMapping("/request/leaverequest/{rid}")
	public LeaveRequest pastRequest(@PathVariable int rid) {
		return service.getRequest(rid);
	}
	
	@GetMapping("/request/leaverequest")
	public List<LeaveRequest> getAllrequest(){
		return service.getAllRequest();
	}
	
//	@GetMapping("/pastrequest/leaverequest/{sid}")
//	public List<LeaveRequest> pastLeaveRequest(@PathVariable int sid) {
//		return service.pastLeaveRequest(sid);
//	}
	
	@PutMapping("/updateleaverequest")
	public LeaveRequest updateRequest(@RequestBody LeaveRequest request) {
		return service.updateRequest(request);
	}
}

