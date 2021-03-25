package com.UGS.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UGS.demo.controller.CommentedController;
import com.UGS.demo.entity.Commented;
import com.UGS.demo.entity.CommentedKey;
import com.UGS.demo.repository.CommentedRepo;
import com.UGS.demo.repository.StudentReqRepo;

@Service
public class CommentedService {
	
	@Autowired
	CommentedRepo crepo;
	

	@Autowired
	public CommentedService(CommentedRepo crepo) {
		this.crepo = crepo;
	}
	
	public Commented getComment(CommentedKey cid) {
		// TODO Auto-generated method stub
		return crepo.findById(cid).orElse(null);
	}

	public Commented updateComment(Commented c) {
		Commented comment=getComment(c.getCid());
		
		comment.setDescription(c.getDescription());
		
		comment.setEditedBy(c.getEditedBy());
		
		return crepo.save(comment);
		
	}

	
	}
	 
	
	
	

