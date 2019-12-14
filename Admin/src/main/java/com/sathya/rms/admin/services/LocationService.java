package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.Location;

public interface LocationService {

	
	Iterable<Location> getAllLocations();
	
	Location addLocation(Location loc);

	Location updateLocation(Location loc);

	void deleteLocation(Integer id);

	

}
