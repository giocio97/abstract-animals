package org.lessons.java;

public class Aquila extends Animale implements Volatili {

	@Override
	void verso() {
		System.out.println("Grrr!!!");
	}

	@Override
	void mangia() {
		System.out.println(" uccelli");

	}

}
