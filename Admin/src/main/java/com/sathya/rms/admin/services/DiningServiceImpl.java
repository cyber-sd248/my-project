package com.sathya.rms.admin.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.DiningRepository;
import com.sathya.rms.admin.entities.Dining;

@Service
public class DiningServiceImpl implements DiningService{
	
	@Autowired 
	DiningRepository diningRepository;
	@Transactional
	@Override
	public Dining addDining(Dining dining) {
		return diningRepository.save(dining);
	}

	@Override
	public Iterable<Dining> findAll() {		
		return diningRepository.findAll();
	}

    @Transactional
	@Override
	public Dining updateDining(Dining dining) {
		return diningRepository.save(dining);
	}

    @Transactional
	@Override
	public void deleteDining(Integer id) {
		diningRepository.deleteById(id);
		
	}

	
}
