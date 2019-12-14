package com.sathya.rms.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.entities.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {

}
