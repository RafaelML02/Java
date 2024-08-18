package lab6.enun.juego;

import lab6.enun.cartas.*;

public class SieteYMedia implements ISieteYMedia{
	
	  public double puntos (Carta carta) {
		  String valor = carta.valor();
		  switch(valor) {
		  case "As": return 1;
          case "Dos": return 2;
          case "Tres": return 3;
          case "Cuatro": return 4;
          case "Cinco": return 5;
          case "Seis": return 6;
          case "Siete": return 7;
          default: return 0.5;
		  }
	  }  
	  /**
	   * POST: resultado es la suma de los puntos de la <mano> según 
	   *       el juego de cartas de las siete y media.
	   */     
	  public double puntos (IMano mano) {
		  double res = 0.0;
		  for(int i=0; i<mano.size(); i++) {
			  res += puntos(mano.carta(i));		  
			  }
		  return res;
	  }
	  /**
	   * POST: Determina si <mano> tiene siete y media o no.
	   */     
	  public boolean esSieteYMedia (IMano mano) {
		  return puntos(mano)==7.5;
		  
	  }
	  /**
	   * POST: resultado es la carta de mayor valor de <mano> según 
	           el juego de cartas de las siete y media.
	   */     
	  public Carta mayorCarta (IMano mano) {
		  Carta res = mano.carta(0);
		  for(int i=1; i<mano.size(); i++){
			  Carta aux = mano.carta(i);
			  if(puntos(aux) > puntos(res))
	              res = aux;
		  }
		  return res;
	  }
	  /**
	   * POST: Determina si las cartas de <mano> están ordenadas en 
	   *       orden creciente del palo (oros, copas, espadas y bastos).
	   */   
	  
	  public boolean estaOrdenada (IMano mano) {
		  boolean resultado = true;
		  for (int i = 1; i <mano.size() && resultado; i++) {
		        Carta a = mano.carta(i-1);
		        Carta b = mano.carta(i);
		        
		        if (a.palo() == "Oros") {
		        	if(b.palo() == "Oros" || b.palo() == "Copas" 
		        			|| b.palo() == "Espadas" || b.palo() == "Bastos")
		        		resultado = true;
		        	else {
			        	resultado = false;
		        	}}
		        else if(a.palo() == "Copas") {
		        	if(b.palo() == "Copas" || b.palo() == "Espadas" 
		        			|| b.palo() == "Bastos")
		        		resultado = true;
		        	else {
			        	resultado = false;
		        	}}
		        else if(a.palo() == "Espadas") {
		        	if(b.palo() == "Espadas" || b.palo() == "Bastos")
		        		resultado = true;
		        	else {
			        	resultado = false;
		        	}}
		        else {
		        	if(b.palo() == "Bastos")
		        		resultado = true;
		        	else {
			        	resultado = false;
		        	}}}
		  return resultado;
}
	  
	  


}
