package com.xworkz.inheritence;

import com.xworkz.inheritence.Sallon;
import com.xworkz.inheritence.NaturalSallon;

public class Stater {

	public static void main(String[] args) {
		NaturalSallon naturalSaloon = new NaturalSallon();
		System.out.println(naturalSaloon.name);
		System.out.println(naturalSaloon.noOfHajamas);

		Sallon saloon = new Sallon();
		System.out.println(saloon.name);
		System.out.println(saloon.noOfHajamas);

	}

}
