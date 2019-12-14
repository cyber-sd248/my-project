package com.sathya.rms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entities.Employee;
import com.sathya.rms.services.EmployeeService;

@RestController
@RequestMapping(path="/employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping(path="/getAllEmployees")
	public Iterable<Employee> getAllEmployees() {
		return employeeService.findAll();
	}
    
	
	@PostMapping(path="/addEmployee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return employeeService.addEmployee(emp);
	}

	@PutMapping(path="/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmployee(emp);
	}

	@DeleteMapping(path="/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable("id") Integer id) {
		employeeService.deleteEmployee(id);
	}
}
