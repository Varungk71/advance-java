package com.xworkz.theater.dto;

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
@NamedQuery(name = "getTheaterByScreenId",query = "select dto from ScreenDTO dto where dto.id=:id")
@Table(name="theater_info")

public class TheaterDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int theaterId;

    private  String name;
    private String place;

    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "theater")

   private List<ScreenDTO> shop;
}
