package com.xworkz.Crud;

public class AirportRunner {
	private String[] airportNames = new String[3];
	private int counter;

	private String[] getAirportName() {
		return airportNames;
	}

	public void addName(String name) {
		System.out.println("names of airport".concat(name));
		if (this.counter < this.airportNames.length) {
			this.airportNames[this.counter++] = name;
		} else {
			System.err.println("cannot load out");
		}
	}

	/*
	 * public void addName(String name) {
	 * System.out.println("names of airport"+name); if(this.counter<5){ counter++; }
	 * else{ System.err.println("cannot load"); } } }
	 * 
	 * 
	 * }
	 */
	public void delete(int index) {
		if (index < this.airportNames.length && index >= 0) {
			this.airportNames[index] = null;
		} else {
			System.out.println("cannot add the index");
		}
	}

public void update(int jelabi,String ref)
{
if (ref!=null)
{
	if(jelabi<this.airportNames.length && jelabi>=0) {
		
		{
			this.airportNames[jelabi]=ref;
			}
}
		else
		{
			System.out.println("updated Succsufully");
		}
	}
	else {
		System.out.println("cannot update chikki");
	}
}
}


