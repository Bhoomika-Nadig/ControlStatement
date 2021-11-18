package com.xworkz.bridge;

public class SharavathiHostel implements HostelRule,VisitingDay {
	@Override
	public int intime() {
		System.out.println("invoked intime in hostel");
		return 10;
	}

	public int breakFast() {
		System.out.println("invoked brakfast ");
		return 8;
	}
	

	@Override
	public String visitingDay() {
		// TODO Auto-generated method stub
		return "sunday";
	}
	}

