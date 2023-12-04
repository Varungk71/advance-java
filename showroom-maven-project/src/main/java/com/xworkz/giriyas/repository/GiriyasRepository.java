package com.xworkz.giriyas.repository;

import com.xworkz.giriyas.dto.ShowroomDTO;

public interface GiriyasRepository
{
    public void add(ShowroomDTO dto);

    public void getProduct(ShowroomDTO dto);
}
