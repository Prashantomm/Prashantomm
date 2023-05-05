package com.masaischool.problem03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Operation {
	public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Product A", 10, 100));
        products.add(new Product(2, "Product B", 20, 200));
        products.add(new Product(3, "Product C", 30, 200));
        products.add(new Product(4, "Product D", 20, 100));
        products.add(new Product(5, "Product E", 10, 300));

        Collections.sort(products, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                if (p2.getPrice() != p1.getPrice()) {
                    return p2.getPrice() - p1.getPrice();
                } else if (p2.getQuantity() != p1.getQuantity()) {
                    return p2.getQuantity() - p1.getQuantity();
                } else if (!p2.getProductName().equals(p1.getProductName())) {
                    return p2.getProductName().compareTo(p1.getProductName());
                } else {
                    return p2.getProductId() - p1.getProductId();
                }
            }
        });

        System.out.println("Sorted Products List:");
        for (Product p : products) {
            System.out.println("Product Id: " + p.getProductId() + ", Product Name: " + p.getProductName()
                    + ", Quantity: " + p.getQuantity() + ", Price: " + p.getPrice());
        }
    }

}
