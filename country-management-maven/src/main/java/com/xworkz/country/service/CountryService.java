package com.xworkz.country.service;


import com.xworkz.country.dto.CountryDTO;

public interface CountryService
{
    public void validateAndSave(CountryDTO dto);

    public CountryDTO getCountryByStateId(int id);
}
