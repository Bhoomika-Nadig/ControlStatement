package com.xworkz.registerPage;

public class Alphabet{
public static void main(String[] args) {

	System.out.println("Alphabet pattern");
	int alphabet=65;
	int n=6;
	 for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
		System.out.println();
	}
}
}
