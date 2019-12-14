package com.sathya.rms.services;

import com.sathya.rms.entities.Empshift;

public interface EmpshiftService {

	Iterable<Empshift> findAll();

	Empshift addEmpshift(Empshift empshift);

	Empshift updateEmpshift(Empshift empshift);

	void deleteEmpshift(Integer id);
	
	
	
	

}
