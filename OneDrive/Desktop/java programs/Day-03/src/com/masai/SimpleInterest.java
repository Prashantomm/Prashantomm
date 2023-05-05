package com.masai;

public class SimpleInterest {
	double principalAmount;
    double time;
    double interestRate;
    void setValues(double pa, double tp, double ir){
        //write code to assign a value here
    	this.principalAmount=pa;
    	this.time=tp;
    	this.interestRate=ir;
    	
    }
     double getInterestAmount(){
    	return  (Math.round(principalAmount * time * interestRate) )/ 100;
        //write code to computer and return the interest amount rounded to two decimal places
    }
    class SimpleInterestTester{
        public static void main(String[] args){
            SimpleInterest siOne = new SimpleInterest();
            SimpleInterest siTwo = new SimpleInterest();
            siOne.setValues(1005, 2, 7.5);
            siTwo.setValues(1235.50, 2.5, 8.25);
            System.out.println(siOne.getInterestAmount());
            System.out.println(siTwo.getInterestAmount());
            
        }
    }

}
