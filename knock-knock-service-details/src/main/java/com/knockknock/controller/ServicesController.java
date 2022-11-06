package com.knockknock.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knockknock.model.ApplianceRepairs;
import com.knockknock.model.Electrician;
import com.knockknock.model.Plumber;
import com.knockknock.service.ServicesService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class ServicesController {
	
	@Autowired
	ServicesService servicesService;
	
	@GetMapping("/plumbers")
	public List<Plumber> getPlumbers() {
		List<Plumber> plumbers=new ArrayList<Plumber>();
		plumbers=servicesService.fetchPlumberList();
		System.out.println(plumbers);
		return plumbers;
	}
	@GetMapping("/electricians")
	public List<Electrician> getElectricians() {
		List<Electrician> electricians=new ArrayList<Electrician>();
		electricians=servicesService.fetchELectricianList();
		System.out.println(electricians);
		return electricians;
	}
	
	@GetMapping("/appliancerepairs")
	public List<ApplianceRepairs> getApplianceRepairs() {
		List<ApplianceRepairs> applianceRepairs=new ArrayList<ApplianceRepairs>();
		applianceRepairs=servicesService.fetchApplianceRepairsList();
		System.out.println(applianceRepairs);
		return applianceRepairs;
	}

}