package org.example;

import java.util.ArrayList;
import java.util.List;


//Create a class OrderListRepo that contains a list of Order objects.
public class OrderListRepo {

   // Step 2: Implement the OrderListRepo class with a list to store orders.
    private List<Order> orders;

    //Step 3: Implement methods to add, remove,
    // and (single order and all orders).

    public OrderListRepo() {
        this.orders = new ArrayList<>();
    }



    ///Step 3: Implement methods to add, remove,
// and get products (single product and all products).
    public void addOrder(Order order)
    {
        orders.add(order);
    }

    public boolean removeOrder(Order order)
    {
        return orders.remove(order);
    }
    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }

    public Order getOrderByProductByName(String productName) {
        return orders.stream()
                .filter(order -> order.productName().equals(productName))
                .findFirst()
                .orElse(null);
    }
}
