package com.xworkz.airport.repository;

import com.xworkz.airport.dto.AirportDTO;

public interface AirportRepository
{

 public    void save(AirportDTO dto);

 public AirportDTO getAirportByTerminalId(int id);
}
