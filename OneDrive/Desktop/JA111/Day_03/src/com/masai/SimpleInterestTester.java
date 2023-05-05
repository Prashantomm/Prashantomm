package com.masai;

public class SimpleInterestTester {
	public static void main(String[] args){
		
        SimpleInterest siOne = new SimpleInterest();
        SimpleInterest siTwo = new SimpleInterest();
        
        siOne.setValues(1005, 2, 7.5);
        siTwo.setValues(1235.50, 2.5, 8.25);
        
        System.out.println(siOne.getInterestAmount());
        System.out.println(siTwo.getInterestAmount());
        
    }

}
