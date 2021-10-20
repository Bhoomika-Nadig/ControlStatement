package com.xworkz.core.New;

public class ResortStarter {
	private String country = new String();
	private String[] resortNames = new String[3];
	private int counter = 0;

	public ResortStarter() {
		this("India");
		System.out.println("Invoked no arg const");
	}

	public ResortStarter(String country) {
		this.country = country;
		System.out.println("Invoked string const");
	}

	public String getCountry() {
		return country;
	}

	public void addResortName(String name) {
		System.out.println("invoked addResortName");
		System.out.println("name arg:".concat(name));
		if (this.counter < 3) {
			this.resortNames[this.counter] = name;
			this.counter++;
		} else {
			System.err.println("array is full,plz check it");
		}
	}

	public void displayResortNames() {
		System.out.println("invoked displayresortNames");
		for (int i = 0; i < this.resortNames.length; i++) {
			String name = this.resortNames[i];
			System.out.println(name);
		}
	}
}
