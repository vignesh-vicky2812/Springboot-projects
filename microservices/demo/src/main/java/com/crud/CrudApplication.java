package com.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.crud.model.Admin;
import com.crud.repository.AdminRepository;



@SpringBootApplication
public class CrudApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
}
@Component
class DemoCommandLineRunner implements CommandLineRunner
{

	@Autowired
	private  AdminRepository ad;
	@Override
	public void run(String... args) throws Exception 
	{
		Admin adm=new Admin();
		adm.setEmailId("admin");
		adm.setPassword("admin");
		ad.save(adm);
	}
}