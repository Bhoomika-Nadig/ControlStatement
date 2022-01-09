package com.xwork.VeichleOperators;

import com.xworkz.VeichleException.VeichleValidationException;

public class VeichleOperators {

	private String[] Veichle = new String[5];
	private int count = 0;

	public void save(String pan)throws PanValidationException{
			System.out.println("invoked save method of veichle operator");
			if(count<Veichle.length&&Veichle!=null) {
				this.Veichle[this.count++]=pan;
					if(Veichle.contains("Capital") && Veichle.endsWith("num")) {
						System.out.println("veichle is validated");
					}else
					{
						System.out.println("veichle is not validated");
					}
				}
				else{
					System.out.println("null passed");
					throw new 	VeichleValidationException(veichle);
				}
			}

	private boolean endsWith(String num) {
		return false;
	}
}

