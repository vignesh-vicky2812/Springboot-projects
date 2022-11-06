package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Admin;

public class LoginController {

	
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")

	public void loginAdmin(@RequestBody Admin admin) throws Exception {
	String username	= admin.getUsername();
	String password		=admin.getPassword();
	System.out.println(username);
	System.out.println(password);
	

	
}
}
