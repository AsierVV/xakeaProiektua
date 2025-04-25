package org.pmobo.xakea;

public class Laukia {

	//atributuak
	private int x;
	private int y;
	private Pieza pieza;
	
	//eraikitzailea
	public Laukia(int pX, int pY) {
		this.x = pX;
		this.y = pY;
	}
	
	//metodoak
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setKoordenatuak(int pX, int pY) {
		this.x = pX;
		this.y = pY;
	}
	
	public void setPieza(Pieza pPieza) {
		this.pieza = pPieza;
	}
	
	public Pieza getPieza() {
		return this.pieza;
	}
}
