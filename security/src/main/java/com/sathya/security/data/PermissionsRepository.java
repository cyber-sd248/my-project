package com.sathya.security.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.entities.Permissions;

public interface PermissionsRepository extends CrudRepository<Permissions, Integer> {
	//public Optional<Permissions> findByPermissionId(String permissionId);

}
