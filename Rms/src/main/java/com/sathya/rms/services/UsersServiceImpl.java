package com.sathya.rms.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.UsersRepository;
import com.sathya.rms.entities.Users;
@Service
public class UsersServiceImpl implements UsersService{

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

}
