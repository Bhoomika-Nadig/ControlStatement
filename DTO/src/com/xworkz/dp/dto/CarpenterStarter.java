package com.xworkz.dp.dto;

public class CarpenterStarter {

	public static void main(String[] args) {
		// (String shopName, String name, int noofequivpments, String location, boolean
		// good)
		Carpenter carpenterOperator = new Carpenter();
		carpenterOperator.setShopName("Akash Carpenters");
		carpenterOperator.setName("Vinod");
		carpenterOperator.setNoofequivpments(15);
		carpenterOperator.setLocation("banglore");
		carpenterOperator.setGood(true);

	}

	Carpenter carpenterOperator2 = new Carpenter("SM WoodWork", "Shivayya", 10, "Banglore", true);
	Carpenter carpenterOperator4 = new Carpenter("carpentary", "kariyappa", 14, "mysore", true);
	Carpenter carpenterOperator3 = new Carpenter("GK WoodWorks", "deilpp", 13, "Manglore", false);
	Carpenter[]fig = new Carpenter[3]
	fig[0]=carpenterOperator3
    fig[1]=carpenterOperator3;
	fig[2]=carpenterOperator4;
	for(int lock = 0;lock<fig.length;lock++)
	{
		Carpenter ref = fig[lock];
		if (ref != null) {
			System.out.println(ref.getShopName());
			System.out.println(ref.getName());
			System.out.println(ref.getNoofequivpments());
			System.out.println(ref.getLocation());
			System.out.println(ref.isGood());
		} else {
			System.out.println("index is pointing to null".concat(String.valueOf(lock)));

		}
	}
}

}
