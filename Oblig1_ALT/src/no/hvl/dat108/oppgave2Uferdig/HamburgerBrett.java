package no.hvl.dat108.oppgave2Uferdig;

@SuppressWarnings("hiding")
public class HamburgerBrett {
	private LinearNode<Hamburger> foran, bak;
	private int maks, antall, id;

	/******************************************************************
	 * Oppretter en tom k�.
	 ******************************************************************/
	public HamburgerBrett(int maks) {
		foran = bak = null;
		antall = 0;
		id = 1;
		this.maks = maks;
	}

	/******************************************************************
	 * Legger inn et spesifisert element i k�en.
	 ******************************************************************/

	public synchronized void innKoe(Kokk k) {
		//TODO Legge til en ny Hamburger
	}

	/******************************************************************
	 * Fjerner og returnerer elementet foran i k�en.
	 * @throws EmptyCollectionException 
	 ******************************************************************/
	
	public synchronized Hamburger utKoe(Servitor s) {
		//TODO Fjerne det f�rste hamburger elementet
		
		return null;
	}

	/******************************************************************
	 * Returnerer elementet foran i k�en ute � fjerne det.
	 * @throws EmptyCollectionException 
	 ******************************************************************/
	
	public Hamburger foerste() throws EmptyCollectionException {
		if (erTom())
			throw new EmptyCollectionException("koe");

		Hamburger resultat = foran.getElement();
		return resultat;
	}

	/******************************************************************
	 * Returnerer sann hvis k�en er tom, usann ellers.
	 ******************************************************************/
	
	public synchronized boolean erTom() {
		return (foran == null && (bak == null));
	}
	
	/******************************************************************
	 * Returnerer sann hvis k�en er tom, usann ellers.
	 ******************************************************************/
	
	public synchronized boolean erFull() {
		return (antall == maks);
	}

	/******************************************************************
	 * Returnerer en strengrepresentasjon av elementene i k�en.
	 ******************************************************************/
	public String toString() {
		String resultat = "[ ";
		LinearNode<Hamburger> aktuell = foran;

		while (aktuell != null) {
			resultat = resultat + " " + (aktuell.getElement()).toString() + " ";
			aktuell = aktuell.getNeste();
		}

		return resultat + " ]";
	}
}// class