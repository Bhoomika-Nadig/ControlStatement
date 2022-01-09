package com.xworkz.assessments;

import java.util.Scanner;
public class DimondAlphabetPattren{

	public static void main(String[] args) {
		int A=65;	
	
		for(int i=0;i<6;i++) {       	                                    //Rows-0,1,2,3,4,5
				for(int k=1;k<6-i;k++) {                                    //spaces-6,5,4,3,2,1
						System.out.print(" ");
				}
				for(int j=0;j<=i;j++) {                                     //Alphabet-A,B,C,D,E,F
						char upperletters=(j==0||j==i)?(char)(A+i):' ';
								System.out.print(upperletters+" ");
				}
						System.out.println();
		}
		
		for(int i=4;i>=0;i--) {                                            //Rows-4,3,2,1,0
				for(int k=4-i;k>=0;k--) {                                  //spaces-1,2,3,4,5
						System.out.print(" ");
				}
				for(int j=0;j<=i;j++) {                                    //Alphabets-E,D,C,B,A
						char downletters = (j==0||j==i)?(char)(A+i):' ';
				System.out.print(downletters+" ");
			}
			System.out.println();
		}
	}
}