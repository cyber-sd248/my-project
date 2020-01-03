package com.sathya.rms.admin.controllers;

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

import com.sathya.rms.admin.entities.Restaurant;
import com.sathya.rms.admin.services.RestaurantService;

@RestController
@RequestMapping(path="/restaurants")
@CrossOrigin
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;

	@GetMapping(path="/getAllRestaurants")
	public Iterable<Restaurant> getAllRestaurants() {
		return restaurantService.findAll();
	}

	@PostMapping(path="/addRestaurant")
	public Restaurant addRestaurant(@RequestBody Restaurant restarnt) {
		return restaurantService.addRestaurant(restarnt);
	}

	@PutMapping(path="/updateRestaurant")
	public Restaurant updateRestaurant(@RequestBody Restaurant restarnt) {
		return restaurantService.updateRestaurant(restarnt);
	}

	@DeleteMapping(path="/deleteRestaurant/{id}")
	public void deleteRestaurant(@PathVariable("id") Integer id) {
		restaurantService.deleteRestaurant(id);
	}
}
