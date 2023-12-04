package com.xworkz.airport.dto;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "terminals")
public class TerminalDTO
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int terminalId;
    private String name;

    @ManyToOne()
    @JoinColumn(name="id")
    private AirportDTO airport;
}
