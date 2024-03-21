package org.example;

import java.util.ArrayList;
import java.util.List;


//Step 2: Implement the ProductRepo
// class with a list to store products.


public class ProductRepo
{
    private  List<Product>products;

    public ProductRepo() {
        this.products = new ArrayList<>();
    }



    ///Step 3: Implement methods to add, remove,
// and get products (single product and all products).
    public void addProduct(Product product)
    {
        products.add(product);
    }

    public boolean removeProduct(Product product)
    {
        return products.remove(product);
    }
    public List<Product> getAllProducts() {
        System.out.println("\nAll products:\n");
        System.out.println(products);
        return new ArrayList<>(products);
    }

    public Product getProductByName(String name) {

        return products.stream()
                .filter(product -> product.name().equals(name))
                .findFirst()
                .orElse(null);
    }
}
