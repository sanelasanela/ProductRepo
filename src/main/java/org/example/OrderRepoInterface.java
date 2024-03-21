package org.example;

import java.util.List;

//Step 1: Create an OrderRepo interface with the methods
// from the OrderListRepo (add, remove, and getSingle, getAll).

public interface OrderRepoInterface {
    void addOrder(Order order);

    boolean removeOrder(Order order);

    Order getOrderByProductName(String productName);

    List<Order> getAllOrders();

    Product getProductByName(String name);
}
