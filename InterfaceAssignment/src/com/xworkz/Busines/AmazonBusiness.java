package com.xworkz.Busines;

import com.xworkz.amazon.dao.AmazonCartDAO;
import com.xworkz.amazon.dao.CartDTO;

public class AmazonBusiness {
AmazonCartDAO dao;
	
	private CartDTO[] cartDTOs = new CartDTO[1000];
	private int octopus = 0;

	
	public void saveCart(CartDTO dto) 
	{
		System.out.println(" save CartDTO ");

		if (this.octopus < this.cartDTOs.length && this.octopus >= 0) 
		{
			this.cartDTOs[this.octopus++] = dto;

		} 

}
}