package org.pmobo.xakea;

public class Jokoa {

        public void partidaBatJolastu() {
            taula = new Taula();                   // Taula sortu
            taula.hasieratuTaulaPiezak();         // Piezak sortu eta kokatu
            boolean txandaZuri = true;            // txandaZuri = true, pieza zuriak hasten dira
            boolean partidaAmaituta = false;      // partida noiz amaitu den jakiteko, eta horrela kontrolatzeko noiz atera loop-etik
        
            while (!partidaAmaituta) {
                erakutsiTaula();     // Taula erakutsi
        
                if (txandaZuri) {
                    System.out.println("Zuriaren txanda:");
                } else {
                    System.out.println("Beltzaren txanda:");
                }
        
                // Mugimendua irakurri TEKLATUA-rekin
                int x1 = Teklatua.getTeklatua().irakurri("Aukeratu PIEZAren X posizioa:");
                int y1 = Teklatua.getTeklatua().irakurri("Aukeratu PIEZAren Y posizioa:");
                Laukia laukiaHasiera = taula.getLaukia(x1, y1);
                Pieza pieza = laukiaHasiera.getPieza();

                // While honetan konprobatuko da aukeratutako pieza existitzen den ala ez eta egokia den ala ez.
                while (pieza == null || (pieza.getZuriaDa() && !bandaZuri) || (!pieza.getZuriaDa() && bandaZuri) {
                        System.out.println("Ez dago piezarik edo aukeratutako pieza ez da zure kolorekoa, aukeratu beste lauki berri bat.");
                        int x1 = Teklatua.getTeklatua().irakurri("Aukeratu PIEZAren X posizioa:");
                        int y1 = Teklatua.getTeklatua().irakurri("Aukeratu PIEZAren Y posizioa:");
                        Laukia laukiaHasiera = taula.getLaukia(x1, y1);
                        Pieza pieza = laukiaHasiera.getPieza();
                }
                    
                int x2 = Teklatua.getTeklatua().irakurri("Aukeratu MUGIMENDUren X posizioa:");
                int y2 = Teklatua.getTeklatua().irakurri("Aukeratu MUGIMENDUren Y posizioa:");
                Laukia laukiaHelburu = taula.getLaukia(x2, y2);
        
                boolean lortuMugimenduEgokia = false;   // mugimendua noiz den egokia jakiteko
                
                while (!lortuMugimenduEgokia) {         // loop bat eskatzeko pieza mugitzeko laukia, mugimendu egokia izan arte
                    if (!pieza.mugimenduEgokia(x2, y2, laukiaHelburu)) {
                        System.out.println("Mugimendua ez da egokia, sartu beste posizio bat pieza mugitzeko.");
                        // Eskatzen da berriro laukiaHelburu korrdenatuak
                        int x2 = Teklatua.getTeklatua().irakurri("Aukeratu MUGIMENDUren X posizioa:");
                        int y2 = Teklatua.getTeklatua().irakurri("Aukeratu MUGIMENDUren Y posizioa:");
                        Laukia laukiaHelburu = taula.getLaukia(x2, y2);
                    } else {
                        lortuMugimenduEgokia = true;
                    }
                }
        
                // Mugimendua egitea "METODO SIN IMPLEMENTAR (EN TAULA)"
                taula.mugitu(laukiaHasiera, x2, y2); // El metodo "mugitu" movera la pieza a su nueva posicion y pondra un mensaje de que la pieza se ha movido.
                                                                // Este metodo tb se tiene que encargar de llamar al metodo piezaJan, asi que comprobara si en las coordenadas x2 | y2 hay una pieza del color
                                                              // contrario, y en ese caso, llamara al metodo piezaJan para que elimine esa pieza.
        
                // Txandaz aldatu
                aldatuTxanda();
        
                // Konprobatu amaiera (matea edo beste baldintza batzuk, aurrerago) "METODO SIN IMPLEMENTAR"
                partidaAmaituta = partidaAmaituta();
            }
        
            System.out.println("Partida amaitu da!");
        }

        public void aldatuTxanda(){
            txandaZuri = !txandaZuri;
        }

}
