package com.sathya.rms.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.EmployeeRepository;
import com.sathya.rms.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Iterable<Employee> findAll() {

		return employeeRepository.findAll();
	}

	@Transactional
	@Override
	public Employee addEmployee(Employee emp) {

		return employeeRepository.save(emp);
	}

	@Transactional
	@Override
	public Employee updateEmployee(Employee emp) {

		return employeeRepository.save(emp);
	}

	@Transactional
	@Override
	public void deleteEmployee(Integer id) {

		employeeRepository.deleteById(id);
	}	

}
