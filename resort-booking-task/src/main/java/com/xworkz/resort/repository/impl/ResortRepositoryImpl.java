package com.xworkz.resort.repository.impl;


import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.resort.repository.ResortRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class ResortRepositoryImpl implements ResortRepository {
    @Override
    public void addUser(ResortDTO dto) {
        EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }

    public List<ResortDTO> getUsers(){

        List<ResortDTO> resort=EntityManagerFactorySingleton.getFactory().createEntityManager().
                createNamedQuery("getAllBooking").getResultList();
        return resort;
    }
}