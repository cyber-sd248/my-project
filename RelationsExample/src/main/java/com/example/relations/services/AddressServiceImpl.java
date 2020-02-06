package com.example.relations.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relations.data.AddressRepository;
import com.example.relations.entities.Address;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository addressRepository;
	
	/*@Transactional
	public Address addAddress(Address address) {
		return addressRepository.save(address);
	}*/

}
