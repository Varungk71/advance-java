package com.xworkz.binge.repository;


import com.xworkz.binge.dto.BingeDTO;

public interface BingeRepository
{
    public void Save(BingeDTO dto);

    BingeDTO getBingeByOttPlatformId(int id);

}
