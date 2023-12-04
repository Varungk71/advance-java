package com.xworkz.ecommercce.service.impl;

import com.xworkz.ecommercce.dto.CartInfoDTO;
import com.xworkz.ecommercce.dto.UserDTO;
import com.xworkz.ecommercce.repository.UserCartRepository;
import com.xworkz.ecommercce.repository.impl.UserCartRepositoryImpl;
import com.xworkz.ecommercce.service.UserCartService;

public class UserCartServiceImpl implements UserCartService
{
    UserCartRepository userCartRepository ;
    public UserCartServiceImpl()
    {

        userCartRepository=new UserCartRepositoryImpl();
    }

    @Override
    public void validateAndSave(UserDTO dto) {

        boolean isIdValidated =false;
        boolean isUserNameValidated =false;
        boolean isFirstNameValidated=false;
        boolean isLastNameValidated=false;
        boolean isPasswordValidated=false;
        boolean isPhoneNumberIsValidated=false;

//        dto.setUserDTO();


        if(dto!= null)
        {
            System.out.println("saving cart items");
            userCartRepository.save(dto);
        }
    }
}
