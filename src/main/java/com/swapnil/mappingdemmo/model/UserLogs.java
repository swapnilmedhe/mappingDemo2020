package com.swapnil.mappingdemmo.model;

import javax.persistence.*;

@Entity
public class UserLogs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "log_id")
    private Integer id;

    private String log;
    public UserLogs(){

    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    private Users users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    /*
    //onetomany part
        @Column(name ="user_id")
        private Integer userid;


        public Integer getId() {
            return id;
        }

        public UserLogs setId(Integer id) {
            this.id = id;
           return  this;
        }
     */
    public String getLog() {
        return log;
    }

    public UserLogs setLog(String log) {
        this.log = log;
        return this;
    }
}
