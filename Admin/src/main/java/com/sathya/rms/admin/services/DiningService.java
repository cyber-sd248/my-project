package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.Dining;

public interface DiningService {

	
	Dining addDining(Dining dining);

	Iterable<Dining> findAll();

	Dining updateDining(Dining dining);

	void deleteDining(Integer id);
	
	

	

}
