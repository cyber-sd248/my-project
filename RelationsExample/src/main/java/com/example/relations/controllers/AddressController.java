package com.example.relations.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.relations.entities.Address;
import com.example.relations.services.AddressService;

@RestController
@RequestMapping(path="/address")
public class AddressController {
	
	@Autowired
	AddressService addressService;
   /* @PostMapping(path="/addAddress")
	public Address addAddress(@RequestBody Address address) {
		return addressService.addAddress(address);
	}*/
}
