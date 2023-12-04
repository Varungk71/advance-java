package com.xworkz.webapp.repository.impl;

import com.xworkz.webapp.dto.UserDTO;
import com.xworkz.webapp.entitymanagerfactory.EntityManagerFactorySingleton;
import com.xworkz.webapp.repository.UserRepository;

import javax.persistence.EntityManager;

public class UserRepositoryImpl implements UserRepository {
    public  void save(UserDTO dto) {
        EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }
}
