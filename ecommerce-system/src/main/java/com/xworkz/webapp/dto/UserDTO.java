package com.xworkz.webapp.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user_info")
@Getter
@Setter
public class UserDTO
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String name;

    private Long phoneNumber;

    private String email;

    private String password;

}
