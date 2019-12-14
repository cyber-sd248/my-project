package com.sathya.rms.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.ItemsRepository;
import com.sathya.rms.entities.Items;

@Service
public class ItemsServiceImpl implements ItemsService {
    
	@Autowired
	ItemsRepository itemsRepository;
	
	@Transactional
	public Items addItem(Items items) {
		return itemsRepository.save(items);
	}

    public Iterable<Items> getAllItems() {
		return itemsRepository.findAll();
	}

	@Transactional
	public Items updateItem(Items items) {
		return itemsRepository.save(items);
	}

	@Transactional
	public void deleteItem(Integer id) {
		itemsRepository.deleteById(id);
	}

}
