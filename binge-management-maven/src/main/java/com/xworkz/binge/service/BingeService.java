package com.xworkz.binge.service;


import com.xworkz.binge.dto.BingeDTO;

public interface BingeService
{

    public void validateAndSave(BingeDTO dto);

    public BingeDTO getBingeByOttPlatformId(int id);

}
