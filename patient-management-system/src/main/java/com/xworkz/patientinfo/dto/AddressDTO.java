package com.xworkz.patientinfo.dto;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class AddressDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_id")
    private int id;

    private  String doorNo;

    private String street;

    private String city;

    private String district;

    private String state;

    private String country;

    private int postalCode;
}
