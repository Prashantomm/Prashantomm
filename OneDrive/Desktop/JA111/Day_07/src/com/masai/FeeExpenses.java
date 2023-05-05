package com.masai;

public class FeeExpenses {
	  private double tuitionFee;
	    private double serviceTax;

	    public FeeExpenses(double tuitionFee, double serviceTax) {
	        this.tuitionFee = tuitionFee;
	        this.serviceTax = serviceTax;
	    }

	    public double getTotalFee() {
	        return tuitionFee + (tuitionFee * serviceTax / 100);
	    }

	    
	    public double getTutionFee() {
	    	return tuitionFee;
	    }

	    double getServicetax() {
	    	return serviceTax;
	    }
}

	 