package com.sathya.rms.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.OrdermasterRepository;
import com.sathya.rms.entities.Ordermaster;

@Service
public class OrdermasterServiceImpl implements OrdermasterService {

	@Autowired
	OrdermasterRepository ordermasterRepository;
	
	
	public Iterable<Ordermaster> getAllOrdersm() {
		return ordermasterRepository.findAll();
	}

	@Transactional
	public Ordermaster addOrder(Ordermaster ordmr) {
		return ordermasterRepository.save(ordmr);
	}

	@Transactional
	public Ordermaster updateOrder(Ordermaster ordmr) {
		return ordermasterRepository.save(ordmr);
	}

	@Transactional
	public void deleteOrder(Integer id) {
		ordermasterRepository.deleteById(id);

	}

	@Override
	public Optional<Ordermaster> findByOmId(String omId) {
		// TODO Auto-generated method stub
		return ordermasterRepository.findByOmId(omId);
	}

}
