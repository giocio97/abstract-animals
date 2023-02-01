package org.lessons.java;

public class Delfino extends Animale implements Necton {

	@Override
	void verso() {
		System.out.println("Fiiii!!!");

	}

	@Override
	void mangia() {
		System.out.println("Pesci");

	}

}
