package com.sathya.rms.admin.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entities.Designation;

public interface DesigRepository extends CrudRepository<Designation, Integer> {

}
