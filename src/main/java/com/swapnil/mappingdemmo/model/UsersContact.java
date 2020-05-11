package com.swapnil.mappingdemmo.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class UsersContact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    private Integer phone;

    public UsersContact(){

    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn( name = "user_id" ,referencedColumnName = "user_id")
    private Users users;

    public Users getUsers() {
        return users;
    }

    public UsersContact setUsers(Users users) {
        this.users = users;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public UsersContact setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getPhone() {
        return phone;
    }

    public UsersContact setPhone(Integer phone) {
        this.phone = phone;
        return this;
    }
}
