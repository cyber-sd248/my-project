package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.Designation;

public interface DesigService {

	Iterable<Designation> findAll();

	Designation addRole(Designation desig);

	Designation updateRole(Designation desig);

	void deleteRole(Integer id);
	
	
	
	

}
