package com.knockknock.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

public class ApplianceRepairs{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String applianceName;

	private Long contactNo;

	private Double rating;
	
	private String serviceAvailability;

	public ApplianceRepairs() {
		
	}

	public ApplianceRepairs(String applianceName, Long contactNo, Double rating, String serviceAvailability) {
		this.applianceName = applianceName;
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

	public String getApplianceName() {
		return applianceName;
	}

	public void setApplianceName(String applianceName) {
		this.applianceName = applianceName;
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

	@Override
	public String toString() {
		return "ApplianceRepairs [id=" + id + ", applianceName=" + applianceName + ", contactNo=" + contactNo
				+ ", rating=" + rating + ", serviceAvailability=" + serviceAvailability + "]";
	}
	
}
