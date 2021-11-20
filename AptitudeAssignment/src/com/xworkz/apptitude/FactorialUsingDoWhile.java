package com.xworkz.apptitude;

public class FactorialUsingDoWhile {

		 public static void main(String[] args)
			
		    {
		        int number = 10;
		        long factorial = 1;
		        int i = 1;
		        
		        do
		        {
		            factorial = factorial * i;
		            i++;
		        } while (i <= number);

		        System.out.println("Factorial of " + number + " is: " + factorial);
		    }
		}
