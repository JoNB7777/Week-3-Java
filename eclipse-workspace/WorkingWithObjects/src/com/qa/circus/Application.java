package com.qa.circus;

public class Application {
	public static void main (String [] args) {
		Elephant dumbo = new Elephant("african", "grey");
		Elephant nellie = new Elephant("asian", "white");
		System.out.println(dumbo.legs);
		System.out.println(dumbo.species);
		System.out.println(nellie.species);
	}

}
