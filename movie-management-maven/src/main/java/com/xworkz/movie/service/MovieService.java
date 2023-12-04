package com.xworkz.movie.service;


import com.xworkz.movie.dto.MovieDTO;

public interface MovieService
{
    public void validateAndSave(MovieDTO dto);

    public MovieDTO getMovieByActorId(int id);

}
