package com.springapp.mvc.Model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

/**
 * Created by Beta on 8/9/14.
 */
@Entity
@Table(name="user_auth_role")
public class UserAuthRole {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="rolename")
    private String role;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="userId",referencedColumnName = "id")
    private UserAuthInfo user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserAuthRole() {
    }

    public UserAuthRole(String role, UserAuthInfo user) {
        this.role = role;
        this.user = user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public UserAuthInfo getUser() {
        return user;
    }

    public void setUser(UserAuthInfo user) {
        this.user = user;
    }
}
