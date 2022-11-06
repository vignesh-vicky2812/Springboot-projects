package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from the spring container 
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		//get membership bean from spring container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
		
		//call the business method
		Account myAccount = new Account();
		myAccount.setName("vignesh");
		myAccount.setLevel("Platinum");
		theAccountDAO.addAccount(myAccount, true);
		
		theAccountDAO.doWork();
		
		//call the accountDao getter/setter method
		theAccountDAO.setName("foobar");
		theAccountDAO.setServiceCode("silver");
		
		String name=theAccountDAO.getName();
		String serviceCode =theAccountDAO.getServiceCode();
		
		//call the membership business method
		theMembershipDAO.addSillyMember();  
		theMembershipDAO.goToSleep();  
		
		
		//close the context
		context.close();
			
	}

}