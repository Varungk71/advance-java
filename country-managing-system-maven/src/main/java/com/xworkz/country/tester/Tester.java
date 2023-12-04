package com.xworkz.country.tester;


import com.xworkz.country.dto.CapitalDTO;
import com.xworkz.country.dto.CountryDTO;
import com.xworkz.country.service.CountrycapitalService;
import com.xworkz.country.service.impl.CountrycapitalServiceImpl;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        CapitalDTO capital=new CapitalDTO();
        CountryDTO country=new CountryDTO();
        Scanner sc=new Scanner(System.in);
        CountrycapitalService service=new CountrycapitalServiceImpl();

        country.setCountryName(sc.next());
        country.setPopulation(sc.next());
        country.setNoOfState(sc.nextInt());

        capital.setName(sc.next());
        country.setCapital(capital);

        service.validateAndSave(country);

    }
}
