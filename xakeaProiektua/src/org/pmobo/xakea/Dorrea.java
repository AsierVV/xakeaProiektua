package org.pmobo.xakea;

public class Dorrea extends Pieza{

	//eraikitzailea
	public Dorrea(boolean pZuriaDa, Laukia pLaukia) {
		super(pZuriaDa, pLaukia);
	}

	@Override
	public boolean mugimenduEgokia(int pX, int pY, Laukia pLaukia){
		if (pX < 0 || pX > 7 || pY < 0 || pY > 7) {
		        return false;
		}
		if ((pX==pLaukia.getX() && pY!=pLaukia.getY()) || ((pX!=pLaukia.getX() && pY==pLaukia.getY()))) {
			if(bideanZerbait(pX, pY, pLaukia.getX(), pLaukia.getY())){
				return false;
			} else {
				//okupatutaDago --> false: ez dago okupatuta edo okupatuta dago bere kolore ezberdina duen piezaz
				//              --> true: okupatuta dago bere kolore berdina duen piezaz
				if (okupatutaDago(pX, pY, pKolorea)){
					return false;
				} else {return true;}
			}
		} else{return false;}
	}
	@Override
	public String toString() {
	    return getZuriaDa() ? "♖" : "♜";  
	}
}


