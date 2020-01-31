package com.qa.garage2;

public abstract class Vehicle2 {

	private String colour;
	public abstract float bill();
	
	public Vehicle2(String colour) {
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}
