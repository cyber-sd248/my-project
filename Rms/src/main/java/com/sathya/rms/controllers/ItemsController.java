package com.sathya.rms.controllers;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
import com.sathya.rms.entities.Items;
import com.sathya.rms.services.GroupsService;
import com.sathya.rms.services.ItemsService;

@RestController
@RequestMapping(path="/items")
@CrossOrigin
public class ItemsController {
	public static final Logger logger=LogManager.getLogger(ItemsController.class); 
	
	@Autowired
	ItemsService itemsService;
	
	@Autowired
	GroupsService groupsSrevice;
    
	@PostMapping(path="/addItem")
	public Items addItem(@RequestBody Items items) {
		logger.info("addItem method execution is started");
		logger.debug("Input data is {0}",items);
		Items result=null;
		try {
			Optional<Groups> grps=groupsSrevice.findBygId(items.getgId());
			items.setGroups(grps.get());
			if(grps.get()==null) throw new Exception("Invalid Groups gId");
			result=itemsService.addItem(items);
			logger.debug("Result is {0}",result);
		    }
	    catch(Exception e) {
			logger.error("Exception happends and Exception is",e);			
		}
		logger.info("addItem method execution is completed");
		return result;
	}
	
	@GetMapping(path="/getAllItems")
	public Iterable<Items> getAllItems(){
	return itemsService.getAllItems();
	}
	@PutMapping(path="/updateItem")
	public Items updateItem(@RequestBody Items items) {
		return itemsService.updateItem(items);
	}
	@DeleteMapping(path="/deleteItem")
	public void deleteItem(@PathVariable("id") Integer id) {
		itemsService.deleteItem(id);
	}
	}
