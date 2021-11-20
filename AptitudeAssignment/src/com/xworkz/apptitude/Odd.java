package com.xworkz.apptitude;

public class Odd {
	public static void main(String[]args){
	{
		   int n=10;
  System.out.print("even numbers from 1 to n+  ");
  for(int i=1; i<=n; i++)
	 {
		if(i%2!=0){
		System.out.print(i);	
		 
	 }
	 }
	 
     while(n<=10)
		{
		if(n%2!=0)
		{
			
		System.out.print(n );  
	   }
	   n++;
	 }
	 
	  do{
		  if(n%2==1){
			System.out.print(n);
		  }
		  n++;
	  }
	  while(n<=10);

} 
}
}