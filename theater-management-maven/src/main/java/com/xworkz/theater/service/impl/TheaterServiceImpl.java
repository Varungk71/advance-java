package com.xworkz.theater.service.impl;

import com.xworkz.theater.dto.TheaterDTO;
import com.xworkz.theater.repository.TheaterRepository;
import com.xworkz.theater.repository.impl.TheaterRepositoryImpl;
import com.xworkz.theater.service.TheaterService;


public class TheaterServiceImpl implements TheaterService {
    TheaterRepository repository;

    public TheaterServiceImpl()
    {
        repository=new TheaterRepositoryImpl();
    }

    @Override
    public void validateAndSave(TheaterDTO dto) {
        repository.Save(dto);
    }

    @Override
    public TheaterDTO getTheaterByScreenId(int id) {
        if(id>0)
        {
            System.out.println("get theater by screen id");
        }
        return repository.getTheaterByScreenId(id);
    }
}
