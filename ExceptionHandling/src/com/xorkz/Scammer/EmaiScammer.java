package com.xorkz.Scammer;
import com.xworkz.exception.EmailValidationException;
import com.xworkz.operators.EmailOperator;


public class EmaiScammer {

	public static void main(String[] args)throws EmailValidationException{
	
 EmailOperator emailoperator=new EmailOperator();
 emailoperator.save("bhoomikanadig@gmail.com");
	}
}
