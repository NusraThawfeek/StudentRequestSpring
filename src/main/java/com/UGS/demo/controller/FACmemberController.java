package com.UGS.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.UGS.demo.repository.FACmemberRepo;

@RestController
public class FACmemberController {

	@Autowired
	FACmemberRepo frepo;
	
	
	@GetMapping("/FACmember")
	public  List<FACmember> getFACmembers() {
	
		return frepo.findAll();
	}
	
	@RequestMapping("/FACmember/{uid}")
	@ResponseBody
	public Optional<FACmember> getFACmember(@PathVariable int uid) {
	
		return frepo.findById(uid);
	}
	

	@PostMapping("/FACmember")
	public FACmember getComment(@ModelAttribute FACmember c) {
	
		frepo.save(c);
		return c;
	}
	
	
	@PutMapping("/FACmember")
	public FACmember updateComment(@ModelAttribute FACmember c) {
	
		frepo.save(c);
		return c;
	}
	
	@DeleteMapping("/FACmember/{uid}")
	public String deleteComment(@PathVariable int uid) {
	
		FACmember c =frepo.getOne(uid);
		frepo.delete(c);
		return "Deleted successfully";
	}
	
	
}
