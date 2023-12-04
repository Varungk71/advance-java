package com.xworkz.feedback.repository;

import com.xworkz.feedback.dto.FeedbackDTO;

public interface FeedbackRepository{
    public void addFeedback(FeedbackDTO dto);
}