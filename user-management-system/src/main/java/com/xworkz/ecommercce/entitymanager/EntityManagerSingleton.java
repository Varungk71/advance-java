package com.xworkz.ecommercce.entitymanager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerSingleton {

    private static EntityManagerFactory factory=null;

    public static EntityManagerFactory getFactory()
    {
        return factory;
    }
    static
    {
        factory=  Persistence.createEntityManagerFactory("com_xworkz");
    }
}
