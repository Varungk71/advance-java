package com.xworkz.mall.service;


import com.xworkz.mall.dto.MallDTO;

public interface MallService
{
    public void validateAndSave(MallDTO dto);

    public MallDTO getMallByShopId(int id);

}
