package com.xworkz.test;
import java.io.*;

public class Pattren {
	    
	    static void print_rectangle(int n, int m)
	    {
	        int i, j;
	        for (i = 1; i <= n; i++)
	        {
	            for (j = 1; j <= m; j++)
	            {
	                if (i == 1 || i == n ||
	                    j == 1 || j == m)           
	                    System.out.print("*");           
	                else
	                    System.out.print(" ");           
	            }
	            System.out.println();
	        }
	      
	    }
	      
	    public static void main(String args[])
	    {
	        int rows = 7, columns = 7;
	        print_rectangle(rows, columns);
	    }
	}