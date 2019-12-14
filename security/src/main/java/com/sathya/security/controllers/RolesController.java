package com.sathya.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.security.entities.Roles;
import com.sathya.security.services.RolesService;

@RestController
@RequestMapping(path="/roles")
public class RolesController {

	@Autowired
	RolesService rolesService;
	
	@GetMapping(path="/getAllRoles")
	public Iterable<Roles> geAllRoles(){
		return rolesService.getAllRoles();
	}
	
	@PostMapping(path="/addRole")
	public Roles addRole(@RequestBody Roles role) {
		return rolesService.addRole(role);
	}
	
	@PutMapping(path="/updateRole")
	public Roles updateRole(@RequestBody Roles role) {
		return rolesService.updateRole(role);
	}
	@DeleteMapping(path="/deleteRole/{id}")
	public void deleteRole(@PathVariable ("id") Integer id) {
		rolesService.deleteRole(id);
	}
}
