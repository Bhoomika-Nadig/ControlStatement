package com.xworkz.rules;

import com.xworkz.assignment.VotingRule;
import com.xworkz.assignment.IndianCitizen;
import com.xworkz.assignment.MarriageRule;
import com.xworkz.assignment.TrafficRule;

public class RulesRunner {

	public static void main(String[] args) {
		VotingRule voatingrule = new IndianCitizen();
		voatingrule.validAge();
		voatingrule.validId();

		MarriageRule marriagerule = new IndianCitizen();
		marriagerule.validAge('f', 18);

		TrafficRule trafficRule = new IndianCitizen();
		trafficRule.validLicence();
		trafficRule.Licence();
		trafficRule.validInsurance();
		Object object = new IndianCitizen();
		IndianCitizen indiancitizen = new IndianCitizen();
		System.out.println(indiancitizen.getAddress());
		System.out.println(indiancitizen.getName());
		System.out.println(indiancitizen.validId());
		System.out.println(indiancitizen.validAge());
		System.out.println(indiancitizen.Licence());
		System.out.println(indiancitizen.validInsurance());
		System.out.println(indiancitizen.validLicence());
		System.out.println(indiancitizen.validAge('f', 18));
	}
}
