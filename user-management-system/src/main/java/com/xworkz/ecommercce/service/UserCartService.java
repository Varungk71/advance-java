package com.xworkz.ecommercce.service;

import com.xworkz.ecommercce.dto.CartInfoDTO;
import com.xworkz.ecommercce.dto.UserDTO;

public interface UserCartService
{
    public void validateAndSave(UserDTO dto);
}
