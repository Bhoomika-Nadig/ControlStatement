package com.xworkz.registerPage;

public class Test  {
	public static void main(String[] args) {
    int n = 5;  
   
    int i=0;
    
   
    for(i=0;i<n;i++)
    {
        for(int k=0;k<i;k++)
        System.out.print("  ");
        

        for(int j=i;j<n;j++)
        {
        
          System.out.print("* ");
        }
        
        System.out.println();
    }
    
    n=i;  
    
    int m=2;
    for(i=0;i<n-1;i++)
    {
       
        for(int k=i;k<n-2;k++)
        System.out.print("  ");
        
      
        for(int j=0;j<m;j++)
        {
      
          System.out.print("* ");
        }
        m++;
        System.out.println();
    }
      
}
} 