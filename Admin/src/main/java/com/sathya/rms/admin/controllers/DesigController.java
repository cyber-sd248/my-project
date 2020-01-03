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

import com.sathya.rms.admin.entities.Designation;
import com.sathya.rms.admin.services.DesigService;

@RestController
@RequestMapping(path="/roles")
@CrossOrigin
public class DesigController {

	@Autowired
	DesigService desigService;

	@GetMapping(path="/getAllRoles")
	public Iterable<Designation> getAllRoles() {
		return desigService.findAll();
	}

	@PostMapping(path="/addRoles")
	public Designation addRole(@RequestBody Designation desig) {
		return desigService.addRole(desig);
	}

	@PutMapping(path="/updateRole")
	public Designation updateRole(@RequestBody Designation desig) {
		return desigService.updateRole(desig);
	}

	@DeleteMapping(path="/deleteRole/{id}")
	public void deleteRole(@PathVariable("id") Integer id) {
		desigService.deleteRole(id);
	}

}
