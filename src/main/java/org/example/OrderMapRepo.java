package org.example;

//Create a class OrderMapRepo through which we can place new orders.
//This class should also implement the OrderRepo interface.

import java.util.ArrayList;
import java.util.List;

public class OrderMapRepo implements OrderRepoInterface{
    private List<Order>orders;


    public OrderMapRepo() {
        this.orders = new ArrayList<>();
    }

    @Override
    public Product getProductByName(String name) {
        return new Product(name, 0.0);
    }

    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public boolean removeOrder(Order order) {
        return orders.remove(order);
    }

    @Override
    public Order getOrderByProductName(String productName) {
        return orders.stream()
                .filter(order -> order.productName().equals(productName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }
}
