package com.knockknock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Electrician {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String serviceMan;
	private Long contactNo;
	private Double rating;
	private String serviceAvailability;


	public Electrician() {
		
	}	
	

	public Electrician(String serviceMan, Long contactNo, Double rating, String serviceAvailability) {
		this.serviceMan = serviceMan;
		this.contactNo = contactNo;
		this.rating = rating;
		this.serviceAvailability = serviceAvailability;
	}





	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getContactNo() {
		return contactNo;
	}


	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}


	public Double getRating() {
		return rating;
	}


	public void setRating(Double rating) {
		this.rating = rating;
	}


	public String getServiceAvailability() {
		return serviceAvailability;
	}


	public void setServiceAvailability(String serviceAvailability) {
		this.serviceAvailability = serviceAvailability;
	}


	public String getServiceMan() {
		return serviceMan;
	}


	public void setServiceMan(String serviceMan) {
		this.serviceMan = serviceMan;
	}


	@Override
	public String toString() {
		return "Electrician [id=" + id + ", contactNo=" + contactNo + ", rating=" + rating + ", serviceAvailability="
				+ serviceAvailability + "]";
	}



}
