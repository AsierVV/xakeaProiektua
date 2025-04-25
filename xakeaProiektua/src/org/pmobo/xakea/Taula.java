package org.pmobo.xakea;

package org.pmobo.packjolasa;
import java.util.List;
import java.util.ArrayList;

public class Taula {

	//atributua
	private Laukia[][] taula;
	private static Taula nireTaula=null;
	private List<Pieza> piezaZuriGaldutak;
    	private List<Pieza> piezaBeltzGaldutak;
	Teklatua t = Teklatua.getTeklatua(); // Hartzen dugu Teklatuaren instantzia t aldagaia Teklatua bezala erabiltzeko.
	
	//Singleton
	private Taula() {
		this.taula=new Laukia[8][8];
		for (int y=0; y<8; y++) {
			for (int x=0; x<8; x++) {
				taula[x][y] = new Laukia(x,y);
			}
		}
		piezaZuriGaldutak = new ArrayList<>();
        	piezaBeltzGaldutak = new ArrayList<>();
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

	//Comprueba que en el camino que hace la pieza para moverse no haya ninguna pieza, da igual el color. No comprueba la casilla final
	public boolean bideanZerbait(int pX, int pY, int pX0, int pY0){
		int dx = Integer.compare(pX, pX0); // X ardatzaren norabide mugimendua: -1 -> mugitzen da ezkerrera || 0 -> ez da X ardatzan mugitzen || 1 -> mugitzen da eskuinera
    		int dy = Integer.compare(pY, pY0); // Y ardatzaren norabide mugimendua: -1 -> mugitzen da ezkerrera || 0 -> ez da Y ardatzan mugitzen || 1 -> mugitzen da eskuinera

		// x eta y aldagaiak erabiliko dira piezak egiten duen bidea zeharkatzeko. Hasieratuko dira pieza mugitzen den lehenengo laukian. dx eta dy erabiltzen da, horrela adibidez
		// x ardatzean eskuinera mugitzen bada, x aldagaia +1 egiten joango da, eta y ardatzean ez bada mugitzen, +0 egingo da. Hau bakarrik funtzionatzen du mugimendu bertikalean,
		// horizontalean eta diagonalean; baina zaldiak piezak saltatzen dituzte, beraz ez da behar gehiago.
		int x = pX0 + dx;
    		int y = pY0 + dy;

		while (x != pX || y != pY) {
			if (taula[x][y].getPieza() != null) {
				return true;
			}
			// Bidearen lehenengo laukiarekin amaitzean, hurrengo laukira pauso bat ematen dugu. Eta ez bada bidearen azkenengo laukia berriro prozesu guztia errepikatuko da.
			x = x + dx;
			y = y + dy;
		}
		return false; // Ez badugu ezer aurkitu bide osoan, bidea libre dago. Buelta false.
	}

	public boolean okupatutaDago(int x, int y, boolean pKolorea) {
		 Pieza pieza = taula[x][y].getPieza();

		// Piezarik ez badago, ez dago okupatuta.
		if (pieza == null) {
			return false; // false bueltatzen da.
		}
		
		return pieza.getZuriaDa() == pKolorea; //Kolore berdineko pieza badago, okupatuta dago (true); kolore desberineko pieza badago, ez dago okupatuta (false).
		// "mugitu" metodoa egiterakoan, leku horretan dagoen pieza jango (galduko) da.
	}

	public void piezaJan(int x, int y) {
    		Pieza piezaHarrapatuta = taula[x][y].getPieza();
    		//Pieza harrapatutaren kolorea konprobatzen du eta zerrenda desberdinetan gordetzen ditu
    		if (piezaHarrapatuta != null) {
        		if (piezaHarrapatuta.getZuriaDa()) {
            			piezaZuriGaldutak.add(piezaHarrapatuta);
        		} else {
            			piezaBeltzGaldutak.add(piezaHarrapatuta);
        		}
        	System.out.println("Harrapatutako pieza: " + piezaHarrapatuta.getClass().getSimpleName());
		}
	}	
	
	public void peoiaHobetu(int pX, int pY){
		Peoia pe = taula[pX][pY].getPieza();
		boolean zuriaDa = pe.getZuriaDa();

		//Konprobatzen dugu ea peoia ailegatu den azken lerrora.
		if ((zuriaDa && pY==7) || (!zuriaDa && pY==0)){
			boolean aukeraOna = false;
			String mota = "";

			//Jokalariari eskatzen da peoia hobetzeko erabili nahi duen pieza.
			while (!aukeraOna) {
				mota = t.irakurriString("Sartu berreskuratu nahi duzun pieza (Erregina, Alfila, Zaldia edo Dorrea): ");

				//Konprobatzen dugu ea aukeratutako pieza galdutako zerrendan dagoen.
				ArrayList<Pieza> galdutakoak = zuriaDa ? this.piezaZuriGaldutak : this.piezaBeltzGaldutak; //Peoia zuria bada, piezaZuriGaldutak zerrenda hartuko du; peoia beltza bada, piezaBeltzGaldutak zerrenda hartuko du.
				for (Pieza p : galdutakoak) {
					if (mota.equalsIgnoreCase(p.getClass().getSimpleName())) {
						aukeraOna = true;
						galdutakoak.remove(p);
					}
				}
				if (!aukeraOna) {
                			System.out.println("Aukeratutako pieza ez da egokia edo ez dago galduta.");
            			}
			}

			//Pieza berria sortzen dugu.
			Pieza berria = null;
			if (zuriaDa){ //Peoia zuria ba zen.
				if (mota.equalsIgnoreCase("erregina")) {
					berria = new Erregina(true);}
				else if (mota.equalsIgnoreCase("alfila")){
					berria = new Alfila(true);}
				else if (mota.equalsIgnoreCase("zaldia")){
					berria = new Zaldia(true);}
				else if (mota.equalsIgnoreCase("dorrea")){
					berria = new Dorrea(true);}
				this.piezaZuriGaldutak.add(pe); //Peoia galdutako zerrendan sartzen da.
			} else {      //Peoia beltza ba zen.
				if (mota.equalsIgnoreCase("erregina")) {
					berria = new Erregina(false);}
				else if (mota.equalsIgnoreCase("alfila")){
					berria = new Alfila(false);}
				else if (mota.equalsIgnoreCase("zaldia")){
					berria = new Zaldia(false);}
				else if (mota.equalsIgnoreCase("dorrea")){
					berria = new Dorrea(false);}
				this.piezaBeltzGaldutak.add(pe); //Peoia galdutako zerrendan sartzen da.
			}

			//Taulan sartzen da pieza berria.
			taula[pX][pY].setPieza(berria);
			System.out.println("Peoia hobetu da hurrengo piezara: " + berria.getClass().getSimpleName());
		}
	}

	public boolean partidaAmaituta() {
		boolean erregeZuriBizi = true;
		boolean erregeBeltzBizi = true;

		//Zeharkatzen du piezaZuriGaldutak zerrenda, ikusteko ea Erregea or dagoen.
		for (Pieza p : piezaZuriGaldutak) {
			if (p instanceof Erregea) {
				erregeZuriBizi = false;
			}
		}
		//Zeharkatzen du piezaBeltzGaldutak zerrenda, ikusteko ea Erregea or dagoen.		
		for (Pieza p : piezaBeltzGaldutak) {
			if (p instanceof Erregea) {
				erregeBeltzBizi = false;
			}
		}

		//Erregeren bat ez badago bizirik partida amaitu egiten da.
	    	if (!erregeZuriBizi) {
	        	System.out.println("Partida amaitu da! Pieza BELTZAK irabazi dute! ZORIONAK!");
	        	return true;
	    	} else if (!erregeBeltzBizi) {
			System.out.println("Partida amaitu da! Pieza ZURIAK irabazi dute! ZORIONAK!");
	        	return true;
		}
	    	return false;
	}

}
