package lab6.enun.cartas;

import stdlib.StdDraw;
/**
 * Pruebas con cartas de la baraja.
 * 
 * @author PII
 */
public class BarajaJugar
{
  public static final int XMAX = 1200;
  public static final int YMAX = 600;
  public static final int ESCALA = 100;
    
  public static void iniciarGraficos () 
  {  
    StdDraw.setCanvasSize(XMAX, YMAX);
    StdDraw.setScale(0, ESCALA);
    // StdDraw.setPenRadius(5);
    StdDraw.setPenColor(StdDraw.BLACK);
  }  
  public static void pausa ()
  {
    int ESPACIO = 32;
    int UN_SEGUNDO = 1000;
    do {} while (!StdDraw.isKeyPressed(ESPACIO));
    StdDraw.pause(UN_SEGUNDO);
  }
  /**
   Pinta la carta en las coordenadas (x, y) de la ventana, 
   teniendo en cuenta si está boca arriba o no. 
   Hay que llamar previamente a iniciarGraficos().
   */
  public static void pintar (Carta carta, double x, double y) 
  {
    if (carta.estaBocaArriba())
      StdDraw.picture(x, y, "./images/"+carta+".jpg", 4, 10);
    else
      StdDraw.picture(x, y, "./images/reverso.jpg", 4, 10);
  }
  /**
   Pinta baraja en la posición (x, y) del lienzo. 
  */
  public static void pintar (IBaraja baraja, double x, double y)
  {
    for (int i = 0; i < baraja.size(); i++)
      pintar(baraja.carta(i), x + i * 2.3, y);    
  }
  /**
   Pinta mano en la posición (x, y) del lienzo. 
  */
  public static void pintar (IMano mano, double x, double y)
  {
    for (int i = 0; i < mano.size(); i++)
      pintar(mano.carta(i), x + i * 5, y);    
  }
  public static void prueba1Carta ()
  {
    Carta asDeOros = new Carta("As", "Oros");
    System.out.println(asDeOros);
  }
  public static void prueba2Carta ()
  {
    Carta asDeOros = new Carta("As", "Oros");
    iniciarGraficos();
    pintar(asDeOros, 20, 40);
    pausa();
    asDeOros.darLaVuelta();
    pintar(asDeOros, 20, 40);
  }
  public static void prueba1Baraja ()
  {
    IBaraja baraja = new BarajaArray();
    // IBaraja baraja = new BarajaIList();
    System.out.println(baraja);
    baraja.barajar(); 
    System.out.println();
    System.out.println(baraja);
  }
  public static void prueba2Baraja ()
  {
    IBaraja baraja = new BarajaArray();
    // IBaraja baraja = new BarajaIList();
    iniciarGraficos();
    pintar(baraja, 5, 90);
    pausa();
    baraja.barajar(); 
    pintar(baraja, 5, 90);
  }
//  public static void pruebaMano ()
//  {
//    IBaraja baraja = new BarajaArray();
//    // IBaraja baraja = new BarajaIList();
//    iniciarGraficos();
//    pintar(baraja, 5, 90);
//    pausa();
//    IMano mano = baraja.repartoMano(7);
//    pintar(mano, 5, 70);
//    pintar(baraja, 5, 60);    
//  }
  public static void main ( String[] args)
  {
     prueba1Carta();
     prueba2Carta();
     prueba1Baraja();
    prueba2Baraja();
//     pruebaMano();
  }
} 
