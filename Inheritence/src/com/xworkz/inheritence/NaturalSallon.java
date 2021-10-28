package com.xworkz.inheritence;

public class NaturalSallon {
	public String name = "NSNA";
	public int noOfHajamas = 5;

	public NaturalSallon() {
		// super();
		this("test");
		System.out.println("invoked NaturalSaloon no args const");
	}

	public NaturalSallon(String name) {
		System.out.println("invoked NaturalSaloon String const");

	}

}
