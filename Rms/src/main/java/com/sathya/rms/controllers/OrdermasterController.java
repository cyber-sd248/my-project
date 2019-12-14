package com.sathya.rms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entities.Ordermaster;
import com.sathya.rms.services.OrdermasterService;

@RestController
@RequestMapping(path="/ordermaster")
public class OrdermasterController {

	@Autowired
	OrdermasterService ordermasterService;
	
	@GetMapping(path="/getAllOrdersm")
	public Iterable<Ordermaster> getAllOrdersm(){
		return ordermasterService.getAllOrdersm();
	}
	
	@PostMapping(path="/addOrder")
	public Ordermaster addOrder(@RequestBody Ordermaster ordmr) {
		return ordermasterService.addOrder(ordmr);
	}
	
	@PutMapping(path="/updateOrder")
	public Ordermaster updateOrder(@RequestBody Ordermaster ordmr) {
		return ordermasterService.updateOrder(ordmr);
	}
	
	@DeleteMapping(path="/deleteOrder")
	public void deleteOrder(@PathVariable("id") Integer id) {
		ordermasterService.deleteOrder(id);
	}
	
}
