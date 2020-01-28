package com.sathya.security.controllers;

import java.util.Optional;
import java.util.Set;

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

import com.sathya.security.entities.Permissions;
import com.sathya.security.entities.Roles;
import com.sathya.security.services.PermissionsService;
import com.sathya.security.services.RolesService;

@RestController
@RequestMapping(path="/roles")
@CrossOrigin
public class RolesController {
	public static final Logger logger=LogManager.getLogger(UsersController.class);
	@Autowired
	RolesService rolesService;
	
	@Autowired
	PermissionsService permissionsService;
	
	@GetMapping(path="/getAllRoles")
	public Iterable<Roles> geAllRoles(){
		return rolesService.getAllRoles();
	}
	
	@PostMapping(path="/addRole")
	public Roles addRole(@RequestBody Roles role) {
		/*
		 * logger.info("getAllUsers method execution started");
		 * logger.debug("input data is {0}",role); Roles result=null; try {
		 * Optional<Permissions>
		 * perms=permissionsService.findByPermissionId(role.getPermissionId());
		 * role.setPermissions((Set<Permissions>)perms.get());
		 * if(perms.getClass()==null)throw new Exception("invalid user uId");
		 * result=rolesService.addRole(role); logger.debug("Result is {0}",result);
		 * }catch(Exception e){
		 * logger.error("Exception happened and Exception info is {0}",e); }
		 * logger.info("addRole method execution is completed")
		 */;
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
