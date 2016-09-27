package eu.javeo.training.java8.data.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Map;

public class Order {
    private final LocalDate orderDate;
    private final User user;
    private final Map<Product, Integer> products; // map product => quantity

    public Order(LocalDate orderDate, User user, Map<Product, Integer> products) {
        this.orderDate = orderDate;
        this.user = user;
        this.products = Collections.unmodifiableMap(products);
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public User getUser() {
        return user;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order for " + user + " of " + orderDate;
    }
}
