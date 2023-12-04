package com.xworkz.resort.service.impl;

import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.repository.ResortRepository;
import com.xworkz.resort.repository.impl.ResortRepositoryImpl;
import com.xworkz.resort.service.ResortService;

import java.util.List;

public class ResortServiceImpl implements ResortService {

    ResortRepository repository;
    public ResortServiceImpl(){
        repository=new ResortRepositoryImpl();
    }
    @Override
    public void addUser(ResortDTO dto) {
        if(dto!=null){
            repository.addUser(dto);
        }
    }

    @Override
    public List<ResortDTO> getUsers() {
        return repository.getUsers();
    }
}