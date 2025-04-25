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
	}
	public static Taula getTaula() {
		if (nireTaula == null) {
			nireTaula = new Taula();
		}
		return nireTaula;
	}
	
	//metodoak

	//Con este metodo estamos creando el tablero del Ajedrez añadiendo todas las piezas de ambos colores.
	public void hasieratuTaulaPiezak() {
		//Inicializamos un aldagai del tipo Laukia llamdao laukia, para ir creado todas las piezas.
		Laukia laukia = null;
		//Peoi zuriak
		for(int x=0; x<8; x++) {
			laukia = taula[x][1];
			Peoia p = new Peoia(true);
			taula[x][1].setPieza(p);
			PiezaZerrenda.getEMA().gehituPieza(p);
		}
		//Peoi beltzak
		for(int x=0; x<8; x++) {
			laukia = taula[x][6];
			Peoia p = new Peoia(false);
			taula[x][6].setPieza(p);
			PiezaZerrenda.getEMA().gehituPieza(p);
		}
		
		//Dorre zuriak
		laukia = taula[0][0];
		Dorrea d1 = new Dorrea(true);
		taula[0][0].setPieza(d1);
		PiezaZerrenda.getEMA().gehituPieza(d1);		

		laukia = taula[7][0];
		Dorrea d2 = new Dorrea(true);
		taula[7][0].setPieza(d2);
		PiezaZerrenda.getEMA().gehituPieza(d2);
		
		//Dorre beltzak
		laukia = taula[0][7];
		Dorrea d3 = new Dorrea(false);
		taula[0][7].setPieza(d3);
		PiezaZerrenda.getEMA().gehituPieza(d3);		

		laukia = taula[7][7];
		Dorrea d4 = new Dorrea(false);
		taula[7][7].setPieza(d4);
		PiezaZerrenda.getEMA().gehituPieza(d4);
		
		//Zaldi zuriak
		laukia = taula[1][0];
		Zaldia z1 = new Zaldia(true);
		taula[1][0].setPieza(z1);
		PiezaZerrenda.getEMA().gehituPieza(z1);

		laukia = taula[6][0];
		Zaldia z2 = new Zaldia(true);
		taula[6][0].setPieza(z2);
		PiezaZerrenda.getEMA().gehituPieza(z2);
		
		//Zaldi beltzak
		laukia = taula[1][7];
		Zaldia z3 = new Zaldia(false);
		taula[1][7].setPieza(z3);
		PiezaZerrenda.getEMA().gehituPieza(z3);

		laukia = taula[6][7];
		Zaldia z4 = new Zaldia(false);
		taula[6][7].setPieza(z4);
		PiezaZerrenda.getEMA().gehituPieza(z4);
		
		//Alfil zuriak
		laukia = taula[2][0];
		Alfila a1 = new Alfila(true);
		taula[2][0].setPieza(a1);
		PiezaZerrenda.getEMA().gehituPieza(a1);

		laukia = taula[5][0];
		Alfila a2 = new Alfila(true);
		taula[5][0].setPieza(a2);
		PiezaZerrenda.getEMA().gehituPieza(a2);
		
		//Alfil beltzak
		laukia = taula[2][7];
		Alfila a3 = new Alfila(false);
		taula[2][7].setPieza(a3);
		PiezaZerrenda.getEMA().gehituPieza(a3);

		laukia = taula[5][7];
		Alfila a4 = new Alfila(false);
		taula[5][7].setPieza(a4);
		PiezaZerrenda.getEMA().gehituPieza(a4);
		
		//Errege zuria
		laukia = taula[4][0];
		Erregea e1 = new Erregea(true);
		taula[4][0].setPieza(e1);
		PiezaZerrenda.getEMA().gehituPieza(e1);
		
		//Errege beltza
		laukia = taula[4][7];
		Erregea e2 = new Erregea(true);
		taula[4][7].setPieza(e2);
		PiezaZerrenda.getEMA().gehituPieza(e2);
		
		//Erregin zuria
		laukia = taula[3][0];
		Erregina er1 = new Erregina(true);
		taula[3][0].setPieza(er1);
		PiezaZerrenda.getEMA().gehituPieza(er1);
		
		//Erregin beltza
		laukia = taula[3][7];
		Erregina er2 = new Erregina(false);
		taula[3][7].setPieza(er2);
		PiezaZerrenda.getEMA().gehituPieza(er2);
	}

	//Con este metodo vamos a mostrar el tablero después de cada jugada.
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

	public void mugitu(Laukia pLaukia, int pX, int pY) {
   	 	Pieza p = pLaukia.getPieza();
		pLaukia.setPieza(null);
		//Laukia okupatuta badago aurreko metodoak kontuan hartuta soilik izan al dezake pieza etsaia
    		if (taula[pX][pY].getPieza() != null) {
        		piezaJan(); 
    		}
		//Pieza bere posizio berrian jarri
    		taula[pX][pY].setPieza(p);
    		System.out.println("Pieza mugitu da.");
	}
		
}
