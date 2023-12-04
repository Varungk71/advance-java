package com.xworkz.binge.repository.impl;

import com.xworkz.binge.dto.BingeDTO;
import com.xworkz.binge.dto.OttPlatformDTO;
import com.xworkz.binge.entitymanagerfactory.EntityManagerFactorySingleton;
import com.xworkz.binge.repository.BingeRepository;


import javax.persistence.EntityManager;

public class BingeRepositoryImpl implements BingeRepository
{

    @Override
    public void Save(BingeDTO dto) {

        EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }

    @Override
    public BingeDTO getBingeByOttPlatformId(int id) {

        OttPlatformDTO ott = (OttPlatformDTO) EntityManagerFactorySingleton.getFactory().createEntityManager().createNamedQuery("getBingeByOttPlatformId").setParameter("id",id).getSingleResult();

        return ott.getBinge();
    }
}
