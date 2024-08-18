package lab6.enun.cartas;

import stdlib.StdRandom;
import tads.ArrayList;
import tads.IList;

public class BarajaIList implements IBaraja {
	private IList<Carta> baraja;
	
	public BarajaIList() {
		baraja = new ArrayList<>();
		for(String palo : BarajaArray.PALOS) {
			for(String valores : BarajaArray.VALORES) {
				baraja.add(new Carta(valores,palo));
			}
		}
	}
	
	 public String toString () {
		 String s = "[";
		 for(int i = 0; i<baraja.size(); i++) {
			 s += baraja.get(i) + ",";
		 }
		 s+= "]";
		 return s;
	 }
	 
	 public void ponerBocaAbajo(int pos) {
	        if (pos >= 0 && pos < baraja.size()) 
	        	baraja.get(pos).darLaVuelta();
	        }
	 
	 public void barajar () {
		 for(int i=0; i<baraja.size(); i++) {
			 int aux = (int) StdRandom.uniformDouble(i, baraja.size());
			 Carta a = baraja.get(i);
			 baraja.set(i, baraja.get(aux));
			 baraja.set(aux, a);
			 
		 }
	 }
	 

	  public Mano repartoMano(int n) {
		  Mano mano = new Mano();
		  if(n<=0 || n>baraja.size())
			  return null;
		  else {
	        for (int i = 0; i < n; i++) {
	        	int aux = (int) StdRandom.uniformDouble(0,baraja.size());
	            Carta carta = baraja.get(aux); 
	            mano.add(carta);
	            baraja.remove(carta);
	        }
		  }
	        return mano;
	  }
	 
	 
	 public void quitarCarta(int pos) {
	        if (pos >= 0 && pos < baraja.size()) 
	        	baraja.remove(pos);
	 }
	 
	 public int size() {
		 return baraja.size();
		 }
	 
	 public Carta carta(int pos) {
	        if (pos >= 0 && pos < baraja.size()) 
	            return baraja.get(pos);
	        return null;
	        }
	 

}
