package org.pmobo.xakea;

import java.util.Scanner;

public class Teklatua {
	private Scanner sc;
	private static Teklatua nireTeklatua = null;
	
	private Teklatua() {
		this.sc = new Scanner(System.in);
	}
	
	public static Teklatua getTeklatua(){
		if (Teklatua.nireTeklatua == null)
			nireTeklatua = new Teklatua();
		return Teklatua.nireTeklatua;
	}
	
	
	public int irakurri(){
		String eran= sc.nextLine();
		int zbk=Integer.parseInt(eran);
		return zbk;
	}
}