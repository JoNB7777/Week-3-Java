package com.qa.garage2;

public class Car2 extends Vehicle2 {
	private boolean radio;
	
	public Car2(String colour, boolean radio) {
		super(colour);
		this.radio = radio;
	}
	
	@Override
	public float bill() {
		if(radio) {
			return 1000;
		} else {
			return 500;
		}
	}

	
	

}
