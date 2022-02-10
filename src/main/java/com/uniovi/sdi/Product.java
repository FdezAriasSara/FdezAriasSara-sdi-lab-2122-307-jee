package com.uniovi.sdi;
public class Product {
    private String name;
    private String image;
    private float price;

    public Product(String name, String image, float price) {
        this.name = name;
        this.image = image;
        this.price = price;
    }
    public Product(){
        //para poder usar esta clase como Baean -> se requiere un constructor sin argumentos
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}