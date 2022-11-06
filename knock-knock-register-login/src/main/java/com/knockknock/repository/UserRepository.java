package com.knockknock.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.knockknock.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByEmailId(String tempEmailId);

	public User findByEmailIdAndPassword(String tempEmailId, String tempPass);
	
	public User findById(int id);
	
}