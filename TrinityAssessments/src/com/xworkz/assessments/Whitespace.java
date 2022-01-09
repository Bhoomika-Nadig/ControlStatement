package com.xworkz.assessments;

public class Whitespace {
	   public static void main(String[] args) {  
	        String str = "Bhoomika Nadig";   
	        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
	        System.out.println(noSpaceStr);  
	   }
}
	      