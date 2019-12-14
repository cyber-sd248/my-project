package com.sathya.security.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.data.PermissionsRepository;
import com.sathya.security.entities.Permissions;
@Service

public class PermissionsServiceImpl implements PermissionsService {
    
	@Autowired
	PermissionsRepository permissionsRepo;
	
	
	public Iterable<Permissions> getAllPermissions() {
		// TODO Auto-generated method stub
		return permissionsRepo.findAll();
	}

	@Transactional
	public Permissions addPermissions(Permissions permission) {
		// TODO Auto-generated method stub
		return permissionsRepo.save(permission);
	}

	@Transactional
	public Permissions updatePermissions(Permissions permission) {
		// TODO Auto-generated method stub
		return permissionsRepo.save(permission);
	}

	@Transactional
	public void deletePermission(Integer permissionId) {
		// TODO Auto-generated method stub
		permissionsRepo.deleteById(permissionId);
	}

}
