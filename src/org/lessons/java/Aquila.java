package org.lessons.java;

public class Aquila extends Animale implements Ivolatili {

	@Override
	public void verso() {
		System.out.println("Grrr!!!");
	}

	@Override
	public void mangia() {
		System.out.println(" uccelli");

	}

	@Override
	public void vola() {
		System.out.println(" l'aquila vola: Sto Volandoooo!!!!");

	}

}
