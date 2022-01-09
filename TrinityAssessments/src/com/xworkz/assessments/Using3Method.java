package com.xworkz.assessments;
import java.util.*;

public class Using3Method {



	  public static Character firstNonRepeatedCharacter(String str)
	    {
	        Set<Character> repeatingChars = new HashSet<>();
	        List<Character> nonRepeatingChars = new ArrayList<>();
	        for(int i=0; i < str.length(); i++) {
	            char letter = str.charAt(i);
	            if(repeatingChars.contains(letter))
	                continue;
	            if(nonRepeatingChars.contains(letter)) {
	                nonRepeatingChars.remove((Character) letter);
	                repeatingChars.add(letter);
	            }
	            else {
	                nonRepeatingChars.add(letter);
	            }
	        } 
	        return nonRepeatingChars.get(0);
	    }

	    public static void main(String[] args)
	    {
	        
	        System.out.println(" Please enter the input string :" );
	        Scanner in = new Scanner (System.in);
	        String s = in.nextLine();
	        char ch = firstNonRepeatedCharacter(s);
	        System.out.println("The first non repeated character is :  " + ch);
	    }
	}    