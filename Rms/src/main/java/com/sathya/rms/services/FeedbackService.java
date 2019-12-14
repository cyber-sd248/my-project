package com.sathya.rms.services;

import com.sathya.rms.entities.Feedback;

public interface FeedbackService {
	
	public Iterable<Feedback> getAllFeedbacks();
	public Feedback addFeedback(Feedback feedback);
	public Feedback updateFeedback(Feedback feedback);
	public void deleteFeedback(Integer id);

}
