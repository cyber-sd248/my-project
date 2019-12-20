package com.sathya.rms.rms;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sathya.rms.services.EmployeeService;
@RunWith(SpringRunner.class)
@SpringBootTest

class RmsApplicationTests {
	
	@Autowired
	private EmployeeService employeeService;

	@Test
	public void findAll() throws Exception {

		assertTrue(employeeService.findAll().iterator().hasNext());
	}

	
    }
