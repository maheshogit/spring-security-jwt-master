package io.javabrains.springsecurityjwt.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "USERJWTM_TBL")
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="username")
    private String userName;
    @Column(name="password")
    private String password;
    @Column(name="email")
    private String email;

    public UserEntity() {
    }

    public UserEntity(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
