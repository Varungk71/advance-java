package com.xworkz.theater.service;



import com.xworkz.theater.dto.TheaterDTO;

public interface TheaterService
{
    public void validateAndSave(TheaterDTO dto);

    public TheaterDTO getTheaterByScreenId(int id);

}
