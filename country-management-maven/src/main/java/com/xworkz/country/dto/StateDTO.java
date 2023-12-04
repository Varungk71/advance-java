package com.xworkz.country.dto;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name="state_info")

public class StateDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="state_id")
    private int id;

    private String stateName;
    private String stateCapital;
    private String population;
    private String area;

    @ManyToOne
    @JoinColumn(name="id")
    private CountryDTO country;






}
