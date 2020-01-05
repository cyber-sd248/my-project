package com.sathya.rms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entities.Groups;
import com.sathya.rms.services.GroupsService;

@RestController
@RequestMapping(path="/groups")
@CrossOrigin
public class GroupsController {
    @Autowired
	GroupsService groupsService;
    
    @PostMapping(path="/addGroup")
    public Groups addGroup(@RequestBody Groups groups) {
    	return groupsService.addGroup(groups);
    }
    
    @GetMapping(path="/getAllGroups")
    public Iterable<Groups> getAllGroups(){
    	return groupsService.getAllGroups();
    }
    
    @PutMapping(path="/updateGroup")
    public Groups updateGroup(@RequestBody Groups groups) {
    	return groupsService.updateGroup(groups);
    }
    
    @DeleteMapping(path="/deleteGroup/{id}")
    public void deleteGroup(@PathVariable("id") Integer id) {
    	groupsService.deleteGroup(id);
    }
    
}
