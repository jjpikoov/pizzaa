package com.pizzaa.domain.admin;

import javax.persistence.*;

/**
 * Created by jjpikoov on 4/9/16.
 */
@Entity
@Table(name="ADMIN", uniqueConstraints = @UniqueConstraint(columnNames = {"ID"}))
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true, length = 11)
    private int id;

    @Column(name = "LOGIN", length = 20, nullable = true)
    private String login;

    @Column(name = "PASSWORD", length = 20, nullable = false)
    private String password;

    @Column(name = "EMAIL", length = 20, nullable = true)
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
