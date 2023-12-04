package com.xworkz.banking.dto;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MobileDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String barndName;
    private int price;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    private BatteryDTO battery;
}
