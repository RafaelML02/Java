package lab6.enun.cartas;

import stdlib.StdRandom;
/**
 * Implementación de IBaraja mediante array.
 * 
 * @author PII
 */
public class BarajaArray implements IBaraja
{
  private final int NUMERO_DE_CARTAS = 40; 
  private Carta[] baraja;
  private int longitud;
  public static final String[] PALOS = {"Oros", "Copas", "Espadas", "Bastos"};
  public static final String[] VALORES = 
    {"As", "Dos", "Tres", "Cuatro", "Cinco", 
     "Seis", "Siete", "Sota", "Caballo", "Rey"};
  
  public BarajaArray (){
    baraja = new Carta[NUMERO_DE_CARTAS];
    for (int palo = 0; palo <= 3; palo++)
      for (int valor = 0; valor <= 9; valor++)
         baraja[palo * 10 + valor] = new Carta(VALORES[valor], PALOS[palo]);   
    longitud = NUMERO_DE_CARTAS;
  }
  
  public String toString (){
    String s = "[";
    for (int i = 0; i < longitud; i += 1)
    { 
      if (i!=0) s += ", ";
      if (i!=0 && i%4==0) s += "\n"; // nueva linea cada 4 cartas
      s += baraja[i];
    }
    s += "]";
    return s;
  }
  public int size (){
    return longitud;
  }
  
  public Carta carta (int pos){
    return baraja[pos];
  }
  
  
  public void ponerBocaAbajo(int pos) {
	  if(pos>=0 && pos<=longitud) 
		  baraja[pos].darLaVuelta();
	  }
  
  
  public void barajar() {
	  for(int i=0; i<longitud; i++) {
		  //He puesto uniformDouble y lo he casteado ya que el
		  //uniform solo me pone que esta "deprecated"
		  int aux = (int) StdRandom.uniformDouble(i, longitud);
		  Carta a = baraja[i];
		  baraja[i] = baraja[aux];
		  baraja[aux] = a;  
	  }
}
  
  
  public Mano repartoMano(int n) {
	  Mano res = new Mano();
	  if(n<=0 || n>longitud)
		  return null;
	  else {
		  while(res.size()<n){
			  int aux = (int)StdRandom.uniformDouble(0, longitud);
			  res.add(baraja[aux]);
			  quitarCarta(aux);
		  }
	  }
	  return res;
}
  
  public void quitarCarta(int pos) {
	  if(pos>=0 && pos<=longitud) {
		  for(int i = pos; i<longitud-1; i++) {
			  baraja[i] = baraja[i+1];
		  }
		  longitud--;
		  }
	  }
  } 
