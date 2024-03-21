package org.example;

public class Main {
    public static void main(String[] args) {
//In the main method, create either the OrderMapRepo or the OrderListRepo and pass it to the constructor
// of ShopService (as a constructor parameter that uses the interface).


       // Create OrderMapRepo or OrderListRepo
        OrderRepoInterface orderRepo = new OrderMapRepo(); // Change this to OrderListRepo() if desired
        OrderRepoInterface orderRepo2 = new OrderMapRepo();


        // Pass the orderRepo to the ShopService constructor
        ShopService shopService = new ShopService(orderRepo);

        // Example usage
        Order order1 = new Order("Order1", 2);
        Order order2 = new Order("Order2", 3);
        Order order3 = new Order("Order3", 1);
        Order order4 = new Order("Order4", 2);


        Product product1 = new Product( "Product1", 10.2);
        Product product2 = new Product( "Product2", 6.8);
        Product product3 = new Product( "Product3", 88);
        Product product4 = new Product( "Product4", 7.89);

        shopService.placeOrder(order1);
        shopService.placeOrder(order2);
        shopService.placeOrder(order3);
        shopService.placeOrder(order4);

        ProductRepo productRepo = new ProductRepo();

        productRepo.addProduct(product1);
        productRepo.addProduct(product2);
        productRepo.addProduct(product2);
        productRepo.addProduct(product2);

        productRepo.getAllProducts();
        productRepo.getProductByName("Product8");


    }
}