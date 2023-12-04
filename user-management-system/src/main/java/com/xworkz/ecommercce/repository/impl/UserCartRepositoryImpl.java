package com.xworkz.ecommercce.repository.impl;

import com.xworkz.ecommercce.dto.CartInfoDTO;
import com.xworkz.ecommercce.dto.UserDTO;
import com.xworkz.ecommercce.entitymanager.EntityManagerSingleton;
import com.xworkz.ecommercce.repository.UserCartRepository;

import javax.persistence.EntityManager;

public class UserCartRepositoryImpl implements UserCartRepository {
    @Override
    public void save(UserDTO dto) {

        EntityManager manager= EntityManagerSingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }


}
