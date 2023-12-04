package com.xworkz.userinfo.repository;

import com.xworkz.userinfo.dto.UserDTO;

public interface PersonPassportRepository {
   public void save(UserDTO dto);
}
