package com.xworkz.patientinfo.repository.impl;

import com.xworkz.patientinfo.dto.PatientDTO;
import com.xworkz.patientinfo.entitymanagerfactory.EntityManagerFactorySingleton;
import com.xworkz.patientinfo.service.PatientAddressService;

import javax.persistence.EntityManager;

public class PatientAddressRepositoryImpl implements PatientAddressService
{

    @Override
    public void validateAndSave(PatientDTO dto) {

        EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }
}
