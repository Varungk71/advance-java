package com.xworkz.binge.dto;

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
@NamedQuery(name="getBingeByOttPlatformId" ,query ="select dto from OttPlatformDTO dto where dto.id=:id")


public class BingeDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="binge_id")
    private int bingeId;
    private  String companyName;

    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "binge")

    private List<OttPlatformDTO> ott;


}
