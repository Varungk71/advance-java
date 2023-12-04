package com.xworkz.movie.dto;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="actor_info")

public class ActorDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String actorName;
    private String role;
    private int age;

    @ManyToOne
    @JoinColumn(name="movie_id")
    private MovieDTO movie;


}
