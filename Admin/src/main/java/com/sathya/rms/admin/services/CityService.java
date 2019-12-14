package com.sathya.rms.admin.services;


import com.sathya.rms.admin.entities.City;

public interface CityService {
	
    public Iterable<City> findAll();
  
	public City addCity(City city);

	public City updateCity(City city);

	public void deleteCity(Integer id);
	
	public City addNewCity(City city);
}
