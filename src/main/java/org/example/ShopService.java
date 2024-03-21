package org.example;
//Create a class ShopService through which we can place new orders.
public class ShopService {

    //Step 1: Implement a method to place a new order.
    //Step 2: Check if the ordered products exist. If not, print a System.out.println message


    private  OrderRepoInterface orderRepo;

    public ShopService(OrderRepoInterface orderRepo) {
        this.orderRepo = orderRepo;
    }

    //Step 1: Implement a method to place a new order.
    public void placeOrder(Order order) {
        Product product = orderRepo.getProductByName(order.productName());
       //Step 2: Check if the ordered products exist. If not, print a System.out.println message.

        if (product != null) {
            // Product exists, proceed with placing the order
            orderRepo.addOrder(order);
            System.out.println("Order placed successfully: " + order);
        } else {
            System.out.println("Error: Product " + order.productName() + " does not exist.");
        }
    }
}

