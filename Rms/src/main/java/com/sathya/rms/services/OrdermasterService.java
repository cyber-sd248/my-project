package com.sathya.rms.services;

import java.util.Optional;

import com.sathya.rms.entities.Ordermaster;

public interface OrdermasterService {

	public Iterable<Ordermaster> getAllOrdersm();
	public Ordermaster addOrder(Ordermaster ordmr);
	public Ordermaster updateOrder(Ordermaster ordmr);
	public void deleteOrder(Integer id);
	public Optional<Ordermaster> findByOmId(String omId);
}
