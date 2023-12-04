package com.xworkz.country.service.impl;

import com.xworkz.country.dto.CountryDTO;
import com.xworkz.country.repository.CountrycapitalRepository;
import com.xworkz.country.repository.impl.CountrycapitalRepositoryImpl;
import com.xworkz.country.service.CountrycapitalService;

public class CountrycapitalServiceImpl implements CountrycapitalService
{

    CountrycapitalRepository repository;
    public CountrycapitalServiceImpl(){
        repository=new CountrycapitalRepositoryImpl();
    }
    @Override
    public void validateAndSave(CountryDTO dto) {
        repository.save(dto);

    }
}
