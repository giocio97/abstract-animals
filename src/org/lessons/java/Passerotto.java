package org.lessons.java;

public class Passerotto extends Animale implements Volatili {

	@Override
	void verso() {
		System.out.println("Cip, Cip!!");
	}

	@Override
	void mangia() {
		System.out.println("vermi");

	}

}
