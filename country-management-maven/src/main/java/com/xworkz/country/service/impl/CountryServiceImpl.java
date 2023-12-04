package com.xworkz.country.service.impl;


import com.xworkz.country.dto.CountryDTO;
import com.xworkz.country.repository.CountryRepository;
import com.xworkz.country.repository.impl.CountryRepositoryImpl;
import com.xworkz.country.service.CountryService;


public class CountryServiceImpl implements CountryService {

    CountryRepository repository;
    public CountryServiceImpl(){
        repository=new CountryRepositoryImpl();
    }
    @Override
    public void validateAndSave(CountryDTO dto) {

        repository.Save(dto);

    }

    @Override
    public CountryDTO getCountryByStateId(int id) {
        if(id>0)
        {
            System.out.println("getting country by state id");
        }
        return repository.getCountryByStateId(id);
    }
}
