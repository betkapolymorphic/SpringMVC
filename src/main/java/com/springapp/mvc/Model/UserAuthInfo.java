package com.springapp.mvc.Model;

import javax.persistence.*;

/**
 * Created by Beta on 8/9/14.
 */
@Entity
@Table(name="users_auth_info")
public class UserAuthInfo {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private int enabled;

    public UserAuthInfo() {
    }

    public UserAuthInfo(String login, String password, int enabled) {
        this.login = login;
        this.password = password;
        this.enabled = enabled;
    }

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

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }
}
