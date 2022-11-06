package com.knockknock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knockknock.exception.CredentialsMismatchException;
import com.knockknock.exception.UserAlreadyExistsException;
import com.knockknock.exception.UserNotFoundException;
import com.knockknock.model.User;
import com.knockknock.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class UserController {
	
	String name;

	@Autowired
	private UserService userService;

	@PostMapping("/registeruser")
	public User registerUser(@RequestBody User user) {
		String tempEmailId=user.getEmailId();
		if(tempEmailId !=null && !"".equals(tempEmailId)) {
			User userobj=userService.fetchUserByEmailId(tempEmailId);
			if(userobj !=null) {
				throw new UserAlreadyExistsException("User with "+tempEmailId+ " is already exists");
			}
		}
		User userObj=null;
		userObj=userService.saveUser(user);
		return userObj;	
	}

	@PostMapping("/login")
	public User loginUser(@RequestBody User user) {
		String tempEmailId	=user.getEmailId();
		String tempPass		=user.getPassword();
		System.out.println(tempEmailId+" "+tempPass);
		User userObj=null;
		if(tempEmailId !=null && tempPass !=null) 
		{
			userObj=userService.fetchUserByEmailIdAndPassword(tempEmailId,tempPass);
			name=user.getFirstName();
		}
		if(userObj == null)
		{
			throw new CredentialsMismatchException("email and password mismatch ");
		}
		return userObj;
	}
	
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable int userId){
		System.out.println("hello");
		User user = userService.fetchUserById(userId);
		System.out.println("User asdasdsdas" +user);
		
		if(user == null){
			throw new UserNotFoundException("Customer id not found- "+userId);
		}
		
		return user;
	}
	@DeleteMapping("/users/{userId}")
	public User deleteUser(@PathVariable int userId){

		User user = userService.fetchUserById(userId);
		
		if(user == null){
			throw new UserNotFoundException("Customer id not found- "+userId);
		}
		userService.deleteUserById(userId);
		
		return user;
	}
	
}