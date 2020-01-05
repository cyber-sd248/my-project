package com.sathya.rms.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.OrdermasterRepository;
import com.sathya.rms.data.OrdersRepository;
import com.sathya.rms.entities.Ordermaster;
import com.sathya.rms.entities.Orders;

@Service
public class OrdermasterServiceImpl implements OrdermasterService {

	@Autowired
	OrdermasterRepository ordermasterRepository;
	
	@Autowired
	OrdersRepository ordersRepository;
	
	
	public Iterable<Ordermaster> getAllOrdersm() {
		return ordermasterRepository.findAll();
	}

	@Transactional
	public Ordermaster addOrder(Ordermaster ordmr) {
		/*List<Orders> ordrs=ordmr.getOrders();
		for(Orders o:ordrs) {
			o.setOrdermasters(ordmr);
		}*/
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
		return ordermasterRepository.findByOmId(omId);
	}

}
