//package com.qa.garage;
//
//public class Car extends Vehicle {
//	private String colour;
//	private int value = 25000;
//	
//	public Car(int travelledDistance, String colour, int speed) {
//		super(travelledDistance);
//		this.setColour(colour);
//		super(speed);
//	}
//	@Override
//	public void move() {
//		this.setTravelledDistance(this.getTravelledDistance() + 10);
//	}
//	
//	@Override
//	public void accelerate() {
//		if (this.getSpeed() <= 200) {
//			this.setSpeed(this.getSpeed() + 10);
//		}
//	}
//	
//	public void paintCar(String colour) {
//		this.setColour(colour);
//		this.setValue(20000);
//	}
//	
//	public void crash() {
//		this.setValue(0);
//		System.out.println("Car crashed and is beyond repair");
//	}
//	public String getColour() {
//		return colour;
//	}
//	public void setColour(String colour) {
//		this.colour = colour;
//	}
//	public int getValue() {
//		return value;
//	}
//	public void setValue(int value) {
//		this.value = value;
//	}
//
//}
