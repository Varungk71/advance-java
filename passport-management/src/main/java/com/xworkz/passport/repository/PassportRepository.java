package com.xworkz.passport.repository;


import com.xworkz.passport.dto.PassportDTO;

import java.util.List;

public interface PassportRepository
{
    public  void save(PassportDTO dto);

    public List<PassportDTO> getLoginIdAndPassword(String loginId, String password);

    public List<PassportDTO> getAllUsers();

    public PassportDTO getById(int id);

    public boolean updatePassport(PassportDTO dto,int id);

    public boolean deleteById(int id);
}
