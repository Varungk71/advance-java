package com.xworkz.registration.repository;

import com.xworkz.registration.dto.RegistrationDTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class NewYearRepository
{
    public void addCustomer(RegistrationDTO dto)
    {
        EntityManager manager= Persistence.createEntityManagerFactory("com_xworkz").createEntityManager();
       manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }

    public List<RegistrationDTO> getAllDetails()
    {
        EntityManager manager= Persistence.createEntityManagerFactory("com_xworkz").createEntityManager();
        List<RegistrationDTO> list= manager.createNamedQuery("getAll").getResultList();
        return list;
    }

    public RegistrationDTO getById(int id) {

        return (RegistrationDTO) Persistence.createEntityManagerFactory("com_xworkz").createEntityManager().createNamedQuery("getById").setParameter("id",id).getSingleResult();
    }

    public boolean updatePassport(RegistrationDTO dto,int id)
    {
       EntityManager manager=Persistence.createEntityManagerFactory("com_xworkz").createEntityManager();

        RegistrationDTO register= manager.find(RegistrationDTO.class,id);

       register.setFirstName(dto.getFirstName());
       register.setLastName(dto.getLastName());
       register.setGender(dto.getGender());
       register.setPhoneNumber(dto.getPhoneNumber());
       register.setEmail(dto.getEmail());

        manager.getTransaction().begin();
        manager.merge(register);
        manager.getTransaction().commit();
        return true;
    }

    public boolean deleteById(int id)
    {
        boolean isDeleted=false;
        if(id>0)
        {
            /*EntityManagerFactorySingleton.getFactory().createEntityManager().createNamedQuery("deleteById").setParameter("id", id).getSingleResult();
        isDeleted=true;*/
            EntityManager manager= Persistence.createEntityManagerFactory("com_xworkz").createEntityManager();
            RegistrationDTO registration=manager.find(RegistrationDTO.class,id);

            if(registration != null)
            {
                manager.getTransaction().begin();
                manager.remove(registration);
                manager.getTransaction().commit();
                isDeleted = true ;
            }
        }
//
        return isDeleted ;
    }
}
