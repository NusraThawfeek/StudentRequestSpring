package com.UGS.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UGS.demo.entity.Module1;
import com.UGS.demo.service.ModuleService;




@RestController
@CrossOrigin(origins = "*")
public class ModuleController {
	@Autowired
	private ModuleService service;
	
	@PostMapping("/addmodule")
	public Module1 addModule(@ModelAttribute Module1 module) {
		return service.postModule(module);
	}
}
