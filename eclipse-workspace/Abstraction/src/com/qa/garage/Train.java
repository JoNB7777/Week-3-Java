//package com.qa.garage;
//
//public class Train extends Vehicle {
//	private int coachNumber;
//	private int ticketPrice = 15;
//	
//	public Train(int coachNumber, int travelledDistance, int speed) {
//		super(travelledDistance);
//		this.setCoachNumber(coachNumber);
//		super(speed);
//	}
//	
//	@Override
//	public void move () {
//		this.setTravelledDistance(this.getTravelledDistance() + 20);
//		
//	}
//	
//	@Override
//	public void accelerate() {
//		if (this.getSpeed() <= 330) {
//			this.setSpeed(this.getSpeed() + 30);
//		}
//	}
//	
//	
//	public void addAdditionalCoach() {
//		this.setCoachNumber(this.getCoachNumber() + 1);
//	}
//	
//	public void increaseTicketPrice() {
//		this.setTicketPrice(this.getTicketPrice() + 5);
//	}
//
//	public int getCoachNumber() {
//		return coachNumber;
//	}
//
//	public void setCoachNumber(int coachNumber) {
//		this.coachNumber = coachNumber;
//	}
//
//	public int getTicketPrice() {
//		return ticketPrice;
//	}
//
//	public void setTicketPrice(int ticketPrice) {
//		this.ticketPrice = ticketPrice;
//	}
//
//}
