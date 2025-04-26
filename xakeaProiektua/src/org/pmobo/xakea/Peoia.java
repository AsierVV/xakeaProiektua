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
		int pX2 = pLaukia.getX();
		int pY2 = pLaukia.getY();
		boolean zuriaDa = this.getZuriaDa();
		
		if (pX < 0 || pX > 7 || pY < 0 || pY > 7) {
	        return false;
		}
		if(!this.mugituDa){
			if(zuriaDa){
				if((pY-pY2==1 || pY-pY2==2) && pX==pX2){
					if (Taula.getTaula().bideanZerbait(pX, pY, pX2, pY2)) {
						return false;
					} else {
						if(Taula.getTaula().okupatutaDago(pX2, pY2, zuriaDa)){
							return false;
						} else{
							this.mugituDa = true;
							return true;}
					}
				} else if(pY-pY2==1 && (pX-pX2==1 || pX-pX2==-1)){
					if(Taula.getTaula().okupatutaDago(pX2, pY2, zuriaDa)){
						return false;
					} else{
						this.mugituDa = true;
						return true;}
				}
			} else{
				if((pY-pY2==-1 || pY-pY2==-2) && pX==pX2){
					if (Taula.getTaula().bideanZerbait(pX, pY, pX2, pY2)) {return false;}
					else {
						if(Taula.getTaula().okupatutaDago(pX2, pY2, zuriaDa)){
							return false;
						} else{
							this.mugituDa = true;
							return true;}
					}
				} else if(pY-pY2==-1 && (pX-pX2==1 || pX-pX2==-1)){
					if(Taula.getTaula().okupatutaDago(pX2, pY2, zuriaDa)){
						return false;
					} else{
						this.mugituDa = true;
						return true;}
				}
			}
		} else{
			if(zuriaDa){
				if(pY-pY2==1 && pX==pX2){
					if(Taula.getTaula().okupatutaDago(pX2, pY2, zuriaDa)){
						return false;
					} else{
						this.mugituDa = true;
						return true;}
				} else if(pY-pY2==1 && (pX-pX2==1 || pX-pX2==-1)){
					if(Taula.getTaula().okupatutaDago(pX2, pY2, zuriaDa)){
						return false;
					} else{
						this.mugituDa = true;
						return true;}
				}
			} else{
				if(pY-pY2==-1 && pX==pX2){
					if(Taula.getTaula().okupatutaDago(pX2, pY2, zuriaDa)){
						return false;
					} else{
						this.mugituDa = true;
						return true;}
				} else if(pY-pY2==-1 && (pX-pX2==1 || pX-pX2==-1)){
					if(Taula.getTaula().okupatutaDago(pX2, pY2, zuriaDa)){
						return false;
					} else{ this.mugituDa = true; 
					return true;}
				}
			}
		}
		return false;
	}
	@Override
	public String toString() {
	    //return getZuriaDa() ? "♙" : "♟";  // Peón blanco y negro
	    return getZuriaDa() ? "p" : "P";  // Peón blanco y negro

	}
}
