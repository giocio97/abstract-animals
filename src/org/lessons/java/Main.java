package org.lessons.java;

public class Main {

	public static void main(String[] args) {

		Cane billy = new Cane();
		System.out.println("Cane: ");
		billy.verso();
		billy.dormi();
		billy.mangia();

		Passerotto charlie = new Passerotto();
		System.out.println("Passerotto: ");
		charlie.dormi();
		charlie.mangia();
		charlie.verso();

		Delfino willy = new Delfino();
		System.out.println("Delfino: ");
		willy.dormi();
		willy.mangia();
		willy.verso();

		Aquila lia = new Aquila();
		System.out.println("Aquila: ");
		lia.dormi();
		lia.mangia();
		lia.verso();

	}

}
