package com.example.service;

import com.example.entity.DriverLicense;

public interface DriverLicensService {
	
	public  DriverLicense SaveDriverDetails(DriverLicense driverLicense);
	public  DriverLicense getDriverLicenseById(Integer id);
	public  void deleteDriverDetails(Integer id);
	

}
