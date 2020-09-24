package com.springboot.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogginController {

	
	@RequestMapping("/auth/register")
	public String index() {
		return "forward:index.html";
	}
}
