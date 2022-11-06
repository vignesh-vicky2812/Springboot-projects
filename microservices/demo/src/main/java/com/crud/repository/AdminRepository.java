package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.Admin;


public interface AdminRepository extends JpaRepository<Admin, Integer> {

	public Admin findByEmailIdAndPassword(String email, String password);

}
