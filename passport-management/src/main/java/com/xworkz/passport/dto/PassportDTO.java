package com.xworkz.passport.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Table
@Entity
@ToString
@NamedQueries({
        @NamedQuery(name = "getLoginIdAndPassword" ,query = "select dto from PassportDTO dto where dto.loginId=:loginMail and dto.password=:password"),
        @NamedQuery(name="getUsers" ,query = "select dto from PassportDTO dto"),
        @NamedQuery(name = "getById" ,query = "select dto from PassportDTO dto where id=:id"),
        @NamedQuery(name ="UpdateById" ,query = "update PassportDTO dto set dto.givenName=:gName where dto.id=:id"),
        @NamedQuery(name="deleteById",query = "delete from PassportDTO dto where id=:id")
})
        public class PassportDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    private String registerAt;
    private String passportOffice;
    private String givenName;
    private String surName;
    private String dateOfBirth;
    private String emailId;
    private String loginId;
    private String password;
    private String confirmPassword;
    private String hintQuestion;
    private String hintAnswer;


}

