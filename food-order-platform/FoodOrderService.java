package com.example.food;

public class FoodOrderService {
	private Customer customer;
    private Restaurant restaurant;

    public FoodOrderService(Customer customer, Restaurant restaurant) {
        this.customer = customer;
        this.restaurant = restaurant;
    }

    public void placeOrder() {
        if (restaurant.getAvailableCuisines().contains(customer.getPreferredCuisine())){
            System.out.println("Order placed at " + restaurant.getName());
            System.out.println(customer.getPreferredCuisine()+" Cuisine by " + customer.getName());
            System.out.println();
        }
    }
}