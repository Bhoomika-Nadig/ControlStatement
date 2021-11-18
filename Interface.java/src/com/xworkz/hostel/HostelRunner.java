package com.xworkz.hostel;
import com.xworkz.bridge.HostelRule;
import com.xworkz.bridge.SharavathiHostel;

public class HostelRunner {

	public static void main(String[] args) {
		HostelRule hostelrule=new SharavathiHostel();
		hostelrule.intime();
		
		SharavathiHostel hostel=new SharavathiHostel();
		hostel.intime();
		hostel.visitingDay();
		hostel.breakFast();
	}

}
