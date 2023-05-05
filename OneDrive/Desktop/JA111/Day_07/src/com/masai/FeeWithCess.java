package com.masai;

 public class FeeWithCess extends FeeExpenses {
    private double cess;

    public FeeWithCess(double tuitionFee, double serviceTax, double cess) {
        super(tuitionFee, serviceTax);
        this.cess = cess;
    }

    @Override
    public double getTotalFee() {
        
        return super.getTutionFee() + (getTutionFee() * getServicetax() / 100);
    }

}

