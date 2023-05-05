package com.masaischoolProblem02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("Orange", 10, 89),
                new Fruit("Papaya", 20, 90),
                new Fruit("Apple", 10, 45),
                new Fruit("Watermelon", 10, 56),
                new Fruit("Guava", 10, 40),
                new Fruit("Pomegranate", 10, 200)
        );

        // (i) Generate a Map using Stream API that contains fruit name as key and total price of that fruit (price * quantity) as value
        Map<String, Double> fruitPriceMap = fruits.stream()
                .collect(Collectors.toMap(Fruit::getName, f -> f.getPrice() * f.getQuantity()));

        System.out.println("Fruit price map: " + fruitPriceMap);

        // (ii) compute total price of each product (that is price * quantity) and then find total price for all fruits using Stream
        double totalPrice = fruits.stream()
                .mapToDouble(f -> f.getPrice() * f.getQuantity())
                .sum();

        System.out.println("Total price of all fruits: " + totalPrice);

        // (iii) find all fruits whose per kg price is more than or same as 50/-, sort the filtered list according to natural ordering and then print the third and the fourth fruit details
        List<Fruit> filteredFruits = fruits.stream()
                .filter(f -> f.getPrice() / (f.getQuantity() * 1.0 / 1000) >= 50)
                .sorted(Comparator.comparing(Fruit::getPrice))
                .collect(Collectors.toList());

        System.out.println("Filtered fruits: " + filteredFruits);

        if (filteredFruits.size() >= 4) {
            System.out.println("Third fruit: " + filteredFruits.get(2));
            System.out.println("Fourth fruit: " + filteredFruits.get(3));
        }
    }
}
