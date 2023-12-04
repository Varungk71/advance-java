package com.xworkz.banking.dto;

import com.xworkz.banking.constant.AtmType;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AtmDTO
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long atmNumber;
    private Date validTill;
    @Enumerated(EnumType.STRING)
    private AtmType type;
    private String bankName;
}
