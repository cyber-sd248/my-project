package com.sathya.rms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entities.Feedback;
import com.sathya.rms.services.FeedbackService;

@RestController
@RequestMapping(path="/feedbacks")
@CrossOrigin
public class FeedbackController {
	
	@Autowired 
	FeedbackService feedbackService;
	
    @GetMapping(path="/getAllFeedbacks")
	public Iterable<Feedback> getAllFeedbacks(){
		return feedbackService.getAllFeedbacks();
	}
    
    @PostMapping(path="/addFeedback")
    public Feedback addFeedback(@RequestBody Feedback feedback) {
    	return feedbackService.addFeedback(feedback);
    }
    
    @PutMapping(path="/updateFeedback")
    public Feedback updateFeedback(@RequestBody Feedback feedback) {
    	return feedbackService.updateFeedback(feedback);
    }
    
    @DeleteMapping(path="/deleteFeedback/{id}")
    public void deleteFeedback(@PathVariable("id") Integer id) {
    	 feedbackService.deleteFeedback(id);
    }
	
}
