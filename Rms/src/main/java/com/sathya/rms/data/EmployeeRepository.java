package com.sathya.rms.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
