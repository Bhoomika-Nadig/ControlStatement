package com.xworkz.assessments;
import java.util.*;
import java.util.Map.Entry;

public class UsingLinkedHashMap {

	 public static void main(String[] args)
	    {
	        
	        System.out.println(" Please enter the input string :" );
	        Scanner in = new Scanner (System.in);
	        String s = in.nextLine();
	        char ch = firstNonRepeatedCharacter(s);
	        System.out.println("The first non repeated character is :  " + ch);
	    }
	    
	    public static Character firstNonRepeatedCharacter(String str)
	    {
	        HashMap<Character,Integer>  characterhashtable = 
	                         new LinkedHashMap<Character ,Integer>();
	        int length ;
	        Character ch;
	        length= str.length();  // Scan string and build hash table
	        for (int i=0;i < length;i++)
	        {
	            ch = str.charAt(i);
	            if(characterhashtable.containsKey(ch))
	            {
	                // increment count corresponding to ch
	                characterhashtable.put(  ch ,  characterhashtable.get(ch) +1 );
	            }
	            else
	            {
	                characterhashtable.put( ch , 1 ) ;
	            }
	        }
	        for(Entry<Character, Integer> entry: characterhashtable.entrySet())
	        {
	            if(entry.getValue() == 1)
	                return entry.getKey();
	        }
	        return null;
	    }
	}    