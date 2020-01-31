package com.qa.birdwatching;

public class Bird {
	private int altitude = 0;
	
	public void fly() {
		this.altitude ++;
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

}
