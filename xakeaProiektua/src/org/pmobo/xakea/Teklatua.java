package org.pmobo.xakea;

import java.util.Scanner;

public class Teklatua {
	private Scanner sc;
	private static Teklatua nireTeklatua = null;
	
	private Teklatua() {
		this.sc = new Scanner(System.in);
	}
	
	// Método estático para obtener la única instancia de Teklatua (Singleton)
	public static Teklatua getTeklatua(){
		if (Teklatua.nireTeklatua == null)
			nireTeklatua = new Teklatua();
		return Teklatua.nireTeklatua;
	}
	

	// Método para leer un número entero
	public int irakurriInt(String mezua) {
		System.out.println(mezua);
		String eran = sc.nextLine();          // Lee la entrada como String
	 	int zbk = Integer.parseInt(eran);     // Convierte la entrada a int
	        return zbk;                           // Devuelve el número entero
	}

	// Método para leer una cadena de texto
    	public String irakurriString(String mezua) {
		System.out.println(mezua);
    		return sc.nextLine();                 // Lee y devuelve la línea de texto introducida
    	}
}
