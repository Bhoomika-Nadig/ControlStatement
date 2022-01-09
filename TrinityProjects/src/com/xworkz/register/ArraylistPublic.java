package com.xworkz.register;

import java.util.Iterator;
import java.util.LinkedList;

public class ArraylistPublic{
public static void main(String args[]){  
	LinkedList<String> al=new LinkedList<String>();  
	al.add("bhoomi");  
	al.add("moni");  
	al.add("shama");  
	al.add("megha");  
	Iterator<String> itr=al.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  //Array Iterator
