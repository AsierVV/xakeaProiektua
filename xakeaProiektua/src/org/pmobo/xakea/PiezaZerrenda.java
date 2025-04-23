package org.pmobo.xakea;
import java.util.ArrayList;

public class PiezaZerrenda {

	//atributuak
	private ArrayList<Pieza> lista;
	private static PiezaZerrenda nireEMA = null;
	
	//eraikitzailea
	private PiezaZerrenda(){
		this.lista = new ArrayList<Pieza>();
	}
	
	public static PiezaZerrenda getEMA() {
		if (nireEMA == null) {
			nireEMA = new PiezaZerrenda();
		}
		return nireEMA;
	}
	
	public void gehituPieza(Pieza pPieza) {
		this.lista.add(pPieza);
	}
	
	private Iterator<Pieza> getIteradorea(){
		return this.lista.iterator();
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
        		for (Pieza p : this.lista) { // Comando honekin lortzen dugu lista oso bat zeharkatzea banan banan, kasu honetan PiezaZerrenda lista, beraz zerrendaren pieza guztiak hartuko dira banan banan, pieza bat hartuz buelta bakoitzean.
            			if (!p.getGalduta()) { // Konprobatuko dugu hartu dugun pieza janda (galduta) dagoen ala ez, galduta badago, ez dago tableroan.
                			Laukia pos = p.getKoordenatuak(); // Ez badago galduta, piezaren korrdenatuak gordetzen ditugu "Laukia pos" aldagaian.
                			if (pos.getX() == x && pos.getY() == y) { // Konprobatzen dugu ea koordenatu horiek gure bidearen koordenatu berdinak diren ala ez.
                    				return true; // Koordenatuak berdinak badira, bidean zerbait dago, beraz bueltan true. Bestela, hurrengo pieza konprobatzen dugu "for"-aren hurrengo bueltan.
                			}
            			}
        		}
			// Bidearen lehenengo laukiarekin amaitzean, hurrengo laukira pauso bat ematen dugu. Eta ez bada bidearen azkenengo laukia berriro prozesu guztia errepikatuko da.
        		x += dx;
        		y += dy;
    		}
    		return false; // Ez badugu ezer aurkitu bide osoan, bidea libre dago. Buelta false.
	}

	
	public boolean okupatutaDago(int x, int y, boolean pKolorea) {
		 Pieza pieza = Taula.getTaula().getPieza(x, y);

		 // Piezarik ez badago, ez dago okupatuta.
		 if (pieza == null) {
		        return false; // false bueltatzen da.
		 }
		 // Kolore berdineko piezarik badago, okupatuta dago.
		 if (pieza.getZuriaDa() == pKolorea) {
		        return true; // true bueltatzen da, kolore berdineko pieza dago.
		} else {return false;} // false bueltatzen da, kolore ezberdineko pieza dago. Beraz, "mugitu" metodoa egiterakoan, leku horretan dagoen pieza jango (galduko) da.

	 }
}
