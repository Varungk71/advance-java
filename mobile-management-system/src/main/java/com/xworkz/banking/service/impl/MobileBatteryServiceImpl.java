package com.xworkz.banking.service.impl;

import com.xworkz.banking.dto.MobileDTO;
import com.xworkz.banking.repository.MobileBatteryRepository;
import com.xworkz.banking.repository.impl.MobileBatteryRepositoryImpl;
import com.xworkz.banking.service.MobileBatteryService;

public class MobileBatteryServiceImpl implements MobileBatteryService {
    MobileBatteryRepository repository;
    public MobileBatteryServiceImpl()
    {
        repository=new MobileBatteryRepositoryImpl();
    }
    @Override
    public void validateAndSave(MobileDTO dto) {
            repository.Save(dto);
    }
}
