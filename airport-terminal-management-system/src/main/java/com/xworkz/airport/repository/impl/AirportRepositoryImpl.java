package com.xworkz.airport.repository.impl;

import com.xworkz.airport.dto.AirportDTO;
import com.xworkz.airport.dto.TerminalDTO;
import com.xworkz.airport.entitymanagerfactory.EntityManagerFactorySingleton;
import com.xworkz.airport.repository.AirportRepository;

import javax.persistence.EntityManager;

public class AirportRepositoryImpl implements AirportRepository
{

    @Override
    public void save(AirportDTO dto) {
        EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public AirportDTO getAirportByTerminalId(int id) {
        TerminalDTO terminalDTO= (TerminalDTO) EntityManagerFactorySingleton.getFactory().createEntityManager().createNamedQuery("getAirportByTerminalId").setParameter("id",id).getSingleResult();

        return terminalDTO.getAirport() ;
    }
}
