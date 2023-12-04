package com.xworkz.userinfo.service;

import com.xworkz.userinfo.dto.UserDTO;


public interface PersonPassportService  {
    public void validateAndSave(UserDTO dto);
}
