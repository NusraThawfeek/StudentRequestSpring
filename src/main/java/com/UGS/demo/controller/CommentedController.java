package com.UGS.demo.controller;

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

import com.UGS.demo.entity.Commented;
import com.UGS.demo.entity.CommentedKey;
import com.UGS.demo.entity.FACmember;
import com.UGS.demo.entity.StudentReq;
import com.UGS.demo.repository.CommentedRepo;

@RestController
public class CommentedController {

	@Autowired
	CommentedRepo crepo;
	
	@CrossOrigin("http://localhost:3000")
	
	@GetMapping("/Commented")
	public  List<Commented> getComments() {
	
		return crepo.findAll();
	}
	
	@RequestMapping("/Commented/{cid}")
	@ResponseBody
	public Optional<Commented> getComment(@PathVariable CommentedKey cid) {
	
		return crepo.findById(cid);
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/Commented/Request/{rid}")
	public List<Commented> FindByReqId(@PathVariable StudentReq rid) {
		
		return crepo.findByrid(rid);
		
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/Commented/RequestbyUid/{uid}")
	public List<Commented> FindByReqId(@PathVariable FACmember uid) {
		
		return crepo.findByuid(uid);
		
	}
	
	

	@CrossOrigin("http://localhost:3000")
	@PostMapping("/Commented")
	public Commented addComment(@ModelAttribute Commented c) {
	
		crepo.save(c);
		return c;
	}
	
	@PutMapping("/Commented/update")
	public Commented updateComment(@ModelAttribute Commented c) {	
	
		crepo.save(c);
		return c;
	}
  	@DeleteMapping("/Commented/{cid }")
	public String deleteComment(@PathVariable CommentedKey cid) {
	
		Commented c =crepo.getOne(cid);
		crepo.delete(c);
		return "Deleted successfully";
	}
  	
  	@CrossOrigin("http://localhost:3000")
	@GetMapping("/Commented/RequestbyIds/{rid},{uid}")
	public List<Commented> FindIds(@PathVariable(value="rid") StudentReq rid,@PathVariable(value="uid") FACmember uid) {
		
		return crepo.findByRidAndUid(rid,uid);
		
	}
	

	
}
