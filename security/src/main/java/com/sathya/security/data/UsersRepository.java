package com.sathya.security.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.entities.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> {

}
