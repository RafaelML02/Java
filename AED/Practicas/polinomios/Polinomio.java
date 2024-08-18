package aed.polinomios;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import java.util.Comparator;
import java.util.Iterator;



/**
 * Operaciones sobre polinomios de una variable con coeficientes enteros.
 */
public class Polinomio {

  // Una lista de monomios
  PositionList<Monomio> terms;

  /**
   * Crea el polinomio "0".
   */
  public Polinomio() {
    terms = new NodePositionList<>();
  }

  /**
   * Crea un polinomio definado por una lista con monomios.
   * @param terms una lista de monomios
   */
  public Polinomio(PositionList<Monomio> terms) {
    this.terms = terms;
  }

  /**
   * Crea un polinomio definado por un String.
   * La representación del polinomio es una secuencia de monomios separados
   * por '+' (y posiblemente con caracteres blancos).
   * Un monomio esta compuesto por tres partes,
   * el coefficiente (un entero), el caracter 'x' (el variable), y el exponente
   * compuesto por un un caracter '^' seguido por un entero.
   * Se puede omitir multiples partes de un monomio, 
   * ejemplos:
   * <pre>
   * {@code
   * new Polinomio("2x^3 + 9");
   * new Polinomio("2x^3 + -9");
   * new Polinomio("x");   // == 1x^1
   * new Polinomio("5");   // == 5x^0
   * new Polinomio("8x");  // == 8x^1
   * new Polinomio("0");   // == 0x^0
   * }
   * </pre>
   * @throws IllegalArgumentException si el argumento es malformado
   * @param polinomio - una secuencia de monomios separados por '+'
   */
  public Polinomio(String polinomio) {
    throw new RuntimeException("no esta implementado todavia");
  }
  
  
  public static boolean mismoexponente(Monomio a, Monomio b) {
	  return a.getExponente() == b.getExponente();
  }
  
  public static boolean expmayor(Monomio a, Monomio b) {
	  boolean res = false;
	  if(a.getExponente() > b.getExponente()) {
		  res = true;
	  }
		  return res;
	  }
  
  private static PositionList<Monomio> ordenarPorExponente(PositionList<Monomio> lista) {
      Monomio[] array = new Monomio[lista.size()];
      int i = 0;
      for (Monomio monomio : lista) {
          array[i++] = monomio;
      }

      // Ordenar el array por exponente de mayor a menor
      java.util.Arrays.sort(array, Comparator.comparingInt(Monomio::getExponente).reversed());

      // Convertir el array ordenado de nuevo a una lista
      PositionList<Monomio> listaOrdenada = new NodePositionList<>();
      for (Monomio monomio : array) {
          listaOrdenada.addLast(monomio);
      }

      return listaOrdenada;
  }

  
  /**
   * Suma dos polinomios.
   * @param p1 primer polinomio.
   * @param p2 segundo polinomio.
   * @return la suma de los polinomios.
   */
  
  public static Polinomio suma(Polinomio p1, Polinomio p2) {
	  PositionList<Monomio> nuevo = new NodePositionList<>();
	  Position<Monomio> pos1 = p1.terms.first();
	  Position<Monomio> pos2 = p2.terms.first();
	 
	  
	  while(pos1 != null && pos2 != null) {
		  Monomio a= new Monomio(pos1.element().getCoeficiente(), pos1.element().getExponente());
		  Monomio b= new Monomio(pos2.element().getCoeficiente(), pos2.element().getExponente());
		  
		  if(mismoexponente(a,b)) {
			  Monomio c = new Monomio(a.getCoeficiente() + b.getCoeficiente(),a.getExponente());
			  nuevo.addLast(c);
			  pos1 = p1.terms.next(pos1); 
			  pos2 = p2.terms.next(pos2);	
		  }
		  else {
			  if(expmayor(a,b) == true) {
				  Monomio c = new Monomio (a.getCoeficiente(),a.getExponente());
				  nuevo.addLast(c);
				  pos1 = p1.terms.next(pos1);
			  }
			  else {
				  Monomio c = new Monomio (b.getCoeficiente(),b.getExponente());
				  nuevo.addLast(c);
				  pos2 = p2.terms.next(pos2);
			  }  
		  }	 
		  }
	  
	  while(pos1 == null) {
		  Monomio c = new Monomio(p2.terms.first().element().getCoeficiente(), p2.terms.first().element().getExponente());
		  nuevo.addLast(c); 
	  }
	  while(pos2 == null) {
		  Monomio c = new Monomio(p1.terms.first().element().getCoeficiente(), p1.terms.first().element().getExponente());
		  nuevo.addLast(c); 
	  }
	  
	  Polinomio p = new Polinomio(nuevo);
	  return p;
	  
  }
//	    PositionList<Monomio> nuevo = new NodePositionList<>();
//	    Position<Monomio> cursor1 = p1.terms.first();
//	    Position<Monomio> cursor2 = p2.terms.first();
//
//	    while (cursor1 != null && cursor2 != null) {
//	        if (mismoexponente(cursor1.element(), cursor2.element())) {
//	            Monomio a = new Monomio(cursor1.element().getCoeficiente() + cursor2.element().getCoeficiente(), cursor1.element().getExponente());
//	            nuevo.addLast(a);
//	            cursor1 = p1.terms.next(cursor1);
//	            cursor2 = p2.terms.next(cursor2);
//	        } else {
//	            if (expmayor(cursor1.element(), cursor2.element())) {
//	                Monomio a = new Monomio(cursor1.element().getCoeficiente(), cursor1.element().getExponente());
//	                nuevo.addLast(a);
//	                cursor1 = p1.terms.next(cursor1);
//	            } else {
//	                Monomio a = new Monomio(cursor2.element().getCoeficiente(), cursor2.element().getExponente());
//	                nuevo.addLast(a);
//	                cursor2 = p2.terms.next(cursor2);
//	            }
//	        }
//	    }
//
//	    // Agregar los términos restantes, si los hay, de los polinomios p1 y p2.
//	    while (cursor1 != null) {
//	        nuevo.addLast(cursor1.element());
//	        cursor1 = p1.terms.next(cursor1);
//	    }
//	    while (cursor2 != null) {
//	        nuevo.addLast(cursor2.element());
//	        cursor2 = p2.terms.next(cursor2);
//	    }
//
//	    Polinomio resultado = new Polinomio(nuevo);
//	    return resultado;
//	}

  

    
  /**
   * Substraccion de dos polinomios.
   * @param p1 primer polinomio.
   * @param p2 segundo polinomio.
   * @return la resta de los polinomios.
   */
  public static Polinomio resta(Polinomio p1, Polinomio p2) {
	    PositionList<Monomio> nuevo = new NodePositionList<>();
	    Position<Monomio> cursor1 = p1.terms.first();
	    Position<Monomio> cursor2 = p2.terms.first();

	    while (cursor1 != null && cursor2 != null) {
	        if (mismoexponente(cursor1.element(), cursor2.element())) {
	            Monomio a = new Monomio(cursor1.element().getCoeficiente()+(cursor2.element().getCoeficiente()*(-1)), cursor1.element().getExponente());
	            if(a.getCoeficiente() == 0) {
					  cursor1 = p1.terms.next(cursor1);
					  cursor2 = p2.terms.next(cursor2); 
					  }
				  else {
					  nuevo.addLast(a);
					  cursor1 = p1.terms.next(cursor1);
					  cursor2 = p2.terms.next(cursor2);  
				  }
	        } else {
	            if (expmayor(cursor1.element(), cursor2.element())) {
	                Monomio a = new Monomio(cursor1.element().getCoeficiente(), cursor1.element().getExponente());
	                nuevo.addLast(a);
	                cursor1 = p1.terms.next(cursor1);
	            } else {
	                Monomio a = new Monomio((-1)*cursor2.element().getCoeficiente(), cursor2.element().getExponente());
	                nuevo.addLast(a);
	                cursor2 = p2.terms.next(cursor2);
	            }
	        }
	    }

	    // Agregar los términos restantes, si los hay, de los polinomios p1 y p2.
	    while (cursor1 != null) {
	        nuevo.addLast(cursor1.element());
	        cursor1 = p1.terms.next(cursor1);
	    }
	    while (cursor2 != null) {
	    	Monomio a= new Monomio(cursor2.element().getCoeficiente()*-1, cursor2.element().getExponente());
	        nuevo.addLast(a);
	        cursor2 = p2.terms.next(cursor2);
	    }

	    Polinomio resultado = new Polinomio(nuevo);
	    return resultado;
	}

    
  /**
   * Calcula el producto de dos polinomios.
   * @param p1 primer polinomio.
   * @param p2 segundo polinomio.
   * @return el producto de los polinomios.
   */


  public static Polinomio multiplica(Polinomio p1, Polinomio p2) {
	  PositionList<Monomio> nueva = new NodePositionList<>();
	  Position<Monomio> pos1 = p1.terms.first();
	  Position<Monomio> pos2 = p2.terms.first();
	  
	  while(pos1!= null && pos2 != null) {
		  Monomio a = new Monomio (pos1.element().getCoeficiente(), pos1.element().getExponente());
		  Monomio b = new Monomio (pos2.element().getCoeficiente(), pos2.element().getExponente());
		  Monomio c = new Monomio(a.getCoeficiente() * b.getCoeficiente(), a.getExponente()* b.getExponente());
		  nueva.addLast(c);
		  pos1 = p1.terms.next(pos1);
		  pos2 = p2.terms.next(pos2);
		  
	  
	  //Para ordenar la lista
	  
	  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
//      PositionList<Monomio> nuevo1 = new NodePositionList<>();
//      Position<Monomio> cursor1 = p1.terms.first();
//      Position<Monomio> cursor2;
//
//      while (cursor1 != null) {
//          if (cursor1.element().getCoeficiente() != 0) {
//              cursor2 = p2.terms.first();
//
//              while (cursor2 != null) {
//                  if (cursor2.element().getCoeficiente() != 0) {
//                      int nuevoCoeficiente = cursor1.element().getCoeficiente() * cursor2.element().getCoeficiente();
//                      int nuevoExponente = cursor1.element().getExponente() + cursor2.element().getExponente();
//
//                      boolean encontrado = false;
//                      Position<Monomio> position = nuevo1.first();
//                      while (position != null) {
//                          if (position.element().getExponente() == nuevoExponente) {
//                              // Suma los coeficientes si encuentra un monomio con el mismo exponente
//                              nuevoCoeficiente += position.element().getCoeficiente();
//                              Monomio monomioActualizado = new Monomio(nuevoCoeficiente, nuevoExponente);
//                              nuevo1.set(position, monomioActualizado);
//                              encontrado = true;
//                              break;
//                          }
//                          position = nuevo1.next(position);
//                      }
//
//                      // Si no encuentra un monomio con el mismo exponente, agrega uno nuevo al resultado
//                      if (!encontrado) {
//                          Monomio nuevoMonomio = new Monomio(nuevoCoeficiente, nuevoExponente);
//                          nuevo1.addLast(nuevoMonomio);
//                      }
//                  }
//                  cursor2 = p2.terms.next(cursor2);
//              }
//          }
//          cursor1 = p1.terms.next(cursor1);
//      }

      // Ordenar la lista por exponente de mayor a menor
//      nuevo1 = ordenarPorExponente(nuevo1);
//
//      Polinomio resultado = new Polinomio(nuevo1);
//      return resultado;
//  }

  /**
   * Calcula el producto de un monomio y un polinomio.
   * @param m el monomio
   * @param p el polinomio
   * @return el producto del monomio y el polinomio
   */
  public static Polinomio multiplica(Monomio m, Polinomio p) {
	  PositionList <Monomio> nuevo = new NodePositionList<>();
	  Position <Monomio> cursor = p.terms.first();
	  while (cursor != null) {
		  if(m.getCoeficiente() != 0) {
			  Monomio a = new Monomio(cursor.element().getCoeficiente()*m.getCoeficiente(), 
					  cursor.element().getExponente() + m.getExponente());
			  nuevo.addLast(a);
			  cursor = p.terms.next(cursor);
	  }
	  }
	  Polinomio resultado = new Polinomio(nuevo);
	  return resultado;
  }
    
  /**
   * Devuelve el valor del polinomio cuando su variable es sustiuida por un valor concreto.
   * @param valor el valor asignado a la variable del polinomio
   * @return el valor del polinomio para ese valor de la variable.
   */
  public long evaluar(int valor) {
	    long resultado = 0;

	    for (Monomio monomio : terms) {
	        resultado += monomio.getCoeficiente() * Math.pow(valor, monomio.getExponente());
	    }

	    return resultado;
	}

  /**
   * Devuelve el exponente (grado) del monomio con el mayor grado
   * dentro del polinomio
   * Si el polinomio es vacio (la representacion del polinomio "0") entonces
   * el valor devuelto debe ser -1.
   * @return el grado del polinomio
   */
  public int grado() {
	  int res= 0;
	  if(terms.isEmpty())
		  res = -1;
	  else
		  res = terms.first().element().getExponente();
	  return res;
		  }

  public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      Polinomio polinomio = (Polinomio) obj;

      // Compara los términos de los polinomios uno por uno
      Iterator<Monomio> thisIterator = terms.iterator();
      Iterator<Monomio> otherIterator = polinomio.terms.iterator();

      while (thisIterator.hasNext() && otherIterator.hasNext()) {
          Monomio thisMonomio = thisIterator.next();
          Monomio otherMonomio = otherIterator.next();
          
          if (!thisMonomio.equals(otherMonomio)) {
              return false;
          }
      }

      // Si ambos iteradores han llegado al final, los polinomios son iguales
      return !thisIterator.hasNext() && !otherIterator.hasNext();
  }
  
  
  @Override
  public String toString() {
    if (terms.isEmpty()) return "0";
    else {
      StringBuffer buf = new StringBuffer();
      Position<Monomio> cursor = terms.first();
      while (cursor != null) {
        Monomio p = cursor.element();
        int coef = p.getCoeficiente();
        int exp = p.getExponente();
        buf.append(new Integer(coef).toString());
        if (exp > 0) {
          buf.append("x");
          buf.append("^");
          buf.append(new Integer(exp)).toString();
        }
        cursor = terms.next(cursor);
        if (cursor != null) buf.append(" + ");
      }
      return buf.toString();
    }
  }
}
