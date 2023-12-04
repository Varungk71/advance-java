package com.xworkz.airport;

import com.xworkz.airport.dto.AirportDTO;
import com.xworkz.airport.dto.TerminalDTO;
import com.xworkz.airport.service.AirportService;
import com.xworkz.airport.service.impl.AirportServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {


        AirportDTO airport = new AirportDTO();
        List<TerminalDTO> terminalList = new ArrayList<>();
        AirportService service = new AirportServiceImpl();
        Scanner sc = new Scanner(System.in);

        /*System.out.println("enter airport name");
        airport.setName(sc.next());
        System.out.println("enter airport city");
        airport.setCity(sc.next());
        System.out.println("enter airport type");
        airport.setType(sc.next());


        TerminalDTO terminal1=new TerminalDTO();
        System.out.println("enter terminal 1 name");
        terminal1.setName(sc.next());
        terminalList.add(terminal1);

        TerminalDTO terminal2=new TerminalDTO();
        System.out.println("enter terminal 2 name");
        terminal2.setName(sc.next());
        terminalList.add(terminal2);

        TerminalDTO terminal3=new TerminalDTO();
        System.out.println("enter terminal 2 name");
        terminal3.setName(sc.next());
        terminalList.add(terminal3);

        airport.setTerminal(terminalList);

        service.validateAndSave(airport);*/

        System.out.println("enter id to fetch");
        AirportDTO airportDTO=service.getAirportByTerminalId(sc.nextInt());
        System.out.println(airportDTO);
    }
}
