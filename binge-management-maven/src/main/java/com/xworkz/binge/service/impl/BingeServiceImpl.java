package com.xworkz.binge.service.impl;

import com.xworkz.binge.dto.BingeDTO;
import com.xworkz.binge.repository.BingeRepository;
import com.xworkz.binge.repository.impl.BingeRepositoryImpl;
import com.xworkz.binge.service.BingeService;




public class BingeServiceImpl implements BingeService {


    BingeRepository repository;
    public BingeServiceImpl()
    {
        repository=new BingeRepositoryImpl();
    }
    @Override
    public void validateAndSave(BingeDTO dto)
    {
        repository.Save(dto);

    }

    @Override
    public BingeDTO getBingeByOttPlatformId(int id)
    {
        if(id>0)
        {
            System.out.println("get binge by ott id");
        }
        return repository.getBingeByOttPlatformId(id);
    }
}
