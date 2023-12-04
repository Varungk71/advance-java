package com.xworkz.banking.repository.impl;

import com.xworkz.banking.dto.BankDTO;
import com.xworkz.banking.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.banking.repository.BankingAtmRepository;



import javax.persistence.EntityManager;

public class BankingAtmRepositoryImpl implements BankingAtmRepository
{

    @Override
    public void save(BankDTO dto) {
        EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }
}
