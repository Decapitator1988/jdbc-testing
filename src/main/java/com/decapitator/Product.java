package com.decapitator;

public class Product {
    private int id;
    private String brand;
    private double price;

    public Product() {
    }

    public Product(int id, String brand, double price) {
        this.brand = brand;
        this.price = price;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product ["+ id+ "\t"+ brand+"\t"+price+"]";
    }
}
