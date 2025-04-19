package org.pmobo.xakea;

public class Dorrea extends Pieza{

	//eraikitzailea
	public Dorrea(boolean pZuriaDa, Laukia pLaukia) {
		super(pZuriaDa, pGalduta, pKoordenatuak);
	}

	@Override
	public boolean mugimenduEgokia(int pX, int pY, Laukia pLaukia){
		if ((pX==pLuakia.getX() && pY!=pLaukia.getY()) || ((pX!=pLuakia.getX() && pY==pLaukia.getY()))) {
			if(bideanZerbait(pX, pY, pLaukia.getX(). pLaukia.getY())){
				return false
			} else {
				//okupatutaDago --> false: ez dago okupatuta edo okupatuta dago bere kolore ezberdina duen piezaz
				//              --> true: okupatuta dago bere kolore berdina duen piezaz
				if (okupatutaDago(pX, pY, pZuriaDa)){
					return false;
				} else {return true;}
			}
		} else{return false;}
	}
}
