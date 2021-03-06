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

import com.sathya.rms.entities.Ordermaster;
import com.sathya.rms.entities.Orders;
import com.sathya.rms.services.OrdermasterService;
import com.sathya.rms.services.OrdersService;

@RestController
@RequestMapping(path="/orders")
@CrossOrigin
public class OrdersController {
	private static final Logger logger = LogManager.getLogger(OrdersController.class);
    @Autowired
	OrdersService ordersService;
    
    @Autowired
    OrdermasterService ordermasterService;
    
    @PostMapping(path="/addOrder")
    public Orders addOrder(@RequestBody Orders order) {
    	
    	Orders  result=null;
    	try {
    	Optional<Ordermaster> om=ordermasterService.findByOmId(order.getOmId());
    	order.setOrdermasters(om.get());
    	if(om.get()==null) throw new Exception("invalid Ordermaster id");
       	result=ordersService.addOrder(order);
       	logger.debug("Result is {0}",result);
    	}catch(Exception e){
       		logger.error("Exception happend and exception is",e);       		
       		}
       	logger.info("addOrder method is execution completed");
       	return result;
       }
       
    
    @GetMapping(path="/getAllOrders")
    public Iterable<Orders> getAllOrders(){
    	return ordersService.getAllOrders();
    }
    
    @PutMapping(path="/updateOrder")
    public Orders updateOrder(@RequestBody Orders order) {
    	return ordersService.updateOrder(order);
    }
    
    @DeleteMapping(path="/deleteOrder/{id}")
    public void deleteOrder(@PathVariable("id") Integer id) {
    	ordersService.deleteOrder(id);
    }
}
