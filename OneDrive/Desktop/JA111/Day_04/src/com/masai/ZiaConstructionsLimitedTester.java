package com.masai;

public class ZiaConstructionsLimitedTester {
	public static void main(String args[]){
		ZiaConstructionsLimited zcl = new ZiaConstructionsLimited();
		System.out.println(zcl.getTotalCost(1500, 250));
		System.out.println(zcl.getTotalCost(1500, 250, 350));
	}

}
