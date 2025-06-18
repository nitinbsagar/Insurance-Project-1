package com.example.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.DriverLicense;
import com.example.exceptionclass.DriverIdNotFoundException;
import com.example.service.DriverLicensService;

@RestController
public class DriverLicenseRestcontroller {
	@Autowired
	private DriverLicensService driverLicensService;
	
	@PostMapping("/saveDriverDetails")
	public DriverLicense saveDriverDetails(@RequestBody DriverLicense driverLicense) {
	    return driverLicensService.SaveDriverDetails(driverLicense);
	}
	@GetMapping("/getDriverDetailsByid/{id}")
	public DriverLicense getDriverDetailsByid(@PathVariable("id")Integer id) {
		DriverLicense id1 = driverLicensService.getDriverLicenseById(id);
		return id1;
	}
	@DeleteMapping("/deleteDriverLicensebyid/{id}")
	public String deleteDriverLicensebyid(@PathVariable("id")Integer id)throws Exception {
		
		driverLicensService.deleteDriverDetails(id);
		
		return "Selected Driver License Details Deleted";
		
		
		
	}

}
