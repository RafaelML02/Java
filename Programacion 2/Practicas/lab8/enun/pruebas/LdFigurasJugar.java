package lab8.enun.pruebas;
/** 
 * Pruebas de LdFiguras
 * 
 * @author PII
 */
import lab8.enun.figuras.*;
import lab8.enun.ldfiguras.*;
import stdlib.StdDraw;
import java.awt.Color;

public class LdFigurasJugar
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
  public static IPunto[] array3 ()
  {
    // IPunto p0 = new Punto(60, 40);
    IPunto p0 = new Punto(0, 0);
    IPunto p1 = new Punto(100, 50);
    IPunto p2 = new Punto(90, 20);
    return new IPunto[]{p0, p1, p2};
  }
  public static IPunto[] array5 ()
  {
    IPunto p1 = new Punto(20, 100);
    // IPunto p1 = new Punto(0, 0);
    IPunto p2 = new Punto(75, 100);
    IPunto p3 = new Punto(75, 130);
    IPunto p4 = new Punto(50, 150);
    IPunto p5 = new Punto(25, 150);
    return new IPunto[]{p1, p2, p3, p4, p5};
  }
  public static void prueba ()
  {
    IFigura d1 = new Dot(new Punto(-150, 150), StdDraw.RED);
    IFigura d2 = new Dot(new Punto(-200, -200), StdDraw.GREEN);    
    IFigura c1 = new Circulo(new Punto(100, -200), 20, StdDraw.RED);
    IFigura c2 = new Circulo(new Punto(-100, -80), 30, StdDraw.GREEN);  
    IFigura r1 = new Rectangulo(new Punto(100, 100), 20, 10, StdDraw.RED);
    IFigura r2 = new Rectangulo(new Punto(150, -150), 25, 50, StdDraw.BLUE);
    IFigura triangulo = new Poligono(array3(), StdDraw.YELLOW);
    IFigura pentagono = new Poligono(array5(), StdDraw.ORANGE);

    ILdFiguras ldf5 = new LdFiguras();
    ldf5.add(d1); 
    ldf5.add(d2); 
    ldf5.add(c1); 
    ldf5.add(c2);
    ldf5.add(r1); 
    ldf5.add(r2);   
    ldf5.add(triangulo);
    ldf5.add(pentagono);    
    
    // System.out.println("ldf5 = " + ldf5);
    ldf5.pintar();
  }
  public static void main (String args[])
  {     
    iniciarGraficos();
    prueba();
  }
} 