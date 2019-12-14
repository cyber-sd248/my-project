package com.sathya.rms.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.Location;
import com.sathya.rms.admin.services.LocationService;

@RestController
@RequestMapping(path="/locations")
public class LocationController {

	@Autowired
	public LocationService locService;
	
	@GetMapping(path="/getAllLocations")
	public Iterable<Location> getAllLocations(){
		return locService.getAllLocations();
	}
	
	@PostMapping(path="/addLocation")
	public Location addLocation(@RequestBody Location loc) {
		return locService.addLocation(loc);
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

