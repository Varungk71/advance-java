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

    @Override
    public PassportDTO getById(int id) {

        PassportDTO pass=(PassportDTO)EntityManagerFactorySingleton.getFactory().
                createEntityManager().createNamedQuery("getById").setParameter("id",id).getSingleResult();
        return pass;
    }

    @Override
    public void updatePassport(PassportDTO dto,int id)
    {
       EntityManager manager=  EntityManagerFactorySingleton.getFactory().createEntityManager();
       PassportDTO pass=manager.find(PassportDTO.class ,id);

       pass.setPassportOffice(dto.getPassportOffice());
       pass.setGivenName(dto.getGivenName());
       pass.setSurName(dto.getSurName());
       pass.setEmailId(dto.getEmailId());
       pass.setLoginId(dto.getLoginId());
       pass.setDateOfBirth(dto.getDateOfBirth());
       pass.setPassword(dto.getPassword());
       pass.setHintQuestion(dto.getHintQuestion());
       pass.setHintAnswer(dto.getHintAnswer());

       manager.getTransaction().begin();
       manager.merge(pass);
       manager.getTransaction().commit();
    }
    @Override
    public boolean deleteById(int id)
    {
        boolean isDeleted=false;
        if(id>0)
        {
            /*EntityManagerFactorySingleton.getFactory().createEntityManager().createNamedQuery("deleteById").setParameter("id", id).getSingleResult();
        isDeleted=true;*/
            EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
            PassportDTO pass=manager.find(PassportDTO.class,id);

            if(pass != null)
            {
                manager.getTransaction().begin();
                manager.remove(pass);
                manager.getTransaction().commit();
            }
        }
//
        return isDeleted ;
    }
}
