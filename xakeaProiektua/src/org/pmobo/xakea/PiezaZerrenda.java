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
	// Eliminar pieza (cuando es comida)
    public void ezabatuPieza(Pieza pPieza) {
        this.lista.remove(pPieza);
    }
	private Iterator<Pieza> getIteradorea(){
		return this.lista.iterator();
	}

	//Comprueba que en el camino que hace la pieza para moverse no haya ninguna pieza, da igual el color. No comprueba la casilla final
	public boolean bideanZerbait(int pX, int pY, int pX0, int pY0){
		
	}
	public boolean okupatutaDago(int x, int y) {
		
	 }
}
