package com.xworkz.banking.dto;

import com.xworkz.banking.constant.AccountType;
import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String customerName;
    private long accountNumber;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    private String bankName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    private AtmDTO atm;
}
