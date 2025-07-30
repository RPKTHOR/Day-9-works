package com.example.food;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Customer customer() {
        return new Customer("rpk","Indian");     
    }

    @Bean
    public Restaurant restaurant() {
        return new Restaurant("Biryani House", "Cyberabad", Arrays.asList("Indian", "Chinese"));
    }

    @Bean
    public FoodOrderService foodOrderService() {
        return new FoodOrderService(customer(), restaurant());
    }
}