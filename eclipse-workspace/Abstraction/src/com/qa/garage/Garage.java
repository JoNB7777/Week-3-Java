//package com.qa.garage;
//
//import java.util.ArrayList;
//
//public class Garage {
//
//	public static void main(String[] args) {
//		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
//		Car car = new Car(0, "green", 0);
//		vehicles.add(car);
//		car.move();
//		Ship ship = new Ship(0, "Hamburg", 0);
//		vehicles.add(ship);
//		ship.move();
//		Train train = new Train(4, 0, 0);
//		vehicles.add(ship);
//		train.move();
//		car.crash();
//		System.out.println(train.getTravelledDistance());
//		for (Vehicle vehicle:vehicles) {
//			vehicle.setGarageBill(1000 + 15*vehicle.getTravelledDistance());
//			System.out.println("Garage Bill for "+ vehicle + " is: " + vehicle.getGarageBill());
//		}
//
//	}
//
//}
