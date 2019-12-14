package com.sathya.rms.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.GroupsRepository;
import com.sathya.rms.entities.Groups;

@Service
public class GroupsServiceImpl implements GroupsService {
	
    @Autowired
    GroupsRepository groupsRepository;
    
	public Iterable<Groups> getAllGroups() {
		return groupsRepository.findAll();
	}

	@Transactional
	public Groups addGroup(Groups groups) {
		return groupsRepository.save(groups);
	}

	@Transactional
	public Groups updateGroup(Groups groups) {
		return groupsRepository.save(groups);
	}

	@Transactional
	public void deleteGroup(Integer id) {
		groupsRepository.deleteById(id);
	}

	@Override
	public Optional<Groups> findBygId(String gId) {
		// TODO Auto-generated method stub
		return groupsRepository.findBygId(gId);
	}
}
