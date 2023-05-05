package com.masai;

public class SimpleInterest {
	double principalAmount;
    double time;
    double interestRate;
    
    void setValues(double pa, double tp, double ir){
       
    	this.principalAmount=pa;
    	this.time=tp;
    	this.interestRate=ir;
    	
    }
     double getInterestAmount(){
    	return  (Math.round(principalAmount * time * interestRate) )/ 100;
        //write code to computer and return the interest amount rounded to two decimal places
    }
    
}
