package com.swapnil.mappingdemmo.model;

import javax.persistence.*;

@Entity
@Table( name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private Integer id;

    private String city;

    @OneToOne(mappedBy = "addresses")
    private Student student;
}
