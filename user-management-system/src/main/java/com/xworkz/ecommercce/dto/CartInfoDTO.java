package com.xworkz.ecommercce.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor

@Table(name="cart_item")
public class CartInfoDTO
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_id")
    private int cartItemId;

    @Column(name="product_id")
    private long productId;

    @Column(name="quantity")
    private int quantity;

//    @OneToOne(mappedBy = "userId")
   /* @OneToOne
    @JoinColumn(name="user_id")
    private UserDTO userDTO;*/

    @Column(name="created_at")
    private Date createdAt;

    @Column(name="modified_at")
    private Date modifiedAt;

}
