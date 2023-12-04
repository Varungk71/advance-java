package com.xworkz.userinfo.service.impl;

import com.xworkz.userinfo.dto.UserDTO;
import com.xworkz.userinfo.repository.PersonPassportRepository;
import com.xworkz.userinfo.repository.impl.PersonPassportRepositoryImpl;
import com.xworkz.userinfo.service.PersonPassportService;

public class PersonPassportServiceImpl implements PersonPassportService {

    PersonPassportRepository repository;
    public PersonPassportServiceImpl()
    {
        repository= (PersonPassportRepository) new PersonPassportRepositoryImpl();
    }

    @Override
    public void validateAndSave(UserDTO dto) {
    repository.save(dto);
    }
}
