package no.hvl.dat108.oppgave2Uferdig;


public class Kokk extends Thread {
	
	private HamburgerBrett brett;
	private String navn;

	public Kokk(HamburgerBrett brett, String navn) {
		this.brett = brett;
		this.navn = navn;
	}
	
	public String getNavn() {
		return navn;
	}
	
	@Override
	public void run() {
		//TODO kall metoden fra hamburgerbrett med gjevne mellomrom
	}
	
}
