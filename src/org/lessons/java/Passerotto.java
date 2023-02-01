package org.lessons.java;

public class Passerotto extends Animale implements Ivolatili {

	@Override
	public void verso() {
		System.out.println("Cip, Cip!!");
	}

	@Override
	public void mangia() {
		System.out.println("vermi");

	}

	public void vola() {
		System.out.println(" il passerotto vola: Sto Volandoooo!!!!");
	}

}
