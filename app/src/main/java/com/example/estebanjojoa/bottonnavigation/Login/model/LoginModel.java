package com.example.estebanjojoa.bottonnavigation.Login.model;

public class LoginModel {
    private int id;
    private String name;
    private String username;
    private String pass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public LoginModel(int id, String name, String username, String pass, String email) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.pass = pass;
        this.email = email;
    }
}
