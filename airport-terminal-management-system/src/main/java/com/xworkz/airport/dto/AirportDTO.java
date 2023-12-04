package com.xworkz.airport.dto;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data

@NamedQuery(name="getAirportByTerminalId" ,query = "select dto from TerminalDTO dto where dto.terminalId=:id")

@Table(name = "airport_info")
public class AirportDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;
    private String type;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "airport")       // cascade - asssociated entity   // relation happinig on the asociating entity

    private List<TerminalDTO> terminal;
}
