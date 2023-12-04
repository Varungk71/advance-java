package com.xworkz.userinfo.dto;

import com.xworkz.userinfo.constant.Gender;
import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class UserDTO
{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String name;

        private int age;
        @Enumerated(EnumType.STRING)
        private Gender gender;

        private long phoneNumber;


        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name="id")
        private PasspostDTO passport;
}
