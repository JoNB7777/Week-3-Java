package com.qa.evolution;

import java.util.ArrayList;

public class Runner {
	public static void main(String [] args) {
		RattleSnake james = new RattleSnake();
		BlackMamba tyler = new BlackMamba();
		Snake a = (Snake) james;
		Snake b = (Snake) tyler;
		a.bite();
		b.bite();
		ArrayList<Snake> snakes = new ArrayList<Snake>();
		snakes.add(a);
		snakes.add(b);
		RattleSnake  stillJames = (RattleSnake) a;
		
	}

}
