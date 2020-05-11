package com.swapnil.mappingdemmo.model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer id;
    @Column(name = "name")
    private String name;
    private Integer salary;
    private String teamName;

    public Users() {
    }

    /*
    // oneToMany mapping
    @OneToMany( cascade = CascadeType.ALL)
    @JoinColumn( name = "user_id" ,   referencedColumnName = "user_id")
    private List<UserLogs> userLogs;

    public List<UserLogs> getUserLogs() {
        return userLogs;
    }

    public void setUserLogs(List<UserLogs> userLogs) {
        this.userLogs = userLogs;
    }
  */

    public Integer getId() {
        return id;
    }

    public Users setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Users setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getSalary() {
        return salary;
    }

    public Users setSalary(Integer salary) {
        this.salary = salary;
        return this;
    }

    public String getTeamName() {
        return teamName;
    }

    public Users setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
}
