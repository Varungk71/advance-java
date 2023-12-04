package com.xworkz.airport.service.impl;

import com.xworkz.airport.dto.AirportDTO;
import com.xworkz.airport.repository.AirportRepository;
import com.xworkz.airport.repository.impl.AirportRepositoryImpl;
import com.xworkz.airport.service.AirportService;


public class AirportServiceImpl  implements AirportService
{

    AirportRepository repository;
    public AirportServiceImpl()
    {
        repository=new AirportRepositoryImpl();
    }
    @Override
    public void validateAndSave(AirportDTO dto)
    {
        if(dto !=null)
            System.out.println("invoking validate and save ");
            repository.save(dto);
    }

    @Override
    public AirportDTO getAirportByTerminalId(int id) {
        if(id>0){
            System.out.println("get airport by terminal id ");
        }
        return repository.getAirportByTerminalId(id);
    }
}
