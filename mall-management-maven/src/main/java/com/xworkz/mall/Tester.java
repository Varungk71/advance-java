package com.xworkz.mall;


import com.xworkz.mall.dto.MallDTO;
import com.xworkz.mall.dto.ShopDTO;
import com.xworkz.mall.service.MallService;
import com.xworkz.mall.service.impl.MallServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        MallDTO mall=new MallDTO();
        List<ShopDTO> shopList=new ArrayList<>();
        MallService service=new MallServiceImpl();

        /*System.out.println("enter mall name");
        mall.setName(sc.next());
        System.out.println("enter place");
        mall.setPlace(sc.next());

        ShopDTO shop1=new ShopDTO();
        System.out.println("enter shop name");
        shop1.setName(sc.next());
        System.out.println("enter shop number");
        shop1.setShopNo(sc.nextInt());
        System.out.println("enter shop type");
        shop1.setShopType(sc.next());
        shopList.add(shop1);


        ShopDTO shop2=new ShopDTO();
        System.out.println("enter shop name");
        shop2.setName(sc.next());
        System.out.println("enter shop number");
        shop2.setShopNo(sc.nextInt());
        System.out.println("enter shop type");
        shop2.setShopType(sc.next());
        shopList.add(shop2);

        ShopDTO shop3=new ShopDTO();
        System.out.println("enter shop name");
        shop3.setName(sc.next());
        System.out.println("enter shop number");
        shop3.setShopNo(sc.nextInt());
        System.out.println("enter shop type");
        shop3.setShopType(sc.next());
        shopList.add(shop3);

        mall.setShop(shopList);
        service.validateAndSave(mall);*/

        System.out.println("enter shop id to get mall info");
        MallDTO mallDTO=service.getMallByShopId(sc.nextInt());
        System.out.println(mallDTO);




    }
}
