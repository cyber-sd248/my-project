package com.sathya.rms.admin.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entities.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {

}
