package com.sathya.rms.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.entities.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> {

}
