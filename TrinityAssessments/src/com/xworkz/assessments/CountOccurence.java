package com.xworkz.assessments;

public class CountOccurence {
	 public static void main(String args[]) 
	  {
	      
	  String input = "Bhoomika Nadig";
	  char search = 'o';
	
	  
	  int count=0;
	  for(int i=0; i<input.length(); i++)
	  {
	      if(input.charAt(i) == search)
	      count++;
	  }
	  
	  System.out.println("The Character '"+search+"' appears "+count+" times.");
	  }
	}