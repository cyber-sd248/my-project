package com.sathya.rms.services;

import java.util.Optional;

import com.sathya.rms.entities.Groups;

public interface GroupsService {

	public Iterable<Groups> getAllGroups();
	public Groups addGroup(Groups groups);
	public Groups updateGroup(Groups groups);
	public void deleteGroup(Integer id);
	public Optional<Groups> findBygId(String gId);
	
}
