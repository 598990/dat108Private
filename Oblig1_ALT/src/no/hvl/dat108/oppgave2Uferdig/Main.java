package no.hvl.dat108.oppgave2Uferdig;

public class Main {

	public static void main(String[] args) {

		final String[] kokker = {"Anne", "Erik", "Knut"};
		final String[] servitorer = {"Mia", "Per"};
		final int kapasitet = 4;
		
		HamburgerBrett brett = new HamburgerBrett(kapasitet);
		
		for(String navn : kokker) {
			new Kokk(brett, navn).start();
		}
		
		for(String navn : servitorer) {
			new Servitor(brett, navn).start();
		}
	}

}
