package org.pmobo.xakea;

public class Peoia extends Pieza {

	//atributuak
	private boolean mugituDa;

	//eraikitzailea
	public Peoia(boolean pZuriaDa) {
		super(pZuriaDa, false, pLaukia);
		this.mugituDa = false;
	}
	@Overraid
	public boolean mugimenduEgokia(int pX, int pY, Laukia pLaukia){
		if(this.mugituDA==false){
			if(super.zuriaDA==true){
				if((pY-pLaukia.getY()==1 || pY-pLaukia.getY()==2) && pX==pLaukia.getX()){
					if(okupatutaDago(pX, pY)==false){
						return true;
					} else{return false;}
				} else if(pY-pLaukia.getY()==1 && (pX-pLaukia.getX()==1 || pX-pLaukia.getX()==-1)){
					if(okupatutaDago(pX, pY)==true){
						return true;
					} else{return false;}
				}
			} else{
				if((pY-pLaukia.getY()==-1 || pY-pLaukia.getY()==-2) && pX==pLaukia.getX()){
					if(okupatutaDago(pX, pY)==false){
						return true;
					} else{return false;}
				} else if(pY-pLaukia.getY()==-1 && (pX-pLaukia.getX()==1 || pX-pLaukia.getX()==-1)){
					if(okupatutaDago(pX, pY)==true){
						return true;
					} else{return false;}
				}
			}
		} else{
			if(super.zuriaDA==true){
				if(pY-pLaukia.getY()==1 && pX==pLaukia.getX()){
					if(okupatutaDago(pX, pY)==false){
						return true;
					} else{return false;}
				} else if(pY-pLaukia.getY()==1 && (pX-pLaukia.getX()==1 || pX-pLaukia.getX()==-1)){
					if(okupatutaDago(pX, pY)==true){
						return true;
					} else{return false;}
				}
			} else{
				if(pY-pLaukia.getY()==-1 && pX==pLaukia.getX()){
					if(okupatutaDago(pX, pY)==false){
						return true;
					} else{return false;}
				} else if(pY-pLaukia.getY()==-1 && (pX-pLaukia.getX()==1 || pX-pLaukia.getX()==-1)){
					if(okupatutaDago(pX, pY)==true){
						return true;
					} else{return false;}
				}
			}
			
		}
	}
	
}
