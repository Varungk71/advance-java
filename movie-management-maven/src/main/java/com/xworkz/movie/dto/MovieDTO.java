package com.xworkz.movie.dto;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@NamedQuery(name="getMovieByActorId" , query = "select dto from ActorDTO dto where dto.id=:id")


@Table(name="movie_info")

public class MovieDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int id;
    private String movieName;
    private String budget;


    @OneToMany(cascade = CascadeType.ALL , mappedBy = "movie")

    private List<ActorDTO> actor;







}
