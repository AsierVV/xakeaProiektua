package org.pmobo.xakea;

public class Peoia extends Pieza {

	//atributuak
	private boolean mugituDa;

	//eraikitzailea
	public Peoia(boolean pZuriaDa) {
		super(pZuriaDa);
		this.mugituDa = false;
	}
	@Override
	public boolean mugimenduEgokia(int pX, int pY, Laukia pLaukia){
		if (pX < 0 || pX > 7 || pY < 0 || pY > 7) {
	        return false;
		}
		if(this.mugituDa==false){
			if(super.getZuriaDa()==true){
				if((pY-pLaukia.getY()==1 || pY-pLaukia.getY()==2) && pX==pLaukia.getX()){
					if (Taula.getTaula().bideanZerbait(pX, pY, pLaukia.getX(), pLaukia.getY())) {return false;}
					else {
						if(okupatutaDago(pX, pY, pZuriaDa)==false){
							return true;
						} else{return false;}
					}
				} else if(pY-pLaukia.getY()==1 && (pX-pLaukia.getX()==1 || pX-pLaukia.getX()==-1)){
					if(okupatutaDago(pX, pY, pZuriaDa)==true){
						return true;
					} else{return false;}
				}
			} else{
				if((pY-pLaukia.getY()==-1 || pY-pLaukia.getY()==-2) && pX==pLaukia.getX()){
					if (Taula.getTaula().bideanZerbait(pX, pY, pLaukia.getX(),pLaukia.getY())) {return false;}
					else {
						if(okupatutaDago(pX, pY, pZuriaDa)==false){
							return true;
						} else{return false;}
					}
				} else if(pY-pLaukia.getY()==-1 && (pX-pLaukia.getX()==1 || pX-pLaukia.getX()==-1)){
					if(okupatutaDago(pX, pY, pZuriaDa)==true){
						return true;
					} else{return false;}
				}
			}
		} else{
			if(super.zuriaDA==true){
				if(pY-pLaukia.getY()==1 && pX==pLaukia.getX()){
					if(okupatutaDago(pX, pY, pZuriaDa)==false){
						return true;
					} else{return false;}
				} else if(pY-pLaukia.getY()==1 && (pX-pLaukia.getX()==1 || pX-pLaukia.getX()==-1)){
					if(okupatutaDago(pX, pY, pZuriaDa)==true){
						return true;
					} else{return false;}
				}
			} else{
				if(pY-pLaukia.getY()==-1 && pX==pLaukia.getX()){
					if(okupatutaDago(pX, pY, pZuriaDa)==false){
						return true;
					} else{return false;}
				} else if(pY-pLaukia.getY()==-1 && (pX-pLaukia.getX()==1 || pX-pLaukia.getX()==-1)){
					if(okupatutaDago(pX, pY, pZuriaDa)==true){
						return true;
					} else{return false;}
				}
			}
			
		}
	}
	@Override
	public String toString() {
	    return getZuriaDa() ? "♙" : "♟";  // Peón blanco y negro
	}
	
}
