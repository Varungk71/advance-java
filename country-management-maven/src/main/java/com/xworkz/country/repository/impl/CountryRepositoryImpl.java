package com.xworkz.country.repository.impl;

import com.xworkz.country.dto.CountryDTO;
import com.xworkz.country.dto.StateDTO;
import com.xworkz.country.entitymanagerfactory.EntityManagerFactorySingleton;
import com.xworkz.country.repository.CountryRepository;

import javax.persistence.EntityManager;

public class CountryRepositoryImpl implements CountryRepository
{

    @Override
    public void Save(CountryDTO dto) {

        EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }

    @Override
    public CountryDTO getCountryByStateId(int id) {
        StateDTO stateDTO=(StateDTO) EntityManagerFactorySingleton.getFactory().createEntityManager().createNamedQuery("getCountryByStateId").setParameter("id",id).getSingleResult();
        return stateDTO.getCountry();
    }
}
