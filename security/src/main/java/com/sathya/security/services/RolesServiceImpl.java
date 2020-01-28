package com.sathya.security.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.data.RolesRepository;
import com.sathya.security.entities.Roles;
@Service
public class RolesServiceImpl implements RolesService {
    
	@Autowired
    RolesRepository rolesRepository;
	
	@Override
	public Iterable<Roles> getAllRoles() {
		return rolesRepository.findAll();
	}

	@Transactional
	public Roles addRole(Roles role) {
		return rolesRepository.save(role);
	}

	@Transactional
	public Roles updateRole(Roles role) {
		return rolesRepository.save(role);
	}

	@Transactional
	public void deleteRole(Integer id) {
		rolesRepository.deleteById(id);
	}

	/*
	 * public Optional<Roles> findByRoleName(String roleName) { return
	 * rolesRepository.findByRoleName(roleName); }
	 */

	

}
