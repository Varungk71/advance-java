package com.xworkz.mall.repository.impl;



import com.xworkz.mall.dto.MallDTO;
import com.xworkz.mall.dto.ShopDTO;
import com.xworkz.mall.entitymanagerfactory.EntityManagerFactorySingleton;
import com.xworkz.mall.repository.MallRepository;

import javax.persistence.EntityManager;

public class MallRepositoryImpl implements MallRepository
{

    @Override
    public void Save(MallDTO dto) {

        EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }

    @Override
    public MallDTO getMallByShopId(int id) {
        ShopDTO shopDTO=(ShopDTO) EntityManagerFactorySingleton.getFactory().createEntityManager().createNamedQuery("getMallByShopId").setParameter("id",id).getSingleResult();
        return shopDTO.getMall();
    }
}
