package com.sathya.rms.admin.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.DesigRepository;
import com.sathya.rms.admin.entities.Designation;

@Service
public class DesigServiceImpl implements DesigService {
   
	@Autowired
	 DesigRepository desigRepository;
	
	@Override
	public Iterable<Designation> findAll() {
		// TODO Auto-generated method stub
		return desigRepository.findAll();
	}
    
	@Transactional
	@Override
	public Designation addRole(Designation desig) {
		// TODO Auto-generated method stub
		return desigRepository.save(desig);
	}
    
	@Transactional
	@Override
	public Designation updateRole(Designation desig) {
		// TODO Auto-generated method stub
		return desigRepository.save(desig);
	}
    
	@Transactional
	@Override
	public void deleteRole(Integer id) {
		// TODO Auto-generated method stub
		desigRepository.deleteById(id);
	}

}
