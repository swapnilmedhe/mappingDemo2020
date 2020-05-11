package com.swapnil.mappingdemmo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cart_tbl")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cart_id")
    private Integer id;
    private String cartName;

    @OneToMany(mappedBy = "carts")
    private List<Items > item;

}
