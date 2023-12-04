package com.xworkz.patientinfo.dto;

import com.xworkz.patientinfo.constant.Gender;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder

public class PatientDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int patientId;

    private String patientName;

    private int age;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    private long phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    private AddressDTO address;


}
