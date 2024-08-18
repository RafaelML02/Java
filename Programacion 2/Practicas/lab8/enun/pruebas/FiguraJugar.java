package lab8.enun.pruebas;

/** 
 * Pruebas de figuras geométricas
 * 
 * @author PII 
 */
import lab8.enun.figuras.*;
import java.awt.Color;
import stdlib.StdDraw;

public class FiguraJugar
{
  public static final int MAX = 600;
  public static final int ESCALA = 300;
  public static final double GROSORPINCEL = 0.01;
  
  public static void iniciarGraficos () 
  {  
    StdDraw.setCanvasSize(MAX, MAX);
    StdDraw.clear(StdDraw.BLACK);
    StdDraw.setScale(-ESCALA, ESCALA);
    StdDraw.setPenRadius(GROSORPINCEL);
    StdDraw.setPenColor(StdDraw.RED);
  }  
  public static void pruebaDot ()
  {
    IFigura d1 = new Dot(new Punto(150, 150), StdDraw.RED);
    IFigura d2 = new Dot(new Punto(150, -150), StdDraw.GREEN);    
    d1.pintar();
    d2.pintar();
  }
  public static void pruebaCirculo ()
  {
    IFigura c1 = new Circulo(new Punto(0, 0), 30, StdDraw.RED);
    IFigura c2 = new Circulo(new Punto(40, 20), 10, StdDraw.GREEN);  
    c1.pintar();
    c2.pintar();
  }
  public static void pruebaRectangulo ()
  {
    IFigura r1 = new Rectangulo(new Punto(100, -20), 40, 20, StdDraw.RED);
    IFigura r2 = new Rectangulo(new Punto(-40, 60), 50, 10, StdDraw.GREEN);
    IFigura r3 = new Rectangulo(new Punto(100, 100), 60, 30, StdDraw.BLUE);
    r1.pintar();
    r2.pintar();
    r3.pintar();
  }
  public static void pruebaPoligono ()
  {
    IPunto p1 = new Punto(20, 200);
    IPunto p2 = new Punto(150, 200);
    IPunto p3 = new Punto(150, 260);
    IPunto p4 = new Punto(110, 290);
    IPunto p5 = new Punto(50, 280);
    IPunto[] arr5 = new IPunto[]{p1, p2, p3, p4, p5};
    IFigura pentagono = new Poligono(arr5, StdDraw.YELLOW);
    pentagono.pintar();
  }
  public static void main (String[] args) 
  {
    iniciarGraficos();
    pruebaDot(); 
    pruebaCirculo();
    pruebaRectangulo();
    pruebaPoligono();
  }
}