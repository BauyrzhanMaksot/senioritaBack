package com.example.demo.user;

import javax.persistence.*;

/**
 * Created by Bauka on 27-Sep-18
 */
@Entity
@Table(name = "user")
public class User {
    private Long id;
    private String login;
    private String password;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}