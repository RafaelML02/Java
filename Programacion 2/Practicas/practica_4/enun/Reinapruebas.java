package practica_4.enun;

public class Reinapruebas {

	public static void main(String []args) {
        Tablero tablero = ReinaJugar.leer();
        ReinaJugar.leerYMarcar(tablero);
        ReinaJugar.pintar(tablero);
        int res = ReinaJugar.cuantasAmenazadas(tablero);
        System.out.println("Número de cuadros amenazados: " + res);
        ReinaJugar.tabla();
		
	}
}
