package com.xworkz.binge.dto;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name="ott_info")
public class OttPlatformDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ott_id")
    private int id;
    private String ottName;
    private String language;
    private String type;

    @ManyToOne
    @JoinColumn(name="binge_id")
    private BingeDTO binge;











}
