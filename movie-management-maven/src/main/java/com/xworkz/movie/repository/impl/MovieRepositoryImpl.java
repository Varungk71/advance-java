package com.xworkz.movie.repository.impl;

import com.xworkz.movie.dto.ActorDTO;
import com.xworkz.movie.dto.MovieDTO;
import com.xworkz.movie.entitymanagerfactory.EntityManagerFactorySingleton;
import com.xworkz.movie.repository.MovieRepository;


import javax.persistence.EntityManager;

public class MovieRepositoryImpl implements MovieRepository
{

    @Override
    public void Save(MovieDTO dto) {

        EntityManager manager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);
        manager.getTransaction().commit();
    }

    @Override
    public MovieDTO getMovieByActorId(int id) {

        ActorDTO actor= (ActorDTO)EntityManagerFactorySingleton.getFactory().createEntityManager().createNamedQuery("getMovieByActorId").setParameter("id",id).getSingleResult();
        return actor.getMovie();
    }
}
