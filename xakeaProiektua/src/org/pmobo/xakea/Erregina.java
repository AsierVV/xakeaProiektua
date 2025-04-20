package org.pmobo.xakea;

public class Erregina extends Pieza{

	//eraikitzailea
	public Erregina(boolean pZuriaDa, Laukia pLaukia) {
		super(pZuriaDa, pGalduta, pLaukia);
	}

	@Override
	public boolean mugimenduEgokia(int pX, int pY, Laukia pLaukia){
		if((pX==pLaukia.getX() && pY!=pLaukia.getY()) || ((pX!=pLaukia.getX() && pY==pLaukia.getY()) || Math.abs(pX-pLaukia.getX())==Math.abs(pY-pLaukia.getY()))) {
			if(bideanZerbait(pX, pY, pLaukia.getX(). pLaukia.getY())){
				return false;
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
