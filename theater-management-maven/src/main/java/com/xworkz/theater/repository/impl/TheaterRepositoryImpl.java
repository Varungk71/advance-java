package com.xworkz.theater.repository.impl;

import com.xworkz.theater.dto.ScreenDTO;
import com.xworkz.theater.dto.TheaterDTO;
import com.xworkz.theater.entitymanagerfactory.EntityManagerFactorySingleton;
import com.xworkz.theater.repository.TheaterRepository;

import javax.persistence.EntityManager;

public class TheaterRepositoryImpl implements TheaterRepository
{

    @Override
    public void Save(TheaterDTO dto) {

        EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }

    @Override
    public TheaterDTO getTheaterByScreenId(int id) {

        ScreenDTO screenDTO= (ScreenDTO) EntityManagerFactorySingleton.getFactory().createEntityManager().createNamedQuery("getTheaterByScreenId").setParameter("id",id).getSingleResult();
        return screenDTO.getTheater();
    }
}
