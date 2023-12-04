package com.xworkz.feedback.repository.impl;

import com.xworkz.feedback.dto.FeedbackDTO;
import com.xworkz.feedback.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.feedback.repository.FeedbackRepository;

import javax.persistence.EntityManager;

public class FeedbackRepositoryImpl implements FeedbackRepository {

    public void addFeedback(FeedbackDTO dto)
    {
        EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }

}