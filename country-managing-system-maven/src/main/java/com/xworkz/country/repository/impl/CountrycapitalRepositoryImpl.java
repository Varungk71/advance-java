package com.xworkz.country.repository.impl;

import com.xworkz.country.dto.CountryDTO;
import com.xworkz.country.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.country.repository.CountrycapitalRepository;
import com.xworkz.country.service.CountrycapitalService;

import javax.persistence.EntityManager;

public class CountrycapitalRepositoryImpl implements CountrycapitalRepository {

    @Override
    public void save(CountryDTO dto) {
        EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }
}