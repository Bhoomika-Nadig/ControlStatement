package com.xworkz.inheritence;

public class FactoryType extends Factory {

	public FactoryType() {
		System.out.println("invokking no-arguement Factory-type constructor");

	}

	public FactoryType(String name, int since, int noOfWorkers, String product) {
		super("bhoomika",12,12,"product");
		System.out.println("calling FactoryType arguements constructors");

	}

}
