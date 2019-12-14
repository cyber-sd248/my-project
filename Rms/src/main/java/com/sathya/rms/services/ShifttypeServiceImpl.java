package com.sathya.rms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.ShifttypeRepository;
import com.sathya.rms.entities.Shifttype;

@Service
public class ShifttypeServiceImpl implements ShifttypeService {
	
	@Autowired
	ShifttypeRepository shifttypeRepository;

	@Override
	public Iterable<Shifttype> findAll() {
		
		return shifttypeRepository.findAll();
	}

	@Override
	public Shifttype addShifttype(Shifttype shift) {
		
		return shifttypeRepository.save(shift);
	}

	@Override
	public Shifttype updateShift(Shifttype shift) {
		
		return shifttypeRepository.save(shift);
	}

	@Override
	public void deleteShift(Integer id) {
		
		shifttypeRepository.deleteById(id);
		
	}

}
