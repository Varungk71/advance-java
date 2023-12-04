package com.xworkz.giriyas.tester;

import com.xworkz.giriyas.repository.GiriyasRepository;
import com.xworkz.giriyas.constant.ProductType;
import com.xworkz.giriyas.dto.ShowroomDTO;
import com.xworkz.giriyas.repository.impl.GiriyasRepositoryImpl;

import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        GiriyasRepository giriyas=new GiriyasRepositoryImpl();

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size");
        int size=sc.nextInt();
        int id=2;
        for (int i = 0; i < size; i++) {
            System.out.println("enter product_type ,brand , mfg_year ,color ,review ,quantity,price , warranty ");

            ShowroomDTO dto=ShowroomDTO.
                    builder().
                    id(id++).
                    productType(ProductType.valueOf(sc.next())).
                    brand_name(sc.next()).
                    mfgYear(sc.nextInt()).
                    color(sc.next()).
                    review(sc.nextFloat()).
                    quantity(sc.nextInt()).
                    price(sc.nextDouble()).
                    warantty(sc.next()).
                    build();

            giriyas.add(dto);
            giriyas.getProduct(dto);

        }

    }
}
