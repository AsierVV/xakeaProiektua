package org.pmobo.xakea;

public class Zaldia extends Pieza {
	
	//eraikitzailea
	public Zaldia(boolean pZuriaDa) {
		super(pZuriaDa);
	}
	@Override
	public boolean mugimenduEgokia(int pX, int pY, Laukia pLaukia) {
		if (pX < 0 || pX > 7 || pY < 0 || pY > 7) {
	        return false;
		}
		if((pY-pLaukia.getY()==2 && (pX-pLaukia.getX()==1 || pX-pLaukia.getX()==-1)) || (pY-pLaukia.getY()==-2 && (pX-pLaukia.getX()==1 || pX-pLaukia.getX()==-1)) || (pX-pLaukia.getX()==2 && (pY-pLaukia.getY()==1 || pY-pLaukia.getY()==-1)) || (pX-pLaukia.getX()==-2 &&(pY-pLaukia.getY()==1 || pY-pLaukia.getY()==-1))) {
			//okupatutaDago --> false: ez dago okupatuta edo okupatuta dago bere kolore ezberdina duen piezaz
			//              --> true: okupatuta dago bere kolore berdina duen piezaz
			if(Taula.getTaula().okupatutaDago(pX, pY, this.getZuriaDa())){
				return false;
			} else{return true;}
		} else{return false;}
	}
    @Override
    public String toString() {
        return getZuriaDa() ? "♘" : "♞";  // Caballo blanco y negro
    }
}
