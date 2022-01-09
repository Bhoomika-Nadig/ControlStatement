package com.xworkz.registerPage;

public static void emptyStar(){
	 int n = 6;
    for(int i=0;i<n;i++)
    {
       
        for(int k=i;k<n;k++)
        System.out.print("  ");

        for(int j=0;j<n;j++)
        {
          if(j==0 || j==i || i==n-1)
          System.out.print(" *");
          else
          System.out.print("  ");
        }

        System.out.println();
    }
}
}