package org.lessons.java;

public class Main {

	public static void main(String[] args) {

		Movimento mov = new Movimento();

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
		mov.vola(charlie);

		Delfino willy = new Delfino();
		System.out.println("Delfino: ");
		willy.dormi();
		willy.mangia();
		willy.verso();
		mov.nuota(willy);

		Aquila lia = new Aquila();
		System.out.println("Aquila: ");
		lia.dormi();
		lia.mangia();
		lia.verso();
		mov.vola(lia);

	}

}
