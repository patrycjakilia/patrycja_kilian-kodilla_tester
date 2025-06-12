package com.kodilla.collections.adv.exercises.ProductInventory;

import java.util.*;

public class ProductInventory {

    Map<String, List<Product>> productsByCategory = new HashMap<>();



    public void addProduct(Product product){
        List<Product> products = new ArrayList<>();
        products.add(product);
    }
    public List<Product> getProductsByCategory(String category){
        return productsByCategory.getOrDefault(category, Collections.emptyList());
    }
    public List<Product> getProductsCheaperThan(double price){

    }
}
