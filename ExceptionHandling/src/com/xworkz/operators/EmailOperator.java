package com.xworkz.operators;

import com.xworkz.exception.EmailValidationException;

public class EmailOperator {

	private String[] mail = new String[5];
	private int count = 0;

	public void save(String email)throws EmailValidationException{
			System.out.println("invoked save method of email operator");
			if(count<mail.length&&email!=null) {
				this.mail[this.count++]=email;
					if(email.contains("@")&& email.endsWith(".com")) {
						System.out.println("Email is validated");
					}else
					{
						System.out.println("email is not validated");
					}
				}
				else{
					System.out.println("null passed");
					throw new EmailValidationException();
				}
			}
}
