package com.xworkz.theater;


import com.xworkz.theater.dto.ScreenDTO;
import com.xworkz.theater.dto.TheaterDTO;
import com.xworkz.theater.service.TheaterService;
import com.xworkz.theater.service.impl.TheaterServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        List<ScreenDTO> theaterList=new ArrayList<>();
        TheaterDTO theater =new TheaterDTO();
        TheaterService service=new TheaterServiceImpl();

        /*System.out.println("enter theater name");
        theater.setName(sc.next());
        System.out.println("enter place");
        theater.setPlace(sc.next());

        ScreenDTO screen1=new ScreenDTO();
        System.out.println("screen type");
        screen1.setScreenType(sc.next());
        System.out.println("screen width");
        screen1.setWidth(sc.nextInt());
        System.out.println(" screen height");
        screen1.setHeight(sc.nextInt());
        theaterList.add(screen1);

        ScreenDTO screen2=new ScreenDTO();
        System.out.println("screen type");
        screen2.setScreenType(sc.next());
        System.out.println("screen width");
        screen2.setWidth(sc.nextInt());
        System.out.println(" screen height");
        screen2.setHeight(sc.nextInt());
        theaterList.add(screen2);

        theater.setShop(theaterList);

        service.validateAndSave(theater);*/

        System.out.println("enter screen id to get theater");
       TheaterDTO theaterDTO=service.getTheaterByScreenId(sc.nextInt());
        System.out.println(theaterDTO);

    }
}
