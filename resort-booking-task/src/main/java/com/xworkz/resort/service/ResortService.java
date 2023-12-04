package com.xworkz.resort.service;

import com.xworkz.resort.dto.ResortDTO;

import java.util.List;

public interface ResortService{

    public void addUser(ResortDTO dto);

    public List<ResortDTO> getUsers();
}