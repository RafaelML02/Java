package aed.recursion;



import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;



public class Utils {
	
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
	

	
	public static int sqrtaux(int n,int x) {
		if(x*x > n)
			return x-1;
		else{
			return sqrtaux(n,x+1);	
		}
	}

  public static int sqrt(int n) {
	  return sqrtaux(n,1);
  }

  
  
  
  
  
  
  public static Iterable<Integer> primes(int n) {
	  Iterable<Integer> nueva = new NodePositionList<>();
	  if(n<2)return null;
	  else {
		  //creo el array de todos true
		  boolean[] array = new boolean[n+1];
		  array = arrayaux(n,0,array);
		  return primesaux(2,array,nueva);
	  }
  }
  
  
  static boolean[] arrayaux(int n, int i,boolean []arr){
	  if(i<n+1) {
		  arr[i] = true;
		  return arrayaux(n,i+1,arr);
  }
	  return arr;
	  }

  
  public static Iterable<Integer> primesaux(int pos, boolean []arr, Iterable<Integer> nueva){
	  if (pos < arr.length) {
		  if (arr[pos] == true) {
			  ((NodePositionList<Integer>) nueva).addLast(pos);
			  cambiarArray(pos,arr, pos*2);
	  }  
		  return primesaux(pos+1,arr,nueva);
	  }
	  return nueva;
  }
  
  

	public static void cambiarArray(int pos, boolean[] arr, int multiple) {
		if (pos < arr.length) {
	    if (multiple < arr.length) {
	        arr[multiple] = false;
	        cambiarArray(pos, arr, multiple + pos);
	    }}
	}


	public static PositionList<Monomio> suma(PositionList<Monomio> p1, PositionList<Monomio> p2) {
	    PositionList<Monomio> nuevo = new NodePositionList<>();
	    Position<Monomio> pos1 = p1.first();
	    Position<Monomio> pos2 = p2.first();

	    return sumaaux(p1, p2, pos1, pos2, nuevo);
	}

	private static PositionList<Monomio> sumaaux(PositionList<Monomio> p1, PositionList<Monomio> p2,
	        Position<Monomio> pos1, Position<Monomio> pos2, PositionList<Monomio> nuevo) {
//		Monomio a = null;
//		if (pos1 != null) {
//		    a = new Monomio(pos1.element().getCoeficiente(), pos1.element().getExponente());
//		}
//		Monomio b = null;
//		if (pos2 != null) {
//		    b = new Monomio(pos2.element().getCoeficiente(), pos2.element().getExponente());
//		}
		if(pos1 != null && pos2 != null) {
		    Monomio a = new Monomio(pos1.element().getCoeficiente(), pos1.element().getExponente());
		    Monomio b = new Monomio(pos2.element().getCoeficiente(), pos2.element().getExponente());
	            if (mismoexponente(a, b)) {
	                Monomio c = new Monomio(a.getCoeficiente() + b.getCoeficiente(), a.getExponente());
	                nuevo.addLast(c);
	                pos1 = p1.next(pos1);
	                pos2 = p2.next(pos2);
	            } else {
	                if (expmayor(a, b)) {
	                    Monomio c = new Monomio(a.getCoeficiente(), a.getExponente());
	                    nuevo.addLast(c);
	                    pos1 = p1.next(pos1);
	                } else {
	                    Monomio c = new Monomio(b.getCoeficiente(), b.getExponente());
	                    nuevo.addLast(c);
	                    pos2 = p2.next(pos2);
	                }
	            }
	            if(nuevo.last().element().getCoeficiente() == 0)
	            	nuevo.remove(nuevo.last());
	            
	            return sumaaux(p1, p2, pos1, pos2, nuevo);
	           } 
	        
	    if (pos1 != null) {
	    	Monomio x = new Monomio(pos1.element().getCoeficiente(), pos1.element().getExponente());
	        nuevo.addLast(x);
	        return sumaaux(p1, p2, p1.next(pos1), pos2, nuevo);
	    }

	    if (pos2 != null) {
	    	Monomio x = new Monomio(pos2.element().getCoeficiente(),pos2.element().getExponente());
	        nuevo.addLast(x);
	        return sumaaux(p1, p2, pos1, p2.next(pos2), nuevo);
	    }

		return nuevo;
	}
}
		
	
	
	
	
	


  
  
  
  
  
	
