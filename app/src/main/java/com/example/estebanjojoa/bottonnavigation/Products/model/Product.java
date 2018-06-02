package com.example.estebanjojoa.bottonnavigation.Products.model;

/**
 * Created by Acer on 28/05/2018.
 */

public class Product {
    private int id;
    private String title;
    private String logo;
    private double precio;
    private String marca;
    private int oferta;

    public int getId() {
        return id;
    }

    public Product(int id, String title, String logo, double precio, String marca, int oferta) {
        this.id = id;
        this.title = title;
        this.logo = logo;
        this.precio = precio;
        this.marca = marca;
        this.oferta = oferta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getOferta() {
        return oferta;
    }

    public void setOferta(int oferta) {
        this.oferta = oferta;
    }
}
