package com.xworkz.dp.dto;

public class Carpenter {
	String shopName;
	String name;
	int noofequivpments;
	String location;
	boolean good;
	
public Carpenter() {
	System.out.println("The Carpenter");
	}

public String getShopName() {
	return shopName;
}

public void setShopName(String shopName) {
	this.shopName = shopName;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getNoofequivpments() {
	return noofequivpments;
}

public void setNoofequivpments(int noofequivpments) {
	this.noofequivpments = noofequivpments;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public boolean isGood() {
	return good;
}

public void setGood(boolean good) {
	this.good = good;
}

public Carpenter(String shopName, String name, int noofequivpments, String location, boolean good) {
	super();
	this.shopName = shopName;
	this.name = name;
	this.noofequivpments = noofequivpments;
	this.location = location;
	this.good = good;
}

}
