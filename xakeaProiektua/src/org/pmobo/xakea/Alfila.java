package org.pmobo.xakea;

public class Alfila extends Pieza {

	//eraikitzailea
	public Alfila(boolean pZuriaDa, Laukia pLaukia) {
		super(pZuriaDa, pLaukia);
	}
	@Override
	public boolean mugimenduEgokia(int pX, int pY, Laukia pLaukia) {
	    if (pX < 0 || pX > 7 || pY < 0 || pY > 7) {
	        return false;
	    }
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
	@Override
	public String toString() {
	    return getZuriaDa() ? "♗" : "♝";  
	}
}
