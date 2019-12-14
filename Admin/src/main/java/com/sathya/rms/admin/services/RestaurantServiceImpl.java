package com.sathya.rms.admin.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.RestaurantRepository;
import com.sathya.rms.admin.entities.Restaurant;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	RestaurantRepository restaurantRepo;

	@Override
	public Iterable<Restaurant> findAll() {
		
		return restaurantRepo.findAll();
	}
	
    @Transactional
	@Override
	public Restaurant addRestaurant(Restaurant restarnt) {
		
		return restaurantRepo.save(restarnt);
	}

	@Transactional
	@Override
	public Restaurant updateRestaurant(Restaurant restarnt) {
		
		return restaurantRepo.save(restarnt);
	}

	@Transactional
	@Override
	public void deleteRestaurant(Integer id) {
		
		restaurantRepo.deleteById(id);
	}
}
