package com.crud.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.crud.model.Admin;

import com.crud.repository.*;

@Service
public class RegistrationServices {
	
	@Autowired
	private AdminRepository repo1;

	
	
	public Admin fetchAdminByEmailIdAndPassword(String email, String password) {
		return  repo1.findByEmailIdAndPassword(email, password);

	}



}