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
		// TODO Auto-generated method stub
		return rolesRepository.findAll();
	}

	@Transactional
	public Roles addRole(Roles role) {
		// TODO Auto-generated method stub
		return rolesRepository.save(role);
	}

	@Transactional
	public Roles updateRole(Roles role) {
		// TODO Auto-generated method stub
		return rolesRepository.save(role);
	}

	@Transactional
	public void deleteRole(Integer id) {
		// TODO Auto-generated method stub
		rolesRepository.deleteById(id);
	}

	@Transactional
	public Optional<Roles> findByRoleId(Integer roleId) {
		 return rolesRepository.findByRoleId(roleId);
	}

	

}
