package com.xworkz.country.repository;


import com.xworkz.country.dto.CountryDTO;

public interface CountryRepository {
    public void Save(CountryDTO dto);

    CountryDTO getCountryByStateId(int id);
}
