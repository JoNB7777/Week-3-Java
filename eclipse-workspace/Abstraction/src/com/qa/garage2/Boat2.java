package com.qa.garage2;

public class Boat2 extends Vehicle2{
	private boolean painted;

	public Boat2(String colour, boolean painted) {
		super(colour);
		this.painted = painted;
	}
	
	@Override
	public float bill() {
		if (painted)
		{
			return 5000;
		} else {
			return 50000;
		}
	}
	

}
