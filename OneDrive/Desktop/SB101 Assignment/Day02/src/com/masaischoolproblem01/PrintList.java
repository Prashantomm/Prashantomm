package com.masaischoolproblem01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface PrintList {
    void display(List<String> city);
}

 class Main {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("China", "Pakistan", "Sri Lanka", "Bhutan", "India");

        
        PrintList printList = (list) -> {
            Consumer<String> consumer = str -> System.out.println(str);
            list.forEach(consumer);
        };

        printList.display(cities);
    }
}