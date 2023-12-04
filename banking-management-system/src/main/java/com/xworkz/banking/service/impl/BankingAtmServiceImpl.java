package com.xworkz.banking.service.impl;

import com.xworkz.banking.dto.BankDTO;
import com.xworkz.banking.repository.BankingAtmRepository;
import com.xworkz.banking.repository.impl.BankingAtmRepositoryImpl;
import com.xworkz.banking.service.BankingAtmService;

public class BankingAtmServiceImpl implements BankingAtmService
{
    BankingAtmRepository service;
    public BankingAtmServiceImpl(){
        service = new BankingAtmRepositoryImpl();
    }
    @Override
    public void validateAndAdd(BankDTO dto) {
        service.save(dto);
    }
}
