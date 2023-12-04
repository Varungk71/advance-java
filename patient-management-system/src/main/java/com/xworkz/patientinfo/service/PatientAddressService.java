package com.xworkz.patientinfo.service;

import com.xworkz.patientinfo.dto.AddressDTO;
import com.xworkz.patientinfo.dto.PatientDTO;

public interface PatientAddressService
{
    public  void validateAndSave(PatientDTO dto);

}
