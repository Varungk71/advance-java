package com.xworkz.mall.dto;

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
@NamedQuery(name = "getMallByShopId",query = "select dto from ShopDTO dto where dto.ShopId=:id")
@Table(name="mall_info")

public class MallDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mallId;

    private  String name;
    private String place;

    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "mall")
   private List<ShopDTO> shop;
}
