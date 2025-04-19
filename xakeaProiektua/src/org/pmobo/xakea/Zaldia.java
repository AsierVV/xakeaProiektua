package org.pmobo.xakea;

public class Zaldia extends Pieza {
	
	//eraikitzailea
	public Zaldia(boolean pZuriaDa, Laukia pLaukia) {
		super(pZuriaDa, pGalduta, pKoordenatuak);
	}
	@Override
	public boolean mugimenduEgokia(int pX, int pY, Laukia pLaukia) {
		if((pY-pLaukia.getY()==2 && (pX-pLaukia.getX()==1 || pX-pLaukia.getX()==-1)) || (pY-pLaukia.getY()==-2 && (pX-pLaukia.getX()==1 || pX-pLaukia.getX()==-1)) || (pX-pLaukia.getX()==2 && (pY-pLaukia.getY()==1 || pY-pLaukia.getY()==-1)) || (pX-pLaukia.getX()==-2 &&(pY-pLaukia.getY()==1 || pY-pLaukia.getY()==-1))) {
			//okupatutaDago --> false: ez dago okupatuta edo okupatuta dago bere kolore ezberdina duen piezaz
			//              --> true: okupatuta dago bere kolore berdina duen piezaz
			if (okupatutaDago(pX, pY, pZuriaDa)){
				return false;
			} else{return true;}
		} else{return false;}
	}		
}
