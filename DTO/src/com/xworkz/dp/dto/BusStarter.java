package com.xworkz.dp.dto;

public class BusStarter {
	public static void main(String[] args) {
		BusConductor busconductor = new BusConductor();
		busconductor.setBusrootname("mysore");
		busconductor.setBustimings(10);
		busconductor.setShifts(3);
		busconductor.setName("mohan");
		busconductor.setConductorthere(true);
		busconductor.setSalary(10000.00f);
		
		

		BusConductor busconductor2 = new BusConductor("Mysore bus","bmtc", 10, 2, "Mohan",true,10000.0f);
		BusConductor busconductor3 = new BusConductor("Shivmogga bus","bmtc", 13, 5, "Manoohar",true,15000.0f);
		BusConductor busconductor4= new BusConductor("banglore bus","bmtc", 2, 2, "siddhu",false,13000.0f);
//group all bracelet
		BusConductor[] fig = new BusConductor[3];
		fig[0] = busconductor3;
		fig[1] = busconductor2;
		fig[2] = busconductor4;
		for (int lock = 0; lock < fig.length; lock++) {
			BusConductor ref = fig[lock];
			if (ref != null) {
                System.out.println(ref.getBusrootname());
				System.out.println(ref.getBustimings());
				System.out.println(ref.getShifts());
				System.out.println(ref.getName());
				System.out.println(ref.isConductorthere());
				System.out.println(ref.getSalary());
			} else {
				System.out.println("index is pointing to null".concat(String.valueOf(lock)));

			}
		}
	}

}

