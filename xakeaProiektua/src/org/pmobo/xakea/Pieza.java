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
	public abstract boolean mugimenduEgokia(int pX, int pY);
	
	public void piezaJan(Pieza p){
			
	{
	public abstract String toString();
	
	
}
