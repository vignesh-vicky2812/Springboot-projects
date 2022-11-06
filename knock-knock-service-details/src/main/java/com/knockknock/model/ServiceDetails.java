package com.knockknock.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class ServiceDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String customerName;
	private String customerEmail;
	private long customerMobileNo;
	private String city;
	private String address;
	private LocalDate date;
	private LocalTime timeSlot;
	
	
	public ServiceDetails() {
		
	}
	

	public ServiceDetails(String customerName, String customerEmail, long customerMobileNo, String city,
			String address, LocalDate date, LocalTime timeSlot) {
		//this.id = id;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerMobileNo = customerMobileNo;
		this.city = city;
		this.address = address;
		this.date = date;
		this.timeSlot = timeSlot;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public long getCustomerMobileNo() {
		return customerMobileNo;
	}

	public void setCustomerMobileNo(long customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(LocalTime timeSlot) {
		this.timeSlot = timeSlot;
	}


	@Override
	public String toString() {
		return "ServiceDetails [id=" + id + ", customerName=" + customerName + ", customerEmail=" + customerEmail
				+ ", customerMobileNo=" + customerMobileNo + ", city=" + city + ", address=" + address + ", date="
				+ date + ", timeSlot=" + timeSlot + "]";
	}
	
}