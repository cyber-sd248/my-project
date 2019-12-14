package com.sathya.security.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.entities.Permissions;

public interface PermissionsRepository extends CrudRepository<Permissions, Integer> {

}
