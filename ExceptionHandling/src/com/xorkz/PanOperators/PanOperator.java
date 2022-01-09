package com.xorkz.PanOperators;

import com.xworkz.PanException.PanValidationException;

public class PanOperator {
	private String[] pan = new String[5];
	private int count = 0;

	public void save(String pan)throws PanValidationException{
			System.out.println("invoked save method of pan operator");
			if(count<pan.length() &&pan!=null) {
				this.pan[this.count++]=pan;
					if(pan.contains("Capital") && pan.endsWith("num")) {
						System.out.println("Pan is validated");
					}else
					{
						System.out.println("pannumber is not validated");
					}
				}
				else{
					System.out.println("null passed");
					throw new PanValidationException(pan);
				}
			}
}


