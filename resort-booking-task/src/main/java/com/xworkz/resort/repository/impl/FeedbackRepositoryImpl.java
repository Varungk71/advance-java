package com.xworkz.resort.repository.impl;


import com.xworkz.resort.dto.FeedbackDTO;
import com.xworkz.resort.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.resort.repository.FeedbackRepository;

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