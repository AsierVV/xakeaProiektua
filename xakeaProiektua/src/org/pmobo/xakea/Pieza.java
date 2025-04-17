package org.pmobo.xakea;

public abstract class Pieza {
	
	//atributuak
	private boolean zuriaDa;
	private boolean galduta;
	private Laukia koordenatuak;
	
	//eraikitzailea
	public Pieza(boolean pZuriaDa, boolean pGalduta, Laukia pKoordenatuak) {
		this.zuriaDa = pZuriaDa;
		this.galduta = pGalduta;
		this.koordenatuak = pKoordenatuak;
	}
	public abstract boolean mugimenduEgokia(int pX, int pY, Laukia pLaukia);
	public abstract String toString();

	public boolean getZuriaDa(){
		return this.zuriaDa;
	}
	public boolean galduDa() {
		return this.galduta;
	}
	public void setGalduta(boolean galduta) {
        this.galduta = galduta;
    }
	public void piezaJan(Pieza p){
		SIN HACER
	}
	
	
}
