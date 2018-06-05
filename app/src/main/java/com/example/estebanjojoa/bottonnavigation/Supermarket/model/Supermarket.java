package com.example.estebanjojoa.bottonnavigation.Supermarket.model;

public class Supermarket {
    private int id;
    private String name;
    private String logo;
    private String address;

    public Supermarket(int id, String name, String logo, String address) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.address = address;
    }

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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
