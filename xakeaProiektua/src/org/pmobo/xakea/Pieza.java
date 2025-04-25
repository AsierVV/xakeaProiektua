package org.pmobo.xakea;

public abstract class Pieza {
	
	//atributuak
	private boolean zuriaDa;
	private boolean galduta;
	
	//eraikitzailea
	public Pieza(boolean pZuriaDa) {
		this.zuriaDa = pZuriaDa;
		this.galduta = false;
	}
	
	public abstract boolean mugimenduEgokia(int pX, int pY, Laukia pLaukia);
	
	public abstract String toString();

	public boolean getZuriaDa(){
		return this.zuriaDa;
	}
	
	public boolean getGalduta() {
		return this.galduta;
	}
	
	public void setGalduta(boolean galduta) {
        	this.galduta = galduta;
	}

	public Laukia getKoordenatuak() {
		return this.laukia;
	}

	public void setKoordenatuak(Laukia pLaukia) {
		this.laukia = pLaukia;
	}
	
	public void piezaJan(){
		this.galduta=true;	//La pieza ya no pertenece al juego.
		
	}
	
	
}
