package com.sathya.rms.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.entities.Items;

public interface ItemsRepository extends CrudRepository<Items, Integer> {

}
