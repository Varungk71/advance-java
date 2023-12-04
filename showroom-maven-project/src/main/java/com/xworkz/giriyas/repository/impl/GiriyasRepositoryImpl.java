package com.xworkz.giriyas.repository.impl;

import com.xworkz.giriyas.repository.GiriyasRepository;
import com.xworkz.giriyas.dto.ShowroomDTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GiriyasRepositoryImpl implements GiriyasRepository
{

    @Override
    public void add(ShowroomDTO dto)
    {
        Persistence persistence=new Persistence();
        EntityManagerFactory managerFactory=persistence.createEntityManagerFactory("showroom");
        EntityManager manager=managerFactory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();


        manager.close();
        managerFactory.close();

    }

    @Override
    public void getProduct(ShowroomDTO dto)
    {
        Persistence persistence=new Persistence();
        EntityManagerFactory managerFactory=persistence.createEntityManagerFactory("test_pu");
        EntityManager manager=managerFactory.createEntityManager();
        manager.getTransaction().begin();

        manager.getTransaction().commit();
        manager.find(ShowroomDTO.class,1);

         manager.close();
        managerFactory.close();

    }
}
