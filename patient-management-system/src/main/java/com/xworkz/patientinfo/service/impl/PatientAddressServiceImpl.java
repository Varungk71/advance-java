package com.xworkz.patientinfo.service.impl;


import com.xworkz.patientinfo.dto.PatientDTO;
import com.xworkz.patientinfo.repository.PatientAddressRepository;
import com.xworkz.patientinfo.repository.impl.PatientAddressRepositoryImpl;
import com.xworkz.patientinfo.service.PatientAddressService;

public class PatientAddressServiceImpl implements PatientAddressService {

    PatientAddressRepository repository;

    public PatientAddressServiceImpl()
    {
        repository = (PatientAddressRepository) new PatientAddressRepositoryImpl();
    }
    @Override
    public void validateAndSave(PatientDTO dto) {
        repository.save(dto);

    }


}
