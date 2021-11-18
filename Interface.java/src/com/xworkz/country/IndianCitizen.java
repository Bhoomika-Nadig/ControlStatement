package com.xworkz.country;

import com.xworkz.assignment.MarriageRule;
import com.xworkz.assignment.TrafficRule;
import com.xworkz.assignment.VotingRule;

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
	private String name="Africa";
	private String statename="Nigeria";
	public void displayDetails() {
		System.out.println("invoked  details");
}


}
	


