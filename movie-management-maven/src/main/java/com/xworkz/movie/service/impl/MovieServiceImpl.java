package com.xworkz.movie.service.impl;

import com.xworkz.movie.dto.MovieDTO;
import com.xworkz.movie.repository.MovieRepository;
import com.xworkz.movie.repository.impl.MovieRepositoryImpl;
import com.xworkz.movie.service.MovieService;



public class MovieServiceImpl implements MovieService {

    MovieRepository repository;
    public MovieServiceImpl(){
        repository=new MovieRepositoryImpl();
    }
    @Override
    public void validateAndSave(MovieDTO dto) {
        repository.Save(dto);

    }

    @Override
    public MovieDTO getMovieByActorId(int id) {
        if(id>0)
        {
            System.out.println("get movie by actor id");
        }
        return repository.getMovieByActorId(id);
    }
}
