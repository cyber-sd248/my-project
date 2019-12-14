package com.sathya.rms.services;

import com.sathya.rms.entities.Employee;

public interface EmployeeService {

	Iterable<Employee> findAll();

	Employee addEmployee(Employee emp);

	Employee updateEmployee(Employee emp);

	void deleteEmployee(Integer id);
	
	
	
	

}
