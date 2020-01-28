package com.sathya.security.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.data.UsersRepository;
import com.sathya.security.entities.Users;
@Service
public class UsersServiceImpl implements UsersService {
   
	@Autowired
	UsersRepository usersRepository;
	
	
	public Iterable<Users> getAllUsers() {
		return usersRepository.findAll();
	}

	@Transactional
	public Users addUser(Users users) {
		return usersRepository.save(users);
	}

	@Transactional
	public Users updateUser(Users users) {
		return usersRepository.save(users);
	}

	@Transactional
	public void deleteUser(Integer id) {
		usersRepository.deleteById(id);
	}

	public Users login(String username, String password) {
		return usersRepository.findByUsernameAndPassword(username, password);
	}

	/*
	 * public Optional<Users> findByRoleId(String roleId) { return
	 * usersRepository.findByRoleId(roleId); }
	 */
}
