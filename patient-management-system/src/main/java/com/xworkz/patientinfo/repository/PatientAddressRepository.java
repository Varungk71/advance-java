package com.xworkz.patientinfo.repository;

import com.xworkz.patientinfo.dto.PatientDTO;

public interface PatientAddressRepository {

    public void save(PatientDTO dto);
}
