package com.xworkz.mall.dto;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name="state_info")

public class ShopDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ShopId;

    private String name;
    private int shopNo;
    private String shopType;

    @ManyToOne
    @JoinColumn(name="mallId")
    private MallDTO mall;







}
