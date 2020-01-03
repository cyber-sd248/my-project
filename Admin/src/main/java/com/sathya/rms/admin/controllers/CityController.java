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
import com.sathya.rms.admin.entities.State;
import com.sathya.rms.admin.services.CityService;
import com.sathya.rms.admin.services.StateService;

@RestController
@RequestMapping(path="/cities")
@CrossOrigin
public class CityController {
	private static final Logger LOGGER_0=LogManager.getLogger(CityController.class);
	
	@Autowired
	CityService cityService;
	
	@Autowired
	StateService stateService;

	@GetMapping(path="/getAllCities")
		public Iterable<City> getAllCities() {
			return cityService.findAll();
	}
	
	@PostMapping(path="/addCity")
	 public City addCity(@RequestBody City city) {
		LOGGER_0.info("addCity method execution started");
		LOGGER_0.debug("input data is {0}",city);
		
		City result = null;
		try {
			Optional<State> ost=stateService.findByStId(city.getStId());
			
			if(ost.get()== null) throw new Exception("Invalid state id");
			city.setState(ost.get());
					result=cityService.addCity(city);
					LOGGER_0.debug("Result is {0}",result);
				}
		catch(Exception e) {
		LOGGER_0.error("Exception happend and exception is");	
		}
		LOGGER_0.info("getAllCities method execution completed");
		return result;
	}
	
	@PutMapping(path="/updateCity")
	public City updateCity(@RequestBody City city) {
		return cityService.updateCity(city);
	}
	
	@DeleteMapping(path="/deleteCity/{id}")
	public void deleteCity(@PathVariable("id") Integer id) {
	     cityService.deleteCity(id);
	}
	
	@PostMapping(path="/addNewCity")
	public City addNewCity(@RequestBody City city) {
		
	      Optional<State> state=stateService.findByStId(city.getStId());
		  city.setState(state.get());
	      return cityService.addNewCity(city);
	}

}
