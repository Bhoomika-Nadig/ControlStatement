package com.xworkz.test;

public class StarPattren {
 

	    public static void PyramidPattern(int n) 

	    {  

	        for (int i=0; i<n; i++) 

	{ for (int j=n-i; j>1; j--) 

	            { 

	                System.out.print(" "); //to print space

	            }  

	            for (int j=0; j<=i; j++ )

	            { 

	                System.out.print(" * "); 

	            } 

	            System.out.println(); //end-line after every row

	        } 

	    } 

	    public static void main(String args[]) //driver function, 

	    { 

	        int n = 5; 

	        PyramidPattern(n); 

	    } 

	}
