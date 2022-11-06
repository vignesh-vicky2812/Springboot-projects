package com.knockknock.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knockknock.model.User;
import com.knockknock.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;

	public User fetchUserByEmailId(String tempEmailId) {
		return userRepo.findByEmailId(tempEmailId);
	}

	public User saveUser(User user) {
		return userRepo.save(user);
	}

	public User fetchUserByEmailIdAndPassword(String tempEmailId, String tempPass) {
		return userRepo.findByEmailIdAndPassword(tempEmailId, tempPass);
	}

	public User fetchUserById(int userId) {
		return userRepo.findById(userId);
	}

	public void deleteUserById(int userId) {
		userRepo.deleteById(userId);
		
	}	

}