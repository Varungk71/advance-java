package com.xworkz.resort.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@ToString
@Table(name = "resort_details")
@NamedQueries({
        @NamedQuery(name = "getAllBooking" ,query = "select dto from ResortDTO dto")
})
public class ResortDTO{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;
    private String modeOfPayment;
    private String CheckInDate;
    private String checkOutDate;
    private String Adults;
    private String children;
    private String room;



}