package com.example.relations.data;

import org.springframework.data.repository.CrudRepository;

import com.example.relations.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
