package com.swapnil.mappingdemmo.model;

import javax.persistence.*;

@Entity
@Table(name = "items_tbl")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private Integer id;
    private String itemName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id",referencedColumnName = "cart_id")
    private Cart carts;


}
