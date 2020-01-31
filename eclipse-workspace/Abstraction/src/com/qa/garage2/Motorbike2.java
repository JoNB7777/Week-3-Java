package com.qa.garage2;

public class Motorbike2 extends Vehicle2 {
	private boolean damaged;

	public Motorbike2(String colour, boolean damaged) {
		super(colour);
		this.damaged = damaged;
	}
	
	@Override
	public float bill() {
		if (damaged) {
			return 30000;
		} else {
			return 4000;
		}
	}
	

}
