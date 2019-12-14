package com.sathya.security.services;

import com.sathya.security.entities.Users;

public interface UsersService {
	
 public Iterable<Users> getAllUsers();
 public Users addUser(Users users);
 public Users UpdateUser(Users users);
 public void deleteUser(Integer id);
}
