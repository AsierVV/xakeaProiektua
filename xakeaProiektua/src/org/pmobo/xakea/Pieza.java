package org.pmobo.xakea;

public abstract class Pieza {
	
	//atributuak
	private boolean zuriaDa;
	private boolean galduta;
	private Laukia laukia;
	
	//eraikitzailea
	public Pieza(boolean pZuriaDa, Laukia pLaukia) {
		this.zuriaDa = pZuriaDa;
		this.galduta = false;
		this.koordenatuak = pLaukia;
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
	
	public void piezaJan(){
		this.laukia.setKoordenatuak(-1,-1);
		this.galduta=true;
	}
	
	
}
