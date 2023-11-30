package com.xworkz.passport.service.impl;

import com.xworkz.passport.dto.PassportDTO;
import com.xworkz.passport.repository.PassportRepository;
import com.xworkz.passport.repository.impl.PassportRepositoryImpl;
import com.xworkz.passport.service.PassportService;

import java.util.List;

public class PassportServiceImpl implements PassportService {

    PassportRepository passportRepository;

    public PassportServiceImpl() 
    {
        passportRepository=new PassportRepositoryImpl();
    }
    @Override
    public void validateAndSave(PassportDTO dto) {
            if(dto!= null)
            {
                System.out.println("saving  data");
                passportRepository.save(dto);
            }
        }

    @Override
    public List<PassportDTO> getLoginIdAndPassword(String loginId, String password) 
    {
        List<PassportDTO> dto = null;
        if(loginId != null || password != null)
        {
             dto = passportRepository.getLoginIdAndPassword(loginId, password);
        }
        
        return dto;
    }

    @Override
    public List<PassportDTO> getAllUsers()
    {

       return passportRepository.getAllUsers();
    }
}

