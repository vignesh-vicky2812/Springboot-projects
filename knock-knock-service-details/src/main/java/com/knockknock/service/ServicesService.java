package com.knockknock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knockknock.model.ApplianceRepairs;
import com.knockknock.model.Electrician;
import com.knockknock.model.Plumber;
import com.knockknock.repository.ApplianceRepairsRepository;
import com.knockknock.repository.ElectricianRepository;
import com.knockknock.repository.PlumberRepository;
import com.knockknock.repository.ServiceDetailsRepository;


@Service
public class ServicesService {
	
	@Autowired
	ApplianceRepairsRepository applianceRepairsRepo;

	@Autowired
	PlumberRepository plumberRepo;
	
	@Autowired
	ElectricianRepository electricianRepo;
	
	@Autowired
	ServiceDetailsRepository serviceDeRepo;
	
	public List<Plumber> fetchPlumberList() {
		return plumberRepo.findAll();
	}

	public List<Electrician> fetchELectricianList() {
		return electricianRepo.findAll();
	}

	public List<ApplianceRepairs> fetchApplianceRepairsList() {
		return applianceRepairsRepo.findAll();
	}
	

}
