package com.sathya.security.services;

import java.util.Optional;

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
		return permissionsRepo.findAll();
	}

	@Transactional
	public Permissions addPermissions(Permissions permission) {
		return permissionsRepo.save(permission);
	}

	@Transactional
	public Permissions updatePermissions(Permissions permission) {
		return permissionsRepo.save(permission);
	}

	@Transactional
	public void deletePermission(Integer permissionId) {
		permissionsRepo.deleteById(permissionId);
	}

	/*
	 * @Override public Optional<Permissions> findByPermissionId(String
	 * permissionId) { return permissionsRepo.findByPermissionId(permissionId); }
	 */

}
