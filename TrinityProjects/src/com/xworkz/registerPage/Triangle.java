package com.xworkz.registerPage;

public class Triangle {

public static void main(String[]args) {
		
		int n = 7;   
	      for(int i=0;i<n;i++)
	      {
	          for(int j=n;j>i;j--)
	          {
	            if(j==n || j==i+1 || i==0)
	            System.out.print("* ");
	            else
	            System.out.print("  ");
	          }
	 
	          System.out.println();
	      }
	  }

}