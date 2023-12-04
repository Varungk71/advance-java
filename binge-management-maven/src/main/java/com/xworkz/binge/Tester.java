package com.xworkz.binge;


import com.xworkz.binge.dto.BingeDTO;
import com.xworkz.binge.dto.OttPlatformDTO;
import com.xworkz.binge.service.BingeService;
import com.xworkz.binge.service.impl.BingeServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        BingeDTO binge=new BingeDTO();
        List<OttPlatformDTO> ottList=new ArrayList<>();
        BingeService service=new BingeServiceImpl();

        /*System.out.println("enter company name");
        binge.setCompanyName(sc.next());

        OttPlatformDTO ott=new OttPlatformDTO();
        System.out.println("enter ott channel name");
        ott.setOttName(sc.next());
        System.out.println("enter type");
        ott.setType(sc.next());
        System.out.println("enter language");
        ott.setLanguage(sc.next());
        ottList.add(ott);

        OttPlatformDTO ott1=new OttPlatformDTO();
        System.out.println("enter ott channel name");
        ott1.setOttName(sc.next());
        System.out.println("enter type");
        ott1.setType(sc.next());
        System.out.println("enter language");
        ott1.setLanguage(sc.next());
        ottList.add(ott1);

        OttPlatformDTO ott2=new OttPlatformDTO();
        System.out.println("enter ott channel name");
        ott2.setOttName(sc.next());
        System.out.println("enter type");
        ott2.setType(sc.next());
        System.out.println("enter language");
        ott2.setLanguage(sc.next());
        ottList.add(ott2);

        binge.setOtt(ottList);

        service.validateAndSave(binge);*/

        System.out.println("enter id to fetch");
        BingeDTO bingeDTO=service.getBingeByOttPlatformId(sc.nextInt());
        System.out.println(bingeDTO);

    }
}
