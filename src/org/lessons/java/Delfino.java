package org.lessons.java;

public class Delfino extends Animale implements Inuotatori {

	@Override
	public void verso() {
		System.out.println("Fiiii!!!");

	}

	@Override
	public void mangia() {
		System.out.println("Pesci");

	}

	@Override
	public void nuota() {
		System.out.println(" il delfino nuota: Sto nuotando!!!!");

	}

}
