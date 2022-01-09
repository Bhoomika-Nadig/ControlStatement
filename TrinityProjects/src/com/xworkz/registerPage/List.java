package com.xworkz.registerPage;

import java.util.Scanner;

public class List {

static Scanner sc=new Scanner(System.in);
	
	public static void regDetails() {
			System.out.println("Register Page");
			System.out.println("Enter your name");
			String name= sc.next();
			System.out.println("Enter you email");
			String email = sc.next();
			System.out.println("Contact Details");
			long num = sc.nextLong();
			
			
	}
		
	public static void main(String[] args) {
		String text;
		
		
		do {
			
			
			System.out.println("Press 1 for the Java");
			System.out.println("Press 2 for the MySQL");
			System.out.println("Press 3 for the HTML");
			
			System.out.println("Select your option");
			
			int option = sc.nextInt();
			
			switch(option) {
			
			case 1:System.out.println("You have enrolled for Java Training");
					List.regDetails();
					System.out.println("Course cost is 20000");
					System.out.println("Enter your payment paid");
					int fee=sc.nextInt();
					if(fee==20000) {
							System.out.println("You have successfully registered for Java Training");
					}
					
			break;
				
			case 2:System.out.println("You have enrolled for MySQL Training");
					List.regDetails();
					System.out.println("Course cost is 10000");
					System.out.println("Enter your payment paid");
					int fee1=sc.nextInt();
					if(fee1==10000) {
							System.out.println("You have successfully registered for MySQL Training");
					}
			break;
			
			case 3:System.out.println("You have enrolled for HTML Training");
					List.regDetails();
					System.out.println("Course cost is 10000");
					System.out.println("Enter your payment paid");
					int fee2=sc.nextInt();
					if(fee2==10000) {
						System.out.println("You have successfully registered for HTML Training");
					}
			break;
			
			default:System.out.println("Invalid Enrollment");
			
			break;
			}
			System.out.println("Do you want to continue Y for Yes or N for No");
			text=sc.next();
		}while(text.equals("Y"));
	}

	
}