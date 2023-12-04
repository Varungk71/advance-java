package com.xworkz.giriyas.dto;

import com.xworkz.giriyas.constant.ProductType;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Builder
@Data
@Table(name="giriyas")
public class ShowroomDTO
{
    @Id
    @Column(name="id")
    private int id;

    @Column(name="brand_name")
    private String brand_name;

    @Column(name="price")
    private double price;

    @Column(name="mfg_year")
    private int mfgYear;

    @Column(name="quantity")
    private int quantity;

    @Column(name="product_type")
    @Enumerated(EnumType.STRING)
    private ProductType productType;

    @Column(name="color")
    private String color;

    @Column(name="warranty")
    private String warantty;

    @Column(name="review")
    private float review;


}
