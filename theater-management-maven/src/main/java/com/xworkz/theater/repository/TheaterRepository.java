package com.xworkz.theater.repository;


import com.xworkz.theater.dto.TheaterDTO;

public interface TheaterRepository
{
    public void Save(TheaterDTO dto);

    TheaterDTO getTheaterByScreenId(int id);
}
