package com.xworkz.mall.repository;


import com.xworkz.mall.dto.MallDTO;

public interface MallRepository {
    public void Save(MallDTO dto);

    MallDTO getMallByShopId(int id);
}
