package org.pmobo.xakea;

public class Erregea extends Pieza{

	//eraikitzailea
	public Erregea(boolean pZuriaDa) {
		super(pZuriaDa);
	}

	@Override
	public boolean mugimenduEgokia(int pX, int pY, Laukia pLaukia){
		if (pX < 0 || pX > 7 || pY < 0 || pY > 7) {
	        return false;
		}
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
