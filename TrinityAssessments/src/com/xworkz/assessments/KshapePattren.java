package com.xworkz.assessments;

import java.util.Scanner;

public class KshapePattren {
  private static Scanner sc;
  public static void main(String[] args) {
   sc = new Scanner(System.in);
	int i, j, alphabet;

		System.out.print("Enter K Shape Alphabets Pattern Rows = ");
		int rows = sc.nextInt();

		System.out.println("Printing K Shape Alphabets Pattern");

		for (i = rows - 1; i >= 0; i--) {
			alphabet = 65;
			for (j = 0; j <= i; j++) {
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println();
		}

		for (i = 1; i < rows; i++) {
			alphabet = 65;
			for (j = 0; j <= i; j++) {
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println();
		}
	}
}