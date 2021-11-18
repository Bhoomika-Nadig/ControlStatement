package com.xworkz.assignment;

public class IndianCitizen implements VotingRule, TrafficRule, MarriageRule {
	@Override
	public int validAge() {
		System.out.println("invoked from voating rule");
		return 2;
	}

	@Override
	public String validId() {
		System.out.println("invoked from voating rule");
		return "name";
	}

	@Override
	public boolean validLicence() {		System.out.println("invoked from traffic rule");
		return false;
	}

	@Override
	public String Licence() {
		System.out.println("invoked from traffic rule");
		return "driving licence";
	}

	@Override
	public boolean validInsurance() {
		System.out.println("invoked from traffic rule");
		return false;
	}

	@Override
	public boolean validAge(char gender, int age) {
		System.out.println("invoked from marriage rules");
		return false;
	}
	private String name="bhoomi";
	private String address="Banglore";
	public void displayNameAndAddressDetails() {
		System.out.println("invoked namesand details");
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
		
	}

