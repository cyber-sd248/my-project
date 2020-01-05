package com.sathya.rms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entities.Restdining;
import com.sathya.rms.services.RestdiningService;

@RestController
@RequestMapping(path="/restdinings")
@CrossOrigin
public class RestdiningController {
    
	@Autowired
	RestdiningService restdiningService;
   
	@GetMapping(path="/getAllDinings")
	public Iterable<Restdining> getAllRoles() {
		return restdiningService.findAll();
	}

	@PostMapping(path="/addDining")
	public Restdining addDining(@RequestBody Restdining restd) {
		return restdiningService.addDining(restd);
	}

	@PutMapping(path="/updateDining")
	public Restdining updateDining(@RequestBody Restdining restd) {
		return restdiningService.updateDining(restd);
	}

	@DeleteMapping(path="/deleteDining/{id}")
	public void deleteDining(@PathVariable("id") Integer id) {
		restdiningService.deleteDining(id);
	}

}
