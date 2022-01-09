package com.xworkz.test;
import java.util.Arrays;
class BinarySearch{
 public static void main(String [] raj)
 {
 byte [] numbers={9,3,15,10,67,69,44,89,31,77,87};
 byte num=69;
 BinarySearch binary=new BinarySearch();
 binary.search(numbers,num);
 }
   void search(byte [] numbers,byte num)
   {
	 Arrays.sort(numbers);
   int start=0;
   int end=numbers.length;
   int mid=numbers.length/2;
   
   while(mid>start && mid<end)
   {
    if(num == numbers[mid])
	{
	 System.out.println( num + "Number found");
	 break;
	}
	else if(num<numbers[mid])
	{
	 end=mid;
	mid=(start+end)/2;
	}
	else if(num>numbers[mid])
	{
		start=mid;
		mid=(start+end)/2;
	}
   }  
   }
   
 }



























+
