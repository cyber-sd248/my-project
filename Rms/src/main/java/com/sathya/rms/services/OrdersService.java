package com.sathya.rms.services;

import com.sathya.rms.entities.Orders;

public interface OrdersService {

	public Iterable<Orders> getAllOrders();
	public Orders addOrder(Orders order);
	public Orders updateOrder(Orders order);
	public void deleteOrder(Integer id);
}
