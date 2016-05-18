package com.pizzaa.domain.admin;

import javax.persistence.*;

/**
 * Created by jjpikoov on 4/9/16.
 */
@Entity
@Table
public class Admin {

    @Id
    @GeneratedValue
    @Column(nullable = false, unique = true)
    private int id;

    @Column(nullable = true)
    private String login;

    @Column(nullable = false)
    private String password;

    @Column(nullable = true)
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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
