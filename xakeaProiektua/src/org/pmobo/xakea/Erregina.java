package org.pmobo.xakea;

public class Erregina extends Pieza{

	//eraikitzailea
	public Erregina(boolean pZuriaDa) {
		super(pZuriaDa);
	}

	@Override
	public boolean mugimenduEgokia(int pX, int pY, Laukia pLaukia){
		if (pX < 0 || pX > 7 || pY < 0 || pY > 7) {
	        return false;
		}
		if((pX==pLaukia.getX() && pY!=pLaukia.getY()) || ((pX!=pLaukia.getX() && pY==pLaukia.getY()) || Math.abs(pX-pLaukia.getX())==Math.abs(pY-pLaukia.getY()))) {
			if(Taula.getTaula().bideanZerbait(pX, pY, pLaukia.getX(), pLaukia.getY())){
				return false;
			} else {
				//okupatutaDago --> false: ez dago okupatuta edo okupatuta dago bere kolore ezberdina duen piezaz
				//              --> true: okupatuta dago bere kolore berdina duen piezaz
				if(Taula.getTaula().okupatutaDago(pX, pY, this.getZuriaDa())){
					return false;
				} else {return true;}
			}
		} else{return false;}
	}
	@Override
	public String toString() {
	    return getZuriaDa() ? "♕" : "♛";  
	}
}
