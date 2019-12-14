package com.sathya.security.services;



import com.sathya.security.entities.Permissions;

public interface PermissionsService {

	public Iterable<Permissions> getAllPermissions();
	public Permissions addPermissions(Permissions permission);
	public Permissions updatePermissions(Permissions permission);
	public void deletePermission(Integer permissionId);
}
