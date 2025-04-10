package org.pmobo.xakea;

public class Taula {

	//atributua
	private Laukia[][] taula;
	private static Taula nireTaula=null;
	
	//Singleton
	private Taula() {
		this.taula=new Laukia[8][8];
		for (int y=0; y<8; y++) {
			for (int x=0; x<8; x++) {
				taula[x][y] = new Laukia(x,y);
			}
		}
		hasieratuTaulaPiezak();
	}
	public static Taula getTaula() {
		if (nireTaula == null) {
			nireTaula = new Taula();
		}
		return nireTaula;
	}
	
	//metodoak
	public void hasieratuTaulaPiezak() {
		//Peoi zuriak
		for(int x=0; x<8; x++) {
			Peoia p = new Peoia(True);
			taula[x][1].setPieza();
			PiezaZerrenda.getEMA()p.gehituPieza(p);
			}
		//Peoi beltzak
		for(int x=0; x<8; x++) {
			Peoia p = new Peoia(False);
			taula[x][6].setPieza();
			PiezaZerrenda.getEMA()p.gehituPieza(p);
		}
		//Dorre zuriak
		Pieza d1 = new Dorrea(True);
		taula[0][0].setPieza(d1);
		PiezaZerrenda.getEMA().gehituPieza(d1);		
		
		Pieza d2 = new Dorrea(True);
		taula[7][0].setPieza(d2);
		PiezaZerrenda.getEMA().gehituPieza(d2);		
		//Dorre beltzak
		Pieza d3 = new Dorrea(False);
		taula[0][7].setPieza(d3);
		PiezaZerrenda.getEMA().gehituPieza(d3);		

		Pieza d4 = new Dorrea(False);
		taula[7][7].setPieza(d4);
		PiezaZerrenda.getEMA().gehituPieza(d4);
		
		//Zaldi zuriak
		Pieza z1 = new Zaldia(True);
		taula[1][0].setPieza(z1);
		PiezaZerrenda.getEMA().gehituPieza(z1);
		
		Pieza z2 = new Zaldia(True);
		taula[6][0].setPieza(z2);
		PiezaZerrenda.getEMA().gehituPieza(z2);
		//Zaldi beltzak
		Pieza z3 = new Zaldia(False);
		taula[1][7].setPieza(z3);
		PiezaZerrenda.getEMA().gehituPieza(z3);
		
		Pieza z4 = new Zaldia(False);
		taula[6][7].setPieza(z4);
		PiezaZerrenda.getEMA().gehituPieza(z4);
		
		//Alfil zuriak
		Pieza a1 = new Alfila(True);
		taula[2][0].setPieza(a1);
		PiezaZerrenda.getEMA().gehituPieza(a1);
		
		Pieza a2 = new Alfila(True);
		taula[5][0].setPieza(a2);
		PiezaZerrenda.getEMA().gehituPieza(a2);
		//Alfil beltzak
		Pieza a3 = new Alfila(False);
		taula[2][7].setPieza(a3);
		PiezaZerrenda.getEMA().gehituPieza(a3);
		
		Pieza a4 = new Alfila(False);
		taula[5][7].setPieza(a4);
		PiezaZerrenda.getEMA().gehituPieza(a4);
		//Errege zuria
		Pieza e1 = new Erregea(True);
		taula[4][0].setPieza(e1);
		PiezaZerrenda.getEMA().gehituPieza(e1);
		//Errege beltza
		Pieza e2 = new Erregea(True);
		taula[4][7].setPieza(e2);
		PiezaZerrenda.getEMA().gehituPieza(e2);
		//Erregin zuria
		Pieza er1 = new Erregina(True);
		taula[3][0].setPieza(er1);
		PiezaZerrenda.getEMA().gehituPieza(er1);
		//Erregin beltza
		Pieza er2 = new Erregina(False);
		taula[3][7].setPieza(er2);
		PiezaZerrenda.getEMA().gehituPieza(er2);
	}
	
	public void erakutsiTaula() {
		System.out.println("\n	A B C D E F G H");
		for (int y=0; y<8; y++) {
			System.out.print((8-y) + " ");
			for (int x=0; x<8; x++) {
				Pieza p = taula[x][y].getPieza();
				if (p == null) {
					System.out.print(". ");
				} else {
					System.out.print(p.toString() + " ");
				}
			}
			System.out.println(" " + (8-y));
		}
		System.out.println("	A B C D E F G H\n");
	}
	
	public Pieza getPieza (int pX, int pY) {
		return taula[pX][pY].getPieza();
	}
	
	public Laukia getLaukia(int pX, int pY){
		return taula[pX][pY];
	}
	
	public void setPieza(int pX, int pY, Pieza pPieza) {
		taula[pX][pY].setPieza(pPieza);
	}
}
