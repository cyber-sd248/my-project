package com.sathya.security.controllers;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

import com.sathya.security.entities.Roles;
import com.sathya.security.entities.Users;
import com.sathya.security.services.RolesService;
import com.sathya.security.services.UsersService;

@RestController
@RequestMapping(path="/users")
@CrossOrigin
public class UsersController {
	
	public static final Logger logger=LogManager.getLogger(UsersController.class);
	
	@Autowired
	UsersService usersService;
	
	@Autowired
	RolesService rolesService;
	
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
		/*
		 * Users result=null; try { Optional<Roles>
		 * rol=rolesService.findByRoleName(users.getRoleName());
		 * users.setRoles(rol.get()); if(rol.get()==null)throw new
		 * Exception("Invalid RoleId"); result=usersService.addUser(users);
		 * }catch(Exception e) { logger.error("Exception happened and exception is",e);
		 * } logger.info("addUser method execution is completed");
		 */
     return usersService.addUser(users);
	}
	
	@PostMapping(path="/login")
	public Users login(@RequestBody Users users){
     return usersService.login(users.getUsername(),users.getPassword());
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
