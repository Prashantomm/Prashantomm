package com.masai;

public class WatchPriceTester {
	public static void main(String args[]){
		WatchPriceCalculator wcOne = new WatchPriceCalculator();
		//for watch type = Titan, gender = "female", age = 25
		System.out.println(wcOne.getWatchPrice("Titan", 25, "female"));
		//for watch type = Rolex, gender = "male", age = 61
		System.out.println(wcOne.getWatchPrice("Titan", 61, "male"));
		//for watch type = Rolex, gender = "female", age = 61
		System.out.println(wcOne.getWatchPrice("Titan", 61, "male"));
		//for watch type = Rolex, gender = "female", age = 61
		System.out.println(wcOne.getWatchPrice("Titan", 25, "male"));

	}

}
