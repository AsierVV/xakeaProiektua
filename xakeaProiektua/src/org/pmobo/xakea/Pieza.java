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
	
	public void piezaJan(Pieza p){
			SIN HACER
	{
	public abstract String toString();

	public boolean getZuriaDa(){
		return this.zuriaDa;
	}

	//Comprueba que en el camino que hace la pieza para moverse no haya ninguna pieza, da igual el color. No comprueba la casilla final
	public boolean bideanZerbait(int pX, int pY, int pX0, int pY0){
		
	}
	
	
}
