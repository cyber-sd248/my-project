package com.sathya.security.services;

import java.util.Optional;

import com.sathya.security.entities.Users;

public interface UsersService {

	public Iterable<Users> getAllUsers();
	public Users addUser(Users users);
	public Users updateUser(Users users);
	public void deleteUser(Integer id);
	//public Optional<Users> findByRoleId(String roleId);
	public Users login(String username, String password);
}
