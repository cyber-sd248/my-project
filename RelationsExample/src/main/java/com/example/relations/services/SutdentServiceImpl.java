package com.example.relations.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relations.data.AddressRepository;
import com.example.relations.data.StudentRepository;
import com.example.relations.entities.Address;
import com.example.relations.entities.Student;

@Service
public class SutdentServiceImpl implements StudentService{
    
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
    @Transactional
	public Student addStudent(Student student) {
    	
    	List<Address> list=student.getAddresses();
    	for(Address a:list) {
    		a.setStudent(student);
    	}    		
		return studentRepository.save(student);
	}
    
 }
