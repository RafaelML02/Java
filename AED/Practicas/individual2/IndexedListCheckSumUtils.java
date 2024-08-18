package aed.individual2;

import es.upm.aedlib.indexedlist.*;

public class IndexedListCheckSumUtils {

  // a no es null, podria tener tamaño 0, n>0
  public static IndexedList<Integer> indexedListCheckSum(IndexedList<Integer> list, int n) {
				IndexedList<Integer> nueva = new ArrayIndexedList<>();

				int suma = 0;
				int posicionActual = 0;

				for(int i =0; i < list.size(); i++) { 
					if(i != 0 && i%n == 0) {
						nueva.add(posicionActual, suma);
						posicionActual++;
						suma = list.get(i);
					}
					
					else {
						suma += list.get(i);
					}

					nueva.add(posicionActual++, list.get(i));
				}
				if(!list.isEmpty()) {
					nueva.add(posicionActual, suma);
				}
				
				return nueva;
  }
      

  public static boolean checkIndexedListCheckSum(IndexedList<Integer> list, int n) {
	  boolean resultado = true;
		int suma = 0;

		for(int i = 0; i < list.size()-1 && resultado; i++) {
			if((i + 1) % (n + 1) == 0) {
				if(suma != list.get(i))
					resultado = false;
				else
					suma = 0;
			}
			else 
				suma += list.get(i);
		}

		if(list.size() > 0 && resultado)
			resultado = suma == list.get(list.size()-1);

		return resultado;
	}
  }

