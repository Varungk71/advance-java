package com.xworkz.registration.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Data
@Table

@NamedQueries({
        @NamedQuery(name = "getAll" , query = "from RegistrationDTO dto"),
        @NamedQuery(name = "getById" ,query = "select dto from RegistrationDTO dto where id=:id ")
}
)
public class RegistrationDTO
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private long phoneNumber;
    private String email;

    public  RegistrationDTO(){


    }
}
