package com.sathya.rms.admin.controllers;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.City;
import com.sathya.rms.admin.entities.Location;
import com.sathya.rms.admin.services.CityService;
import com.sathya.rms.admin.services.LocationService;

@RestController
@RequestMapping(path="/locations")
@CrossOrigin
public class LocationController {
	public static final Logger LOGGER=LogManager.getLogger(LocationController.class);	

	@Autowired
	public LocationService locService;
	
	@Autowired
	public CityService cityService;
	
	@GetMapping(path="/getAllLocations")
	public Iterable<Location> getAllLocations(){
		return locService.getAllLocations();
	}
	
	@PostMapping(path="/addLocation")
	public Location addLocation(@RequestBody Location loc) {
		LOGGER.info("addLocation method execution started");
		LOGGER.debug("Input data is {0}",loc);
		Location result=null;
		
		try {
		Optional<City> ct=cityService.findBycId(loc.getcId());
		loc.setCities(ct.get());
		if(ct.get()==null) throw new Exception("Invalid Location cId");
		
		result=locService.addLocation(loc);
		}catch(Exception e) {
			LOGGER.error("Exception happends and Exception is",e);
		}
		LOGGER.info("addLocation method execution is completed");
		return result;
	}
	
	@PutMapping(path="/updateLocation")
	public Location updateLocation(@RequestBody Location loc) {
		return locService.updateLocation(loc);
	}
	
	@DeleteMapping(path="/deleteLocation/{id}")
	public void deleteLocation(@PathVariable("id") Integer id) {
		locService.deleteLocation(id);
	}
}

