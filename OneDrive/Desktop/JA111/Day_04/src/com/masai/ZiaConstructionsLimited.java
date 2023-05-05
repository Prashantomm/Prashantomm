package com.masai;

public class ZiaConstructionsLimited {
	double getTotalCost(double totalArea, double labourCharges){
		double bill=0;
		bill = labourCharges*totalArea;
		return bill;
		//return the total bill cost up to two decimal places
		}
	
	
		double getTotalCost(double totalArea, double labourCharges,
		 double materialCharges){
			double bill=0;
			
			bill = totalArea*labourCharges+totalArea*materialCharges;
			return bill;
		//return the total bill cost up to two decimal places
		}

}
