package com.xworkz.patientinfo;

import com.xworkz.patientinfo.constant.Gender;
import com.xworkz.patientinfo.dto.AddressDTO;
import com.xworkz.patientinfo.dto.PatientDTO;
import com.xworkz.patientinfo.repository.impl.PatientAddressRepositoryImpl;
import com.xworkz.patientinfo.service.PatientAddressService;

import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        AddressDTO address=new AddressDTO();
        PatientDTO patient=new PatientDTO();

        PatientAddressService service=new PatientAddressRepositoryImpl();

        patient.setPatientName(sc.next());
        patient.setAge(sc.nextInt());
        patient.setGender(Gender.valueOf(sc.next()));
        patient.setPhoneNumber(sc.nextLong());

        address.setDoorNo(sc.next());
        address.setStreet(sc.next());
        address.setCity(sc.next());
        address.setDistrict(sc.next());
        address.setState(sc.next());
        address.setCountry(sc.next());
        address.setPostalCode(sc.nextInt());
        patient.setAddress(address);

        service.validateAndSave(patient);

    }
}
