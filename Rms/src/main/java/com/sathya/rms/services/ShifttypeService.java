package com.sathya.rms.services;

import com.sathya.rms.entities.Shifttype;

public interface ShifttypeService {

	Iterable<Shifttype> findAll();

	Shifttype addShifttype(Shifttype shift);

	Shifttype updateShift(Shifttype shift);

	void deleteShift(Integer id);	
	

}
