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

import com.sathya.rms.entities.Users;
import com.sathya.rms.services.UsersService;

@RestController
@RequestMapping(path="/users")
@CrossOrigin
public class UsersController {

	@Autowired
	UsersService usersService;
	
	@PostMapping(path="/addUser")
	public Users addUser(@RequestBody Users users) {
		return usersService.addUser(users);
	}
	
	@GetMapping(path="/getAllUsers")
	public Iterable<Users> getAllUsers() {
		return usersService.getAllUsers();
	}
	
	@PutMapping(path="/updateUser")
	public Users updateUser(@RequestBody Users users) {
		return usersService.updateUser(users);
	}
	
	@DeleteMapping(path="/deleteUser/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		usersService.deleteUser(id);
	}
}
