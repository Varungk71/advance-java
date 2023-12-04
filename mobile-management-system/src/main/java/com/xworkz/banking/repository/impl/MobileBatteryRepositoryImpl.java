package com.xworkz.banking.repository.impl;

import com.xworkz.banking.dto.MobileDTO;
import com.xworkz.banking.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.banking.repository.MobileBatteryRepository;

import javax.persistence.EntityManager;

public class MobileBatteryRepositoryImpl implements MobileBatteryRepository
{
    @Override
    public void Save(MobileDTO dto) {
        EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }
}
