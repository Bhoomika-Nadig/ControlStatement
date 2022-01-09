package com.xworkz.assessments;

public class StringLetter {
	
	 public static void main(String []args) {
	      String str = "4434";
		  String str1 = "5demo9";
	      System.out.println("String: "+str);
	      if(str.matches("[0-9]+") && str.length() > 2) {
	         System.out.println("String contains only digits!");
	      }
		  System.out.println("String:"+str1);
		   if(str1.matches("[0-9]+") && str1.length() > 2) {
	         System.out.println("String contains only digits!");
	      } else {
	         System.out.println("String contains digits as well as other characters!");
	      }
	   }
	}     
	   
