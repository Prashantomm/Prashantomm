package com.masai;

public class WatchPriceCalculator {
	double getWatchPrice(String watchType, int age, String gender){
		
		//code to computer and return the price of watch up to two decimal
		double finalPrice=0.0;
		if(watchType.equals("Titan")) {
			finalPrice = 7999 + ((12.5+7.5)*7999)/100.0;
		}
		else {
			finalPrice = 10999+((13.5+12.5)*10999)/100.0;
		}
		
		double discount = 0;
		if(age>=60) {
			discount+=3;
		}if(gender.equals("female")) {
			discount+=2;
		}
		
		finalPrice= finalPrice*(100-discount)/100.0;
		
		return Math.round(finalPrice*100)/100.0;
		
		
	}

}
