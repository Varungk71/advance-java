package com.xworkz.resort.repository;

import com.xworkz.resort.dto.ResortDTO;

import java.util.List;

public interface ResortRepository{

    public void addUser(ResortDTO dto);
    public List<ResortDTO> getUsers();
}