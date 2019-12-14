package com.sathya.security.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.security.entities.Users;
import com.sathya.security.services.UsersService;

@RestController
@RequestMapping(path="/users")
public class UsersController {
	
	public static final Logger logger=LogManager.getLogger(UsersController.class);
	
	@Autowired
	UsersService usersService;
	
	@GetMapping(path="/getAllUsers")
	public Iterable<Users> getAllUsers(){
		
		logger.info("getAllUsers method execution started");
		Iterable<Users> result=null;
		try {
		result=usersService.getAllUsers();
		logger.debug("Result is {0}",result);
		}catch(Exception e){
			logger.error("Exception happens and Exception info is {0}",e);
		}
		logger.info("getAllUsers method execution completed");
		return result;
	}
	@PostMapping(path="/addUser")
	public Users addUser(@RequestBody Users users){
     return usersService.addUser(users);
	}
	@PutMapping(path="/updateUser")
	public Users updateUser(@RequestBody Users users) {
		return usersService.UpdateUser(users);
	}
	
	@DeleteMapping(path="/deleteUser/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		usersService.deleteUser(id);
	}
}
