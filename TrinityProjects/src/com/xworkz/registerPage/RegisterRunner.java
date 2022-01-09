package com.xworkz.registerPage;
import com.xworkz.register.*;
import java.util.Scanner;

public class RegisterRunner{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num==1)
		System.out.println("welcome to register page");
		else
			System.out.println("welcome to login page");
		    System.out.println("Enter the size");
		    int size = sc.nextInt();
		
		
		Register register1 = new Register(size);
		for(int i=0;i<=size;i++){
			System.out.println("name");
			String name=sc.next();
			System.out.println("password");
			String password=sc.next();
			System.out.println("Enter the date of birth");
			String DOB = sc.next();
			
			RegisterDTO registerdto = new RegisterDTO();
			registerdto.setName(name);
			registerdto.setPassword(password);
			registerdto.setDob(DOB);
			
			System.out.println(register1.RegisterAll(registerdto));
			
		}
	}
}
			