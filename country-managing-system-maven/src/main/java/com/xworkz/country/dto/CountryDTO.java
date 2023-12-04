package com.xworkz.country.dto;

import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class CountryDTO
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String countryName;

    private int noOfState;
    private String population;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    private CapitalDTO capital ;

}
