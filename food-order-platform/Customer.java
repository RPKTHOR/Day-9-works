package com.example.food;

public class Customer {
    private String name;
    private String preferredCuisine;

    public Customer(String name, String preferredCuisine) {
        this.name = name;
        this.preferredCuisine = preferredCuisine;
    }

    public String getPreferredCuisine() {
        return preferredCuisine;
    }

    public String getName() {
        return name;
    }

}