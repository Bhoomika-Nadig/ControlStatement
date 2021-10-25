package com.xworkz.dp.dto;

public class Starter {

	public static void main(String[] args) {
		Bracelet bracelet = new Bracelet();
		bracelet.setColor("gold");
		bracelet.setGemused(true);
		bracelet.setGifted(true);
		bracelet.setMeterial("iron");

		Bracelet bracelet2 = new Bracelet("plastic", "red", true, true);
		Bracelet bracelet3 = new Bracelet("gold", "purple", true, true);
		Bracelet bracelet4 = new Bracelet("dimond", "green", true, true);

//group all bracelet
		Bracelet[] fig = new Bracelet[3];
		fig[0] = bracelet3;
		fig[1] = bracelet2;
		fig[2] = bracelet4;
		for (int lock = 0; lock < fig.length; lock++) {
			Bracelet ref = fig[lock];
			if (ref != null) {
                System.out.println(ref.getColor());
				System.out.println(ref.getMeterial());
				System.out.println(ref.isGemused());
				System.out.println(ref.isGifted());
			} else {
				System.out.println("index is pointing to null".concat(String.valueOf(lock)));

			}
		}
	}

}
