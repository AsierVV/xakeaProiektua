package org.pmobo.xakea;

public class Erregea extends Pieza{

	//eraikitzailea
	public Erregea(boolean pZuriaDa, Laukia pLaukia) {
		super(pZuriaDa, pLaukia);
	}

	@Override
	public boolean mugimenduEgokia(int pX, int pY, Laukia pLaukia){
		if((pX==pLaukia.getX() && pY-pLaukia.getY()==1) || (pX-pLaukia.getX()==1 && pY-pLaukia.getY()==1) || (pX-pLaukia.getX()==1 && pY==pLaukia.getY()) || (pX-pLaukia.getX()==1 && pY-pLaukia.getY()==-1) || (pX==pLaukia.getX() && pY-pLaukia.getY()==-1) || (pX-pLaukia.getX()==-1 && pY-pLaukia.getY()==-1) || (pX-pLaukia.getX()==-1 && pY==pLaukia.getY()) || (pX-pLaukia.getX()==-1 && pY-pLaukia.getY()==1)){
			//okupatutaDago --> false: ez dago okupatuta edo okupatuta dago bere kolore ezberdina duen piezaz
			//              --> true: okupatuta dago bere kolore berdina duen piezaz
			if(okupatutaDago(pX, pY, pZuriaDa)){
				return false;
			} else {return true;}
		} else {return false;}
	}
	@Override
	public String toString() {
	    return getZuriaDa() ? "♔" : "♚";  // Rey blanco y negro
	}
}
