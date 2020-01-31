package com.qa.circus;

public class Elephant {
	String species; 
	String colour;
	int legs;
	/**
	 * This creates an Elephant
	 * @param species: this is the species, e.g. "African", "Indian"
	 * @param colour: colour of the elephant
	 */
	
	public Elephant(String species, String colour) {
		this.species = species;
		this.colour = colour;
		this.legs= 4;
		System.out.println("An elephant is born");
	}
	
	public void haveMudBath() {
		colour = "Brown";
	}
	
	public void getPainted(String paint) {
		colour = paint;
	}
}
