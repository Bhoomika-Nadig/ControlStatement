package com.xworkz.register;

public class Register {

	private RegisterDTO[] register;
	private int index;
	
	public Register(int size){
		register=new RegisterDTO[size];
	
	}
	
	public boolean RegisterAll(RegisterDTO register){
		
		boolean saved=false;
		if(register!=null){
			if(register.getName()!=null && register.getPassword()!=null && register.getDob()!=null){
				this.register[index++]=register;
				saved=true;
			}else{
				System.out.println("Data is null");
			}
		}else{
			System.out.println("data not found");
		}
		return saved;
	}
}
