package org.pmobo.xakea;

public class Erregea extends Pieza{

	//eraikitzailea
	public Erregea(boolean pZuriaDa, Laukia pLaukia) {
		super(pZuriaDa, pGalduta, pLaukia);
	}

	@Override
	public boolean mugimenduEgokia(int pX, int pY, Laukia pLaukia){
		if((pX==pLuakia.getX() && pY-pLaukia.get()==1) || (pX-pLuakia.getX()==1 && pY-pLaukia.get()==1) || (pX-pLuakia.getX()==1 && pY==pLaukia.get()) || (pX-pLuakia.getX()==1 && pY-pLaukia.get()==-1) || (pX==pLuakia.getX() && pY-pLaukia.get()==-1) || (pX-pLuakia.getX()==-1 && pY-pLaukia.get()==-1) || (pX-pLuakia.getX()==-1 && pY==pLaukia.get()) || (pX-pLuakia.getX()==-1 && pY-pLaukia.get()==1)){
			//okupatutaDago --> false: ez dago okupatuta edo okupatuta dago bere kolore ezberdina duen piezaz
			//              --> true: okupatuta dago bere kolore berdina duen piezaz
			if(okupatutaDago(pX, pY, pZuriaDa)){
				return false;
			} else {return true;}
		} else {return false;}
	}
}
