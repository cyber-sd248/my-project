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

import com.sathya.rms.entities.Empshift;
import com.sathya.rms.services.EmpshiftService;

@RestController
@RequestMapping(path="/empshifts")
public class EmpshiftController {

	@Autowired
	EmpshiftService empshiftService;

	@GetMapping(path="/getAllEmpshifts")
	public Iterable<Empshift> getAllCities() {
		return empshiftService.findAll();
	}

	@PostMapping(path="/addEmpshift")
	public Empshift addEmpshift(@RequestBody Empshift empshift) {
		return empshiftService.addEmpshift(empshift);
	}

	@PutMapping(path="/updateEmpshift")
	public Empshift updateEmpshift(@RequestBody Empshift empshift) {
		return empshiftService.updateEmpshift(empshift);
	}

	@DeleteMapping(path="/deleteEmpshift/{id}")
	public void deleteEmpshift(@PathVariable("id") Integer id) {
		empshiftService.deleteEmpshift(id);
	}

}
