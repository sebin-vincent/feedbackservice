package com.example.feedbackservice.controller;

import com.example.feedbackservice.model.Feedback;
import com.example.feedbackservice.repository.FeedbackRepository;
import com.example.feedbackservice.responsedto.FeedbackResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @GetMapping("/feed/{feedbackId}")
    public FeedbackResponse fetchFeedback(@PathVariable(name = "feedbackId") int feedbackId){

        Feedback feedback=feedbackRepository.findByFeedbackId(feedbackId);

        return new FeedbackResponse(feedback.getFeedbackId(),feedback.getFeedbackMsg(),feedback.getCustomerName());
    }

}
