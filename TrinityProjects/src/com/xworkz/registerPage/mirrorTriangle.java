package com.xworkz.registerPage;

public class mirrorTriangle{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j) 
					System.out.print("*");
				else if(j==1)
					System.out.print("*");
				else if(i>=5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}