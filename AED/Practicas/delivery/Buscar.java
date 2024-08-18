package aed.delivery;

import java.util.Iterator;

import es.upm.aedlib.Pair;
import es.upm.aedlib.positionlist.*;


public class Buscar {
  
  public static Pair<String,PositionList<Direccion>> busca(Laberinto laberinto) {
	  PositionList<Direccion> res = new NodePositionList<>();
	  String[] regalo = {null};
	  Boolean encontrado = false;
	  
	  Punto puntoInicial = laberinto.getPunto();
	  encontrado = buscaraux(laberinto, res, regalo,puntoInicial);
	  
	  if(!encontrado)
		  return null; 

	  return new Pair<String,PositionList<Direccion>>(regalo[0],res);
  }
  
  
  
  private static boolean buscaraux(Laberinto laberinto, 
		  PositionList<Direccion> res, String[] regalo, Punto puntoInicial){

	  for(Direccion direccion : laberinto.direccionesPosibles()) {
		  Punto posicionAnterior = laberinto.getPunto();
		  laberinto.moverHacia(direccion);

		  if (!laberinto.sueloMarcadoConTiza()) {
			  laberinto.marcaSueloConTiza();
			  res.addLast(direccion);
	            
			  if(laberinto.tieneRegalo()) {
				  regalo[0] = laberinto.getRegalo();
				  return true;
	            }

			  if(buscaraux(laberinto, res, regalo, posicionAnterior)){
				  return true;
	            }
	       
			  res.remove(res.last());
	        }
		  laberinto.moverHacia(Direccion.opuesto(direccion));
	    }
	  return false;
	}
  
}
