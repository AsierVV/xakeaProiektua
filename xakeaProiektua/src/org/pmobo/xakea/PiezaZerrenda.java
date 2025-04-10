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
}
