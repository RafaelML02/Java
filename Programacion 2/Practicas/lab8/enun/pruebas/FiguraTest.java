package lab8.enun.pruebas;
/** 
 * Pruebas de figuras geométricas.
 * 
 * @author PII
 */
import lab8.enun.figuras.*;

import stdlib.StdDraw;
import java.awt.Color;

public class FiguraTest
{
  public static final int MAX = 600;
  public static final int ESCALA = 300;
  public static final double GROSORPINCEL = 0.01;
  public static final Color COLOR_FONDO = StdDraw.CYAN;
  
  public static void iniciarGraficos () 
  {  
    StdDraw.setCanvasSize(MAX, MAX);
    StdDraw.clear(StdDraw.BLACK);
    StdDraw.setScale(-ESCALA, ESCALA);
    StdDraw.setPenRadius(GROSORPINCEL);
    StdDraw.setPenColor(StdDraw.RED);
  }  

  public static IPunto p1, p2, p3, p4, p5;

  public static IFigura d1, d2, c1, c2, r1, r2, triangulo;

  public static Rectangulo r5;

  public static IPunto[] arr3;

  public static void resetear ()
  {
    p1 = new Punto(10, 20);
    p2 = new Punto(20, 20);   

    d1 = new Dot(new Punto(100, -200), StdDraw.YELLOW);
    d2 = new Dot(new Punto(-80, -40), StdDraw.ORANGE);

    r1 = new Rectangulo(new Punto(10, 20), 40, 20, StdDraw.RED);
    r2 = new Rectangulo(new Punto(40, 20), 50, 10, StdDraw.GREEN);
    r5 = new Rectangulo(new Punto(100, 100), 200, 100);

    c1 = new Circulo(new Punto(100, 200), 30);
    c2 = new Circulo(new Punto(60, 60), 10);  

    p3 = new Punto(60, 150);
    p4 = new Punto(125, 150);
    p5 = new Punto(125, 180);
    arr3 = new IPunto[]{p3, p4, p5};
    triangulo = new Poligono(arr3);
  }
  public static void mostrar () 
  {
    System.out.println("p1 = " + p1);
    System.out.println("p2 = " + p2);
    
    System.out.println("d1 = " + d1);
    System.out.println("d2 = " + d2);
    
    System.out.println("c1 = " + c1);
    System.out.println("c2 = " + c2);

    System.out.println("r1 = " + r1);
    System.out.println("r2 = " + r2);
    System.out.println("r5 = " + r5);   

    System.out.println("triangulo = " + triangulo);   
  }
  public static void pintarPrueba () 
  {
    resetear();
    d1.pintar();
    d2.pintar();
    r1.pintar();
    r2.pintar();
    c1.pintar();
    c2.pintar();
    triangulo.pintar();
  }
  public static boolean distanciaPrueba ()
  {
    resetear();
    return
      c1.distancia(d1) == 400 &&
      (int)c1.distancia(r1) == 201 &&
      (int)c1.distancia(c2) == 145 &&
      (int)c1.distancia(triangulo) == 64;
   }
  static boolean perimetroPrueba ()
  {
    return
      d1.perimetro() == 0 &&
      (int)c1.perimetro() == 188 
      &&
      (int)c2.perimetro() == 62
      &&
      r1.perimetro() == 120 
      &&
      r2.perimetro() == 120 
      &&
      (int)triangulo.perimetro() == 166
  ;}
  public static boolean equalsPrueba ()
  {
    resetear();
    return
      c1.equals(d1) == false &&
      c1.equals(r1) == false &&
      c1.equals(c1) == true &&
      c1.equals(triangulo) == false &&
      r1.equals(r1) == true && 
      triangulo.equals(triangulo) == true;
   }
  public static void main (String[] args) 
  {
    //Constructores y mostrar en modo texto:
    resetear();
    mostrar();
    
    //Gráficos:
    iniciarGraficos(); 
    pintarPrueba();
    
    //Pruebas de Operaciones:
    System.out.println("distanciaPrueba() = " + distanciaPrueba());
    System.out.println("perimetroPrueba() = " + perimetroPrueba());
    System.out.println("equalsPrueba() = " + equalsPrueba());
    equalsPrueba ();
  }
  
}