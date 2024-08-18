package hlm;

import hl.Cuadricula;
import hl.ICuadricula;
import hl.IHormiga;
import hl.IHormiga.Giro;
import tads.*;
import hl.*;

public class HormigaReiterativa extends HormigaModificada {
	 private static enum Estatus { MOVIENDO, REITERANDO }
	 private Estatus estatus;
	 private int movimientos = 0;
	 public static int vecesParaAlternar = 5;
	 private final IQueue<Giro> giros = new LinkedQueue<>();

	 
	 public HormigaReiterativa () {
		 estatus = Estatus.MOVIENDO;
		 
	 }
	 
	 public void cambiarEstatus() {
		 if(estatus == Estatus.MOVIENDO && movimientos == vecesParaAlternar) {
			 movimientos = 0;
			 estatus = Estatus.REITERANDO;
			 
		 }
		 if(estatus == Estatus.REITERANDO && giros.isEmpty())
			 estatus = Estatus.MOVIENDO;
			 
	 }
	 
	 public Giro girar (ICuadricula cuadricula) throws IllegalStateException {
		 cambiarEstatus();
		 Giro res = null;
		 int posX = super.coordenadas()[0];
		 int posY = super.coordenadas()[1];
		 
		 if(estatus == Estatus.MOVIENDO) {
			 res = super.girar(cuadricula);
			 giros.add(res);
			 movimientos++;
			}
		 
		 else {
			 res = giros.peek();
			 giros.poll();
			 if (posX < 0 || posX >= Cuadricula.DIM || posY < 0 || posY >= Cuadricula.DIM) { 
				 orientacion = orientacion.girarMediaVuelta();   
				 res = Giro.MEDIA_VUELTA;
			 }
				
			 else {
				 switch (res) {
				 case DERECHA: orientacion = orientacion.girarDerecha();
				 break;
				 case IZQUIERDA: orientacion = orientacion.girarIzquierda();
				 break;
				 case MEDIA_VUELTA: orientacion = orientacion.girarMediaVuelta();
				 break; 
				 default : break;
					} // del switch
			 } // del else
		 }//del else
		 return res;
	 }

	 
	 public String rutaDeLaImagen () {
		 if(estatus == Estatus.MOVIENDO)
			 return "res/ant_1.png";
		 else {
			 return "res/ant_2.png";
		 }
	 }
	 
	 public String toString() {
		 return String.format("st: %d, mov: %d, seq: %s, alt: %d",
		 estatus.ordinal(), movimientos, giros.toString(), vecesParaAlternar);
	 }
}