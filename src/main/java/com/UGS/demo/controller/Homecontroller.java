package com.UGS.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
}
