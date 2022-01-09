package com.xworkz.registerPage;

public class Diamondex {
	public static void main(String[] args) {
		int n = 6;
		  
	      
		    for(int i=1; i<=n; i++)
		    {
		        
		        for(int j=i; j<=n; j++)
		        {
		            System.out.print("*");//to print
		        }
		     
		        for(int j=1; j<=(2*i-1); j++)
		        {
		            System.out.print(" ");//to blank space
		        }
		       
		        for(int j=i; j<=n; j++)
		        {
		            System.out.print("*");//to print star
		        }
		 
		        System.out.println();
		    }
		 
		  for(int i=1;i<n;i++) 
		  {
		
			  for(int j=(2*i-2); j<(2*n-1); j++)
		        {
		            System.out.print(" ");
		        }
		 
		        for(int j=1; j<=i; j++)
		        {
		            System.out.print("*");
		        }
		 
		        System.out.println();
		    }
		 
		        
		  }
		  
		 
	}

