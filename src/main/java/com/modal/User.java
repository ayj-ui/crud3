package com.modal;

import lombok.Data;

@Data
public class User {
    Integer id;
    String username;
    String password;
    public User() {}
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public User(Integer id,String username, String password) {
        this.id=id;
        this.username = username;
        this.password = password;
    }
}
