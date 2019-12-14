package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.Restaurant;

public interface RestaurantService {

	Iterable<Restaurant> findAll();

	Restaurant addRestaurant(Restaurant restarnt);

	Restaurant updateRestaurant(Restaurant restarnt);

	void deleteRestaurant(Integer id);
	
}
