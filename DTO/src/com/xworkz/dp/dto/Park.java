package com.xworkz.dp.dto;

public class Park {
String parkName;
int timings;
String location;
int noofseats;
String city;
int noofequivemnts;
int typesofplants;
public Park() {
	System.out.println("The Park");
}
public String getParkName() {
	return parkName;
}
public void setParkName(String parkName) {
	this.parkName = parkName;
}
public int getTimings() {
	return timings;
}
public void setTimings(int timings) {
	this.timings = timings;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getNoofseats() {
	return noofseats;
}
public void setNoofseats(int noofseats) {
	this.noofseats = noofseats;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getNoofequivemnts() {
	return noofequivemnts;
}
public void setNoofequivemnts(int noofequivemnts) {
	this.noofequivemnts = noofequivemnts;
}
public int getTypesofplants() {
	return typesofplants;
}
public void setTypesofplants(int typesofplants) {
	this.typesofplants = typesofplants;
}
public Park(String parkName, String location, int timings, String city, int noofseats , int noofequivemnts,
	int typesofplants) {
	super();
	this.parkName = parkName;
	this.location = location;
	this.timings= timings;
	this.city = city;
	this.noofequivemnts = noofequivemnts;
	this.typesofplants = typesofplants;
	this.noofseats = noofseats;
	
}

}
