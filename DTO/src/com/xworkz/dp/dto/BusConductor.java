package com.xworkz.dp.dto;

public class BusConductor {
	private String busrootname;
	private String busname;
	private int bustimings;
	private int shifts;
	private String name;
	private boolean conductorthere;
	private float salary;

	public BusConductor() {
		System.out.println("bus is invoked by no arg");
	}

	public String getBusrootname() {
		return busrootname;
	}

	public void setBusrootname(String busrootname) {
		this.busrootname = busrootname;
	}

	public String getBusname() {
		return busname;
	}

	public void setBusname(String busname) {
		this.busname = busname;
	}

	public int getBustimings() {
		return bustimings;
	}

	public void setBustimings(int bustimings) {
		this.bustimings = bustimings;
	}

	public int getShifts() {
		return shifts;
	}

	public void setShifts(int shifts) {
		this.shifts = shifts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isConductorthere() {
		return conductorthere;
	}

	public void setConductorthere(boolean conductorthere) {
		this.conductorthere = conductorthere;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public BusConductor(String busrootname, String busname, int bustimings, int shifts, String name,
			boolean conductorthere, float salary) {
		super();
		this.busrootname = busrootname;
		this.busname = busname;
		this.bustimings = bustimings;
		this.shifts = shifts;
		this.name = name;
		this.conductorthere = conductorthere;
		this.salary = salary;
	}

}
