package com.sathya.security.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.entities.Users;

public interface UsersRepository extends CrudRepository<Users, Integer>{
	//Optional<Users> findByRoleId(String roleId);
	Users findByUsernameAndPassword(String username,String password);

}
