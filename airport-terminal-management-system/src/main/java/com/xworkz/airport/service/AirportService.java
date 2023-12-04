package com.xworkz.airport.service;

import com.xworkz.airport.dto.AirportDTO;

public interface AirportService
{
    public void validateAndSave(AirportDTO dto);

    public AirportDTO getAirportByTerminalId(int id);
}
