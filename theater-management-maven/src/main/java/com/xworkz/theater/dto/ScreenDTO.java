package com.xworkz.theater.dto;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name="screen_info")

public class ScreenDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String screenType;
    private int height;
    private int  width;

    @ManyToOne
    @JoinColumn(name="theaterId")
    private TheaterDTO theater;







}
