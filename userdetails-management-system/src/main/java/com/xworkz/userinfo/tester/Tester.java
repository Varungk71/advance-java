package com.xworkz.userinfo.tester;

import com.xworkz.userinfo.constant.Gender;
import com.xworkz.userinfo.dto.PasspostDTO;
import com.xworkz.userinfo.dto.UserDTO;
import com.xworkz.userinfo.service.PersonPassportService;
import com.xworkz.userinfo.service.impl.PersonPassportServiceImpl;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        PasspostDTO passport=new PasspostDTO();
        UserDTO user=new UserDTO();
        Scanner sc=new Scanner(System.in);
        PersonPassportService service = new PersonPassportServiceImpl();

        System.out.println("enter user name");
        user.setName(sc.next());
        System.out.println("enter age ");
        user.setAge(sc.nextInt());
        System.out.println("enter age");
        user.setGender(Gender.valueOf(sc.next()));
        System.out.println("enter phone number");
        user.setPhoneNumber(sc.nextLong());

        System.out.println("enter passport name");
        passport.setName(sc.next());
        System.out.println("enter passport number");
        passport.setPasspostNumber(sc.nextInt());
        System.out.println("enter nationality");
        passport.setNationality(sc.next());
        System.out.println("enter date of expiry dd/mm/yyyy ");
        passport.setDateOfExpiry(sc.next());

        user.setPassport(passport);

        service.validateAndSave(user);
    }
}
