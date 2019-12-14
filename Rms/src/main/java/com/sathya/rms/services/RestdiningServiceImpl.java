package com.sathya.rms.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.RestdiningRepository;
import com.sathya.rms.entities.Restdining;

@Service
public class RestdiningServiceImpl implements RestdiningService {


	@Autowired
	RestdiningRepository restdiningRepo;

	@Override
	public Iterable<Restdining> findAll() {

		return restdiningRepo.findAll();
	}
    
	@Transactional
	@Override
	public Restdining addDining(Restdining restd) {

		return restdiningRepo.save(restd);
	}
    
	@Transactional
	@Override
	public Restdining updateDining(Restdining restd) {

		return restdiningRepo.save(restd);
	}
    
	@Transactional
	@Override
	public void deleteDining(Integer id) {

		restdiningRepo.deleteById(id);
	}
}
