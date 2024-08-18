package lab6.enun.cartas;

import lab6.enun.juego.ISieteYMedia;
import lab6.enun.juego.SieteYMedia;

public class pruebasPropias {
	public static void main(String []args) {
		
		//PRUEBAS DE BARAJA ARRAY
//		IBaraja baraja = new BarajaIList();
//		System.out.println(baraja.toString());
//		System.out.println("\n");
//		
//		System.out.println(baraja.size());
//		System.out.println(baraja.carta(0).toString());
//		
//		
//		System.out.println(baraja.carta(3).estaBocaArriba());
//		baraja.ponerBocaAbajo(3);
//		System.out.println(baraja.carta(3).estaBocaArriba());
//		
//		baraja.quitarCarta(0);
//		System.out.println(baraja.toString());
//		System.out.println(baraja.size());
//		System.out.println("\n");
//		
//		baraja.barajar();
//		System.out.println(baraja.toString());
//		System.out.println("\n");
//		
//		Mano x =baraja.repartoMano(3);
//		System.out.println(x.toString());
		
		//PRUEBAS DE MANO 
//		IBaraja baraja = new BarajaArray();
//		IMano a = baraja.repartoMano(4);
//		System.out.println(a.size());
//		System.out.println(a.toString());
//		
//		
//		a.add(new Carta("Caballo", "Oros"));
//		System.out.println(a.toString());
//	
//		
//		a.quitarCarta(1);
//		System.out.println(a.toString());
//		
//		
//		System.out.println(a.carta(2));
//		System.out.println(a.carta(4));
		
		//PRUEBAS DE SIETE Y MEDIA
		IMano a = new Mano();
		a.add(new Carta("As","Oros"));
		a.add(new Carta("Siete","Oros"));
		a.add(new Carta("Rey","Copas"));
		a.add(new Carta("Seis","Espadas"));
//		
//		IMano b = new Mano();
//		b.add(new Carta("Siete","Copas"));
//		b.add(new Carta("Sota","Bastos"));
//		
//		
		ISieteYMedia x = new SieteYMedia();
//		System.out.println(a.toString());
//		
//		System.out.println(x.puntos(a));
//		System.out.println(x.puntos(a.carta(2)));
//		
//		System.out.println(x.esSieteYMedia(a));
//		System.out.println(x.esSieteYMedia(b));
//		
//		System.out.println(x.mayorCarta(a));
//		
		System.out.println(x.estaOrdenada(a));

		

	}
}
