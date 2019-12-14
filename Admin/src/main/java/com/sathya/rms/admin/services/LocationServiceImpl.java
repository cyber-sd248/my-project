package com.sathya.rms.admin.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.LocationRepository;
import com.sathya.rms.admin.entities.Location;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	public LocationRepository locRepository;

	@Override
	public Iterable<Location> getAllLocations(){
		
		return locRepository.findAll();
	}
    
	@Transactional
	@Override
	public Location addLocation(Location loc) {
		
		return locRepository.save(loc);
	}
    @Transactional
	@Override
	public Location updateLocation(Location loc) {
    	
		return locRepository.save(loc);
	}

    @Transactional
	@Override
	public void deleteLocation(Integer id) {
		
    	locRepository.deleteById(id);	
	}
}
