package com.xworkz.banking.tester;

import com.xworkz.banking.dto.BatteryDTO;
import com.xworkz.banking.dto.MobileDTO;
import com.xworkz.banking.service.MobileBatteryService;
import com.xworkz.banking.service.impl.MobileBatteryServiceImpl;

import java.util.Scanner;

class Tester{
    public static void main(String[] args) {

        BatteryDTO battery=new BatteryDTO();
        MobileDTO mobile=new MobileDTO();
        Scanner sc=new Scanner(System.in);
        MobileBatteryService service=new MobileBatteryServiceImpl();

        System.out.println("enter brand name");
        mobile.setBarndName(sc.next());
        System.out.println("enter price");
        mobile.setPrice(sc.nextInt());

        System.out.println("enter battery capacity");
        battery.setBatteryCapaacity(sc.next());
        mobile.setBattery(battery);

        service.validateAndSave(mobile);
    }
}