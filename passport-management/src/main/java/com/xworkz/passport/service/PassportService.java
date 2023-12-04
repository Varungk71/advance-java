package com.xworkz.passport.service;

import com.xworkz.passport.dto.PassportDTO;

import java.util.List;

public interface PassportService {
    public void validateAndSave(PassportDTO dto);

    public List<PassportDTO> getLoginIdAndPassword(String loginId, String password);

    public List<PassportDTO> getAllUsers();

    public PassportDTO validateAndGetById(int id);

    public void updatePassport(PassportDTO dto,int id);

    public boolean deleteById(int id);
}
