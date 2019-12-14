package com.sathya.rms.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.entities.Groups;

public interface GroupsRepository extends CrudRepository<Groups, Integer> {
public Optional<Groups> findBygId(String gId);

}
