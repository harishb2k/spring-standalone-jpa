package com.hb.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AuthUser {
    @Id
    @GeneratedValue
    public Integer id;

    @Column
    public String userName;

    @Column
    public String password;

    @Column
    public boolean enabled = true;

    public AuthUser() {
    }

    public AuthUser(String userName, String password, boolean enabled) {
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
    }
}
