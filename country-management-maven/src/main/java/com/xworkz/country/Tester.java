package com.xworkz.country;

import com.xworkz.country.dto.CountryDTO;
import com.xworkz.country.dto.StateDTO;
import com.xworkz.country.service.CountryService;
import com.xworkz.country.service.impl.CountryServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        CountryDTO country=new CountryDTO();
        List<StateDTO> stateList=new ArrayList<>();
        CountryService service=new CountryServiceImpl();

        /*System.out.println("enter country");
        country.setName(sc.next());
        System.out.println("enter country code");
        country.setCountryCode(sc.next());

        StateDTO state1=new StateDTO();
        System.out.println("enter state");
        state1.setStateName(sc.next());
        System.out.println("enter state capital");
        state1.setStateCapital(sc.next());
        System.out.println("enter population");
        state1.setPopulation(sc.next());
        System.out.println("enter state area ");
        state1.setArea(sc.next());
        stateList.add(state1);


        StateDTO state2=new StateDTO();
        System.out.println("enter state");
        state2.setStateName(sc.next());
        System.out.println("enter state capital");
        state2.setStateCapital(sc.next());
        System.out.println("enter population");
        state2.setPopulation(sc.next());
        System.out.println("enter state area ");
        state2.setArea(sc.next());
        stateList.add(state2);

        *//*StateDTO state3=new StateDTO();
        System.out.println("enter state");
        state3.setStateName(sc.next());
        System.out.println("enter state capital");
        state3.setStateCapital(sc.next());
        System.out.println("enter population");
        state3.setPopulation(sc.next());
        System.out.println("enter state area ");
        state3.setArea(sc.next());
        stateList.add(state3);*//*

        country.setState(stateList);

        service.validateAndSave(country);*/

        System.out.println("getting country by state id");
        CountryDTO countryDTO=service.getCountryByStateId(sc.nextInt());
        System.out.println(countryDTO);
    }
}
