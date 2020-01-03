package com.sathya.rms.admin.controllers;




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

import com.sathya.rms.admin.entities.Dining;
import com.sathya.rms.admin.services.DiningService;

@RestController
@RequestMapping(path="/dining")
@CrossOrigin
public class DiningController {
	
	@Autowired
	 DiningService diningService;
	
	
	@PostMapping(path="/addDining")
	public Dining addDining(@RequestBody Dining dining) {
	 return diningService.addDining(dining);
	}
	
	@GetMapping(path="/getDining")
	public Iterable<Dining> getDining() {
		return diningService.findAll();
	}
    
	
	@PutMapping(path="/updateDining")
	public Dining updateDining(@RequestBody Dining dining) {
		return diningService.updateDining(dining);
	}
	
	
	@DeleteMapping(path="/deleteDining/{id}")
	public void deleteDining(@PathVariable("id") Integer id) {
	     diningService.deleteDining(id);
	}
}
