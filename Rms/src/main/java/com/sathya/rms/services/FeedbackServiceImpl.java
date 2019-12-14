package com.sathya.rms.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.FeedbackRepository;
import com.sathya.rms.entities.Feedback;

@Service
public class FeedbackServiceImpl implements FeedbackService {
    
	@Autowired
	FeedbackRepository feedbackRepository;
	
	public Iterable<Feedback> getAllFeedbacks() {

		return feedbackRepository.findAll();
	}

	@Transactional
	public Feedback addFeedback(Feedback feedback) {
	
		return feedbackRepository.save(feedback);
	}

	@Transactional
	public Feedback updateFeedback(Feedback feedback) {
	
		return feedbackRepository.save(feedback);
	}

	@Transactional
	public void deleteFeedback(Integer id) {
		
		feedbackRepository.deleteById(id);
	}

}
