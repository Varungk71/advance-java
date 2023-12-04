package com.xworkz.userinfo.repository.impl;

import com.xworkz.userinfo.dto.UserDTO;
import com.xworkz.userinfo.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.userinfo.repository.PersonPassportRepository;

import javax.persistence.EntityManager;

public class PersonPassportRepositoryImpl implements PersonPassportRepository {
    @Override
    public void save(UserDTO dto) {
        EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }
}
