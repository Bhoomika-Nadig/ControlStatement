package com.xworkz.assessments;
import java.util.*;
import java.util.stream.*;

public class Using4Method {
	 public static Character findFirstNonRepeatableChar(String str) {
	        Map<Character,Integer> map = new LinkedHashMap();
	        for (Character ch : str.toCharArray()) {
	            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
	        }
	        return map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
	} 
	    

	    public static void main(String[] args)
	    {
	        String s = "hheelo";
	        char ch = findFirstNonRepeatableChar(s);
	        System.out.println( ch);
	    }
	}  