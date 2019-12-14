package com.sathya.rms.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.OrdersRepository;
import com.sathya.rms.entities.Orders;
@Service
public class OrdersServiceImpl implements OrdersService {
    
	@Autowired
	OrdersRepository ordersRepository;
	
	public Iterable<Orders> getAllOrders() {	
		return ordersRepository.findAll();
	}

	@Transactional
	public Orders addOrder(Orders order) {
		return ordersRepository.save(order);
	}

	@Transactional
	public Orders updateOrder(Orders order) {
		return ordersRepository.save(order);
	}

	@Transactional
	public void deleteOrder(Integer id) {
		ordersRepository.deleteById(id);
	}

}
