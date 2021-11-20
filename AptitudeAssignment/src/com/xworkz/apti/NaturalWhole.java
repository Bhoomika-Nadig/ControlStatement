package com.xworkz.apti;

public class NaturalWhole {

	public static void main(String[] args) {
	        int n = 1;
	        int m = 0;
	        while (n <= 10) {
	            System.out.println(n);
	            m = m + n;
	            n = n + 1;
	        }
	        System.out.println("Sum = " + m);
	    }
	}