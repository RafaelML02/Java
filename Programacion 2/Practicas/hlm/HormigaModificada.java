package hlm;

import hl.Casilla;
import hl.Hormiga;
import hl.ICuadricula;
import hl.IHormiga;

public class HormigaModificada extends Hormiga {

    @Override
    public Giro girar(ICuadricula cuadricula) throws IllegalStateException {
    	int posX = super.coordenadas()[0];
        int posY = super.coordenadas()[1];


        try {
            Casilla aux = cuadricula.casilla(posX, posY);

          if(aux.color() == 0 || aux.color() == 1)
        	  return super.girar(cuadricula);
          
          else if (aux.color() == 2) {
                orientacion = orientacion.girarMediaVuelta();
                return IHormiga.Giro.MEDIA_VUELTA;
            } else {
                throw new IllegalStateException();
            }
        } catch (IndexOutOfBoundsException e) {
            orientacion = orientacion.girarMediaVuelta();
            return IHormiga.Giro.MEDIA_VUELTA;
            
        }
        }
}
