package com.xworkz.passport.repository.impl;

import com.xworkz.passport.dto.PassportDTO;
import com.xworkz.passport.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.passport.repository.PassportRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class PassportRepositoryImpl implements PassportRepository {
    public  void save(PassportDTO dto) {
        EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }

    @Override
    public List<PassportDTO> getLoginIdAndPassword(String loginId, String password) {

         List<PassportDTO> dto=  EntityManagerFactorySingleton.getFactory().
                 createEntityManager().createNamedQuery("getLoginIdAndPassword").
                 setParameter("loginMail",loginId).setParameter("password",password).getResultList();

        return dto ;
    }

    @Override
    public List<PassportDTO> getAllUsers() {
        List<PassportDTO> users=  EntityManagerFactorySingleton.getFactory().
                createEntityManager().createNamedQuery("getUsers").getResultList();
        return users;
    }
}
