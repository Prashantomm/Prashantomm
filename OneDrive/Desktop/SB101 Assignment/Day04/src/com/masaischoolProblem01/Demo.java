package com.masaischoolProblem01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Product> pl = new ArrayList<>();
		pl.add(new Product(1,"Suger",50.0,5));
		pl.add(new Product(2,"Termeric",20.0,15));
		pl.add(new Product(3,"Wheat",10.0,20));
		pl.add(new Product(4,"Rice",5.0,2));
		pl.add(new Product(5,"Spices",30.0,12));
		
		List<Product> filteredList = pl.stream()
                .filter(product -> product.getQuantity() > 10)
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();

        System.out.println("Original Product List:");
        pl.forEach(System.out::println);

        System.out.println("Filtered and Sorted Product List:");
        filteredList.forEach(System.out::println);
		
	}

}
