package com.xworkz.apti;

public class FactorialUsingFor {

	public static void main(String[] args) {
		int number = 10;
		long factorial = 1;

		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial  " + number + " is: " + factorial);
	}
}