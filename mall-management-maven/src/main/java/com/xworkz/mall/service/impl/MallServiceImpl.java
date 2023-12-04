package com.xworkz.mall.service.impl;


import com.xworkz.mall.dto.MallDTO;
import com.xworkz.mall.repository.MallRepository;
import com.xworkz.mall.repository.impl.MallRepositoryImpl;
import com.xworkz.mall.service.MallService;


public class MallServiceImpl implements MallService {

MallRepository repository;
public MallServiceImpl(){
    repository=new MallRepositoryImpl();
}
    @Override
    public void validateAndSave(MallDTO dto) {
        repository.Save(dto);

    }

    @Override
    public MallDTO getMallByShopId(int id) {
    if(id>0)
    {
        System.out.println("getting mall buy shop id");
    }
        return repository.getMallByShopId(id);
    }
}
