package com.sathya.rms.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.EmpshiftRepository;
import com.sathya.rms.entities.Empshift;

@Service
public class EmpshiftServiceImpl implements EmpshiftService {
    
	@Autowired
	EmpshiftRepository empshiftRepository;

	@Override
	public Iterable<Empshift> findAll() {
		
		return empshiftRepository.findAll();
	}
    
	@Transactional
	@Override
	public Empshift addEmpshift(Empshift empshift) {
		
		return empshiftRepository.save(empshift);
	}
    
	@Transactional
	@Override
	public Empshift updateEmpshift(Empshift empshift) {
		
		return empshiftRepository.save(empshift);
	}
    
	@Transactional
	@Override
	public void deleteEmpshift(Integer id) {
		
		empshiftRepository.deleteById(id);
	}
}
