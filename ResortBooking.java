package com.xworkz.core.New;

public class ResortBooking {

	public static void main(String[] args) {
		ResortStarter resortOperator=new ResortStarter();
		String rname=resortOperator.getCountry();
		System.out.println(rname);
		
		resortOperator.addResortName("Devbagh Resort");
		resortOperator.displayResortNames();
		
		resortOperator.addResortName("chikmanglore Resort");
		resortOperator.displayResortNames();
		resortOperator.addResortName("Holiday Village Resort");
		resortOperator.displayResortNames();
		
		
		

	}

}
