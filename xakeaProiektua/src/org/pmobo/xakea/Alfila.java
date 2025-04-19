package org.pmobo.xakea;

public class Alfila extends Pieza {

	//eraikitzailea
	public Alfila(boolean pZuriaDa, boolean pGalduta, Laukia pKoordenatuak) {
		super(pZuriaDa, pGalduta, pKoordenatuak);
	}
	@Override
	public boolean mugimenduEgokia(int pX, int pY, Laukia pLaukia) {
		// he puesto esto porque siempre si se mueve uno de Y se tiene que mover otro de X (da igual la dirección)
		// El comando "Math.abs()" coge el valor absoluto del numero
		if(Math.abs(pX-pLaukia.getX())==Math.abs(pY-pLaukia.getY())) {
			if(bideanZerbait(pX, pY, pLaukia.getX(), pLaukia.getY())){
				return false;
			} else {
				//okupatutaDago --> false: ez dago okupatuta edo okupatuta dago bere kolore ezberdina duen piezaz
				//              --> true: okupatuta dago bere kolore berdina duen piezaz
				if (okupatutaDago(pX, pY, pZuriaDa)){
					return false;
				} else {return true;}
			}
		} else {return false;}
	}
}
