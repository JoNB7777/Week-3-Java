package com.qa.garage2;

import java.util.ArrayList;
import java.util.List;

public class Garage2 {

	public static void main(String[] args) {
		List<Vehicle2> vehicles = new ArrayList<Vehicle2>();
		Vehicle2 car = new Car2("red", true);
		Vehicle2 motorbike = new Motorbike2("black", false);
		vehicles.add(car);
		vehicles.add(motorbike);
		vehicles.add(new Boat2("blue", true));
		vehicles.stream().forEach(vehicle -> System.out.println(vehicle +" bill: " + vehicle.bill()));
		System.out.println("Apple".substring(0,3));

	}

}
