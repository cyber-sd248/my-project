package com.sathya.rms.admin.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.CityRepository;
import com.sathya.rms.admin.entities.City;

@Service
public class CityServiceImpl implements CityService {
     
	@Autowired
	 CityRepository cityRepository;

	@Override
	public Iterable<City> findAll() {
		return cityRepository.findAll();
	}
	
	@Transactional
	@Override
	public City addCity(City city) {
		return cityRepository.save(city);
	}
	
	@Transactional
	@Override
	public City updateCity(City city) {
		return cityRepository.save(city);
	}
	
	@Transactional
	@Override
	public void deleteCity(Integer id) {
		cityRepository.deleteById(id);
	}
	
}
