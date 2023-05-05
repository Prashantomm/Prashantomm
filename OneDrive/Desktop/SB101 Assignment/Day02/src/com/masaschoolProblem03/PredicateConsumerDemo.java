package com.masaschoolProblem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

 class PredicateConsumerDemo {
	
	     static void displayCountryList(List<Country> list) {
	        Consumer<Country> display = (c) -> {
	            System.out.println(c.getCountryName() + " from the " + c.getContinentName() + " is of " + c.getArea() + " square Km");
	        };
	        list.forEach(display);
	    }

	    public static List<Country> filterCountry(List<Country> list, Predicate<Country> filterByArea) {
	        List<Country> filteredList = new ArrayList<>();
	        for (Country country : list) {
	            if (filterByArea.test(country)) {
	                filteredList.add(country);
	            }
	        }
	        return filteredList;
	    }

	    public static void main(String args[]) {
	        List<Country> countryList = new ArrayList<>();
	        //Add countries from Asia
	        countryList.add(new Country("China", "Asia", 9596961));
	        countryList.add(new Country("Japan", "Asia", 377975));
	        countryList.add(new Country("India", "Asia", 3287263));
	        countryList.add(new Country("Russia", "Asia", 17098246));

	        //Add countries from Europe
	        countryList.add(new Country("Belgium", "Europe", 30528));
	        countryList.add(new Country("Denmark", "Europe", 43094));
	        countryList.add(new Country("Germany", "Europe", 357168));
	        countryList.add(new Country("Norway", "Europe", 385203));

	        //Add countries from Africa
	        countryList.add(new Country("Egypt", "Africa", 1010408));
	        countryList.add(new Country("Morocco", "Africa", 446300));
	        countryList.add(new Country("South Africa", "Africa", 1221037));
	        countryList.add(new Country("Kenya", "Africa", 580367));

	        Scanner sc = new Scanner(System.in);
	        int choice = -1;
	        Predicate<Country> filter = null;
	        do {
	            System.out.println("1. By Area Range");
	            System.out.println("2. By content in country name");
	            System.out.println("3. By continent name");
	            System.out.println("4. Clear Filter ");
	            System.out.println("5. Print Country List");
	            System.out.println("0. Exit");
	            System.out.print("Enter selection ");
	            choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter min area: ");
	                    double minArea = sc.nextDouble();
	                    System.out.print("Enter max area: ");
	                    double maxArea = sc.nextDouble();
	                    filter = c -> c.getArea() >= minArea && c.getArea() <= maxArea;
	                    break;
	                case 2:
	                    System.out.print("Enter search string: ");
	                    String searchString = sc.next();
	                    filter = c -> c.getCountryName().contains(searchString);
	                    break;
	                case 3:
	                    System.out.print("Enter continent name: ");
	                    String continentName = sc.next();
	                    filter = c -> c.getContinentName().equalsIgnoreCase(continentName);
	                    break;
	                case 4:
	                    filter = null;
	                    System.out.println("Filter cleared");
	                    break;
	                case 5:
	                    if (filter == null) {
	                        displayCountryList(countryList);
	                    } else {
	                        List<Country> filteredList = filterCountry(countryList, filter);
	                        displayCountryList(filteredList);
	                    }
	                    break;
	                case 0:
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	            }
	        } while (choice != 0);
	        sc.close();
	    }
}
