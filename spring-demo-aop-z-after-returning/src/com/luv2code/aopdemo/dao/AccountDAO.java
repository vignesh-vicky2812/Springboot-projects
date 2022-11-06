package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	private String name,serviceCode;
	
	public List<Account> findAccounts() {
		List<Account> myAccounts=new ArrayList<>();
		
		myAccounts.add(new Account("John","Silver"));

		myAccounts.add(new Account("Madhu","Platinum"));

		myAccounts.add(new Account("Luca","Gold"));
		
		return myAccounts;
	}
	
	public void addAccount(Account theAccount, boolean vipFlag) {
		
		System.out.println(getClass()+": Doing MY DB WORK: ADDING AN ACOUNT");
	}
	public boolean doWork() {
		System.out.println((getClass()+": dowork()"));
		return false;
	}
	public String getName() {
		System.out.println((getClass()+": in getName()"));
		return name;
	}
	public void setName(String name) {
		System.out.println((getClass()+": in setName()"));
		this.name = name;
	}
	public String getServiceCode() {
		System.out.println((getClass()+": in getServiceCode()"));
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		System.out.println((getClass()+": in setServiceCode()"));
		this.serviceCode = serviceCode;
	}
}
