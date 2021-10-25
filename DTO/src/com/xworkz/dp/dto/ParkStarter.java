package com.xworkz.dp.dto;

public class ParkStarter {
	//Park(String parkName, String location, int timings, String city, int noofseats , int noofequivemnts,
	//nt typesofplants) {
	public static void main(String[] args) {
		Park parkOperation=new Park();
		parkOperation.setCity("Shivmogga");
		parkOperation.setLocation("vinob nagar");
		parkOperation.setNoofequivemnts(5);
		parkOperation.setParkName("kabnan park");
		parkOperation.setTimings(10);
		parkOperation.setTypesofplants(5);
		parkOperation.setNoofseats(15);
	

		

		Park park4= new Park("Banglore","lalbagh", 16, "brundavana park", 10,5,13);
		Park park2 = new Park ("Manglore","gandhi bazar", 13,  "seasonal park",15,3,15);
		Park park3 =new  Park ("udupi","rajaji nagar", 12,  "Gandhi park",12,3,15);
		Park[] fig = new Park[3];
		fig[0] = park3;
		fig[1] = park2;
		fig[2] = park4;
		for (int lock = 0; lock < fig.length; lock++) {
			Park ref = fig[lock];
			if (ref != null) {
                System.out.println(ref.getCity());
				System.out.println(ref.getLocation());
				System.out.println(ref.getNoofequivemnts());
				System.out.println(ref.getNoofseats());
				System.out.println(ref.getParkName());
				System.out.println(ref.getTimings());
				System.out.println(ref.getTypesofplants());
			} else {
				System.out.println("index is pointing to null".concat(String.valueOf(lock)));

			}
		}
	}

}

	
		
