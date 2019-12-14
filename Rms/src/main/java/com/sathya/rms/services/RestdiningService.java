package com.sathya.rms.services;

import com.sathya.rms.entities.Restdining;

public interface RestdiningService {

	Iterable<Restdining> findAll();

	Restdining addDining(Restdining restd);

	Restdining updateDining(Restdining restd);

	void deleteDining(Integer id);
	
	
	
	

}
