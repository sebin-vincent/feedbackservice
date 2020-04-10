package com.example.feedbackservice.repository;

import com.example.feedbackservice.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback,Integer> {

    public Feedback findByFeedbackId(int feedbackId);

}
