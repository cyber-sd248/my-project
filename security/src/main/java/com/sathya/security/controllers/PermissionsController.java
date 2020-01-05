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

import com.sathya.security.entities.Permissions;
import com.sathya.security.entities.Roles;
import com.sathya.security.services.PermissionsService;
import com.sathya.security.services.RolesService;

@RestController
@RequestMapping(path="/permissions")
@CrossOrigin
public class PermissionsController {
	
	private static final Logger logger=LogManager.getLogger(PermissionsController.class);
	
	@Autowired
	PermissionsService permissionsService;
	
	@Autowired
	RolesService rolesService;
	
    @GetMapping(path="/getAllPermissions")
	public Iterable<Permissions> getAllPermissions(){
		return permissionsService.getAllPermissions();
	}
	
	@PostMapping(path="/addPermissions")
	public Permissions addPermissions(@RequestBody Permissions permission) {
		logger.info("addPermissions method execution started");
		logger.debug("input data is {0}",permission);
		
		Permissions result=null;
		try {		
		Optional<Roles> rls=rolesService.findByRoleId(permission.getRoleId());
		if(rls.get() == null)throw new Exception("invalid roledId is"); 
			permission.setRoles(rls.get());
			result=permissionsService.addPermissions(permission);
		}catch(Exception e) {
			logger.error("Exception is happens and exception is {0}",e);
		}
		logger.info("addPermissions method execution is completed");
		return result;
	}
	
	@PutMapping(path="/updatePermissions")
	public Permissions updatePermissions(@RequestBody Permissions permission) {
		return permissionsService.updatePermissions(permission);
	}
	
	@DeleteMapping(path="/deletePermissions/{permissionId}")
	public void deletePermission(@PathVariable ("permissionId") Integer permissionId) {
		permissionsService.deletePermission(permissionId);
	}
}
