package com.vedruna.pimentelgilmunillam01.persistence.model;

public class Product {

    private Long productID;
    private String name;
    private float price;

    public Product(){

    }
    public Product(Long productID, String name, float price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return productID;
    }

    public void setId(Long productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return
                "productID=" + getId() +
                        ", name='" + getName() + '\'' +
                        ", price='" + getPrice() + '\''
                ;
    }
}
