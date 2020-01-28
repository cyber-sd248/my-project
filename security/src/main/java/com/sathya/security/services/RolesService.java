package com.sathya.security.services;

import java.util.Optional;

import com.sathya.security.entities.Roles;

public interface RolesService {

	public Iterable<Roles> getAllRoles();
	public Roles addRole(Roles role);
	public Roles updateRole(Roles role);
	public void deleteRole(Integer id);
	//public Optional<Roles> findByRoleName(String roleName);
}
