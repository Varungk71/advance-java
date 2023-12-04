package com.xworkz.movie;


import com.xworkz.movie.dto.ActorDTO;
import com.xworkz.movie.dto.MovieDTO;
import com.xworkz.movie.service.MovieService;
import com.xworkz.movie.service.impl.MovieServiceImpl;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        MovieDTO movie=new MovieDTO();
        List<ActorDTO> actorList=new ArrayList<>();
        MovieService service=new MovieServiceImpl();

       /* System.out.println("enter movie name");
        movie.setMovieName(sc.next());
        System.out.println("enter budget");
        movie.setBudget(sc.next());

        ActorDTO actor1=new ActorDTO();
        System.out.println("enter actor name");
        actor1.setActorName(sc.next());
        System.out.println("enter age");
        actor1.setAge(sc.nextInt());
        System.out.println("enter role");
        actor1.setRole(sc.next());
        actorList.add(actor1);

        ActorDTO actor2=new ActorDTO();
        System.out.println("enter actor name");
        actor2.setActorName(sc.next());
        System.out.println("enter age");
        actor2.setAge(sc.nextInt());
        System.out.println("enter role");
        actor2.setRole(sc.next());
        actorList.add(actor2);

        ActorDTO actor3=new ActorDTO();
        System.out.println("enter actor name");
        actor3.setActorName(sc.next());
        System.out.println("enter age");
        actor3.setAge(sc.nextInt());
        System.out.println("enter role");
        actor3.setRole(sc.next());
        actorList.add(actor3);

        movie.setActor(actorList);
        service.validateAndSave(movie);*/

        System.out.println("enter actor id to search movie");
        MovieDTO movieDTO=service.getMovieByActorId(sc.nextInt());
        System.out.println(movieDTO);

    }
}
