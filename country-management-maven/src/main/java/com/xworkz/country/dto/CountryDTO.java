package com.xworkz.country.dto;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@NamedQuery(name = "getCountryByStateId",query = "select dto from StateDTO dto where dto.id=:id")
@Table(name="country_info")
public class CountryDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    private  String name;
    private String countryCode;

    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "country")
   private List<StateDTO> state;
}
