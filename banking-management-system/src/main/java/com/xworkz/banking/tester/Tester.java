package com.xworkz.banking.tester;

import com.xworkz.banking.constant.AccountType;
import com.xworkz.banking.constant.AtmType;
import com.xworkz.banking.dto.AtmDTO;
import com.xworkz.banking.dto.BankDTO;
import com.xworkz.banking.service.BankingAtmService;
import com.xworkz.banking.service.impl.BankingAtmServiceImpl;

import java.util.Date;
import java.util.Scanner;

public class Tester
{
    public static void main(String[] args) {

        AtmDTO atm=new AtmDTO();
        BankDTO bank=new BankDTO();
        Scanner sc=new Scanner(System.in);
        BankingAtmService bankingAtmService=new BankingAtmServiceImpl();

        System.out.println("enter customer name");
        bank.setCustomerName(sc.next());
        System.out.println("enter customer account number");
        bank.setAccountNumber(sc.nextLong());
        System.out.println("enter account type");
        bank.setType(AccountType.valueOf(sc.next()));
        System.out.println("enter bank name");
        bank.setBankName(sc.next());

        System.out.println("enter atm number ");
        atm.setAtmNumber(sc.nextLong());
        System.out.println("enter atm type");
        atm.setType(AtmType.valueOf(sc.next()));
        System.out.println("enter bank name");
        atm.setBankName(sc.next());
        System.out.println("enter valid till mm-yyyy ");
        atm.setValidTill(new Date());

        bank.setAtm(atm);

        bankingAtmService.validateAndAdd(bank);

    }
}
