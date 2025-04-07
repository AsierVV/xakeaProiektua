package org.pmobo.xakea;

public class Peoia extends Pieza {

	//atributuak
	private boolean mugituDa;

	//eraikitzailea
	public Peoia(boolean pZuriaDa, boolean pGalduta, Laukia pKoordenatuak, boolean pMugituDa) {
		super(pZuriaDa, pGalduta, pKoordenatuak);
		this.mugituDa = pMugituDa;
	}
	
	
}
