package com.xworkz.webapp.service.impl;

import com.xworkz.webapp.dto.UserDTO;
import com.xworkz.webapp.repository.UserRepository;
import com.xworkz.webapp.repository.impl.UserRepositoryImpl;
import com.xworkz.webapp.service.UserService;

public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl() {
        userRepository=new UserRepositoryImpl();
    }
    @Override
    public void validateAndSave(UserDTO dto) {

            if(dto!= null)
            {
                System.out.println("saving  data");
                userRepository.save(dto);
            }
        }
    }

