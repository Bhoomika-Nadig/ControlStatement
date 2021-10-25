package com.xworkz.dp.dto;

public class Bracelet {

	private String color;
	private String meterial;
	private boolean gemused;
	private boolean gifted;
	
	public Bracelet() {
		System.out.println("Bracelet invoked");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMeterial() {
		return meterial;
	}

	public Bracelet(String color, String meterial, boolean gemused, boolean gifted) {
		super();
		this.color = color;
		this.meterial = meterial;
		this.gemused = gemused;
		this.gifted = gifted;
	}

	public void setMeterial(String meterial) {
		this.meterial = meterial;
	}

	public boolean isGemused() {
		return gemused;
	}

	public void setGemused(boolean gemused) {
		this.gemused = gemused;
	}

	public boolean isGifted() {
		return gifted;
	}

	public void setGifted(boolean gifted) {
		this.gifted = gifted;
	}
	
}

