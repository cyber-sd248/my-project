package com.sathya.security.services;

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
		// TODO Auto-generated method stub
		return usersRepository.findAll();
	}

	@Transactional
	public Users addUser(Users users) {
		// TODO Auto-generated method stub
		return usersRepository.save(users);
	}

	@Transactional
	public Users UpdateUser(Users users) {
		// TODO Auto-generated method stub
		return usersRepository.save(users);
	}

	@Transactional
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		usersRepository.deleteById(id);
	}

}
