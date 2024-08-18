package enun;

import stdlib.In;
import tads.ArrayList;
import tads.IList;

public class Comunidad {
	private IList<Localidad> ldloc;
	
	public int size() {
		return ldloc.size();
	}
	
	public Comunidad() {
		ldloc = new ArrayList<Localidad>();
	}
	
	public Comunidad (String archivo)
	{
	  ldloc = new ArrayList<Localidad>();
	  In in = new In(archivo);
	  String linea = in.readLine(); //Salta la primera línea.
	  while (!in.isEmpty()){
		  linea = in.readLine();
		  filtrar(linea);
	  }
	  in.close();
	}
	
	//MODIFICARLO
	public void filtrar(String linea) {
		boolean encontrado = false;
		String[] aux = linea.split(","); 
        if (!aux[0].equals("Total")) { 
        	int mujeres = 0;
        	int hombres = 0;
        	if(aux[0].equals("Hombres")) 
        		hombres = Integer.parseInt(aux[4]);
        	else {
        		mujeres = Integer.parseInt(aux[4]);	
        	}
        	
        	Localidad loc = new Localidad(aux[2],mujeres,hombres);
        	
            for(int i=0; i<ldloc.size() &&!encontrado; i++) {
            	if(ldloc.get(i).equals(loc)) {
            		Localidad.fusion(ldloc.get(i), loc);
            		encontrado = true;
            	}}
            
            if(!encontrado)
            	ldloc.add(loc);
        }
	}

	public String toString () {
		return "Comunidad = " + ldloc;
	}
	
	public void add(Localidad loc) {
		ldloc.add(ldloc.size(), loc);
	}
	
	public String nombresLocalidades() {
		String res = "";
		for(int i=0; i<ldloc.size(); i++) {
			res += ldloc.get(i).nombre() + "\n";
		}
		return res;
	}
	
	public int posicion(String nombre) {
		for (int i = 0; i < ldloc.size(); i++) {
            if (ldloc.get(i).nombre().equals(nombre))
                return i;
        }
        return -1;
	}
	
	public int poblacion(String nombre) {
		for (int i = 0; i < ldloc.size(); i++) {
            if (ldloc.get(i).nombre().equals(nombre))
                return ldloc.get(i).poblacion();
        }
        return -1;
	}
	
	public int poblacionConjunta(IList<String> locs) {
		int res = 0;
		for(int i = 0; i<locs.size(); i++) {
			String aux = locs.get(i);
			for(int j = 0; j<ldloc.size(); j++) {
				if(ldloc.get(j).nombre().equals(aux))
					res += ldloc.get(j).poblacion();
			}
		}
		return res;
	}
}
