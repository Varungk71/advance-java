package com.xworkz.movie.repository;


import com.xworkz.movie.dto.MovieDTO;


public interface MovieRepository
{
    public void Save(MovieDTO dto);

    MovieDTO getMovieByActorId(int id);
}
