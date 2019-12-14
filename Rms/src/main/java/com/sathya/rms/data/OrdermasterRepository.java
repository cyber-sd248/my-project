package com.sathya.rms.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.entities.Ordermaster;

public interface OrdermasterRepository extends CrudRepository<Ordermaster, Integer> {
	public Optional<Ordermaster> findByOmId(String omId);

}
