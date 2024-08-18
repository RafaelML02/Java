package hl;

import hlm.CasillaTresColores;
import hlm.CuadriculaTresColores;

public class Pruebas {
	
	public static void main (String[]args){
		//PRUEBAS CASILLATRESCOLORES
		CasillaTresColores casilla = new CasillaTresColores();
        System.out.println("Color inicial: " + casilla.color());
        casilla.cambiarColor();
        System.out.println("Color después de cambiar: " + casilla.color());
        casilla.cambiarColor();
        System.out.println("Color después de cambiar: " + casilla.color());
        casilla.cambiarColor();
        System.out.println("Color después de cambiar: " + casilla.color());

        //PRUEBAS CUADRICULATRESCOLORES
        CuadriculaTresColores cuadricula = new CuadriculaTresColores();
        try {
            Casilla c = cuadricula.casilla(0, 0);
            System.out.println("Color inicial en (0,0): " + c.color());
            c.cambiarColor();
            System.out.println("Color después de cambiar en (0,0): " + c.color());
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }

        try {
            cuadricula.casilla(-1, 0); // Esto debe lanzar una excepción
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Excepción capturada: " + e.getMessage());
        }
    }
	
	
	
	
	
}
