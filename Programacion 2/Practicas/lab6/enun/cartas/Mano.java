package lab6.enun.cartas;
import tads.ArrayList;
import tads.IList;

public class Mano implements IMano{
	private IList<Carta> mano;
	
	
	public Mano() {
		mano = new ArrayList<>();
	}
	
	public String toString() {
		String s = "[";
	    for (int i = 0; i < mano.size(); i += 1){ 
	      if (i!=0) s += ", ";
	      if (i!=0 && i%4==0) s += "\n";
	      s += mano.get(i);
	    }
	    s += "]";
	    return s;   
	}
	  /**
	   Añade carta a esta mano (poniéndola al final). 
	   */
	public void add (Carta carta) {
		mano.add(carta);
	  }
	
	  /**
	   Quita de esta Mano la carta que está en pos. 
	   */
	public void quitarCarta (int pos) {
		if(pos>0 && pos<mano.size())
			mano.remove(pos);
	}
	  /**
	   POST: resultado es el número de cartas que hay en esta Mano.
	   */
	public int size () {
		  return mano.size();
	  }
	  /**
	   POST: resultado es la Carta que ocupa la posición pos en esta Mano.
	   */
	public Carta carta (int pos) {
		if(pos>=0 && pos<mano.size())
			return mano.get(pos);
		return null;
	  }

}
