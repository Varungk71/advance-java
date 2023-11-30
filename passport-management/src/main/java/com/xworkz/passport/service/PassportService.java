package com.xworkz.passport.service;

import com.xworkz.passport.dto.PassportDTO;

import java.util.List;

public interface PassportService {
    public void validateAndSave(PassportDTO dto);

   public List<PassportDTO> getLoginIdAndPassword(String loginId, String password);

    public List<PassportDTO> getAllUsers();

}
