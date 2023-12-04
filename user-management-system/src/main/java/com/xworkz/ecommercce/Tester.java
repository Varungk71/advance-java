package com.xworkz.ecommercce;

import com.xworkz.ecommercce.dto.CartInfoDTO;
import com.xworkz.ecommercce.dto.UserDTO;
import com.xworkz.ecommercce.service.UserCartService;
import com.xworkz.ecommercce.service.impl.UserCartServiceImpl;


import java.util.Date;
import java.util.Scanner;

public class Tester
{
    public static void main(String[] args) {

        UserCartService service=new UserCartServiceImpl();
        UserDTO userDTO=new UserDTO();
        Scanner sc=new Scanner(System.in);

        CartInfoDTO cartInfoDTO = new CartInfoDTO();


        System.out.println("enter user name ");
        userDTO.setUserName(sc.next());
        System.out.println("enter first name ");
        userDTO.setFirstName(sc.next());
        System.out.println("enter last name ");
        userDTO.setLastName(sc.next());
        System.out.println("enter password");
        userDTO.setPassword(sc.next());
        System.out.println("enter phone number ");
        userDTO.setPhone(sc.nextLong());
        userDTO.setCreatedAt(new Date());
        userDTO.setModifiedAt(new Date());


       // System.out.println("enter cart id");
      //  cartInfoDTO.setCartItemId(sc.nextInt());
        System.out.println("enter product id ");
        cartInfoDTO.setProductId(sc.nextInt());
        System.out.println("enter quantity ");
        cartInfoDTO.setQuantity(sc.nextInt());
        cartInfoDTO.setCreatedAt(new Date());
        cartInfoDTO.setCreatedAt(new Date());

        userDTO.setCart(cartInfoDTO);

        service.validateAndSave(userDTO);
    }
}
