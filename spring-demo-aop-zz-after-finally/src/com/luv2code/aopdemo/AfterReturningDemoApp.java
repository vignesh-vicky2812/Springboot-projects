package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class AfterReturningDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from the spring container 
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		
		List<Account> theAccounts =theAccountDAO.findAccounts(false);
		
		System.out.println("\n\n Main program: AfterReturningDemoApp");
		
		System.out.println("-----");
		
		System.out.println(theAccounts);
			
		System.out.println("\n");
		
		//close the context
		context.close();
			
	}

}
