package org.pmobo.xakea;

public class Laukia {

	//atributuak
	private int x;
	private int y;
	
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
}
