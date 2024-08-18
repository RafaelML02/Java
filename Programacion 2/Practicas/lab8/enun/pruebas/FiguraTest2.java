package lab8.enun.pruebas;
/** 
 * Pruebas de figuras geométricas.
 * 
 * @author PII
 */
import lab8.enun.figuras.*;
import stdlib.StdDraw;

public class FiguraTest2
{
  public static IPunto p1;
  public static IPunto p2;

  public static IFigura f1, d1, d2, r1, r2, c1, c2;
  
  public static Rectangulo r5;
  
  public static void resetear ()
  {
    p1 = new Punto(10, 20);
    p2 = new Punto(20, 20);   

    d1 = new Dot(new Punto(100, 200));
    d2 = new Dot(new Punto(80, 40));

    r1 = new Rectangulo(new Punto(10, 20), 40, 20);
    r2 = new Rectangulo(new Punto(40, 20), 50, 10);
    r5 = new Rectangulo(new Punto(100, 100), 200, 100);

    c1 = new Circulo(new Punto(100, 200), 30);
    c2 = new Circulo(new Punto(40, 20), 10);  
  }
  public static void mostrar () 
  {
    System.out.println("p1 = " + p1);
    System.out.println("p2 = " + p2);
    
    System.out.println("d1 = " + d1);
    System.out.println("d2 = " + d2);

    System.out.println("r1 = " + r1);
    System.out.println("r2 = " + r2);
    System.out.println("r5 = " + r5);
    
    System.out.println("c1 = " + c1);
    System.out.println("c2 = " + c2);
  }
  public static void pruebaPolimorfismo () 
  {
    System.out.println("pruebaPolimorfismo... ");
    resetear();
    System.out.println("Figura -> f1 = " + f1);  
    f1 = c1;
    System.out.println("Circulo -> f1 = " + f1);
    f1 = r1;
    System.out.println("Rectangulo -> f1 = " + f1);
    f1 = d1; 
    System.out.println("Dot -> f1 = " + f1);
  }
  public static void pruebaCasting () 
  {
    System.out.println("pruebaCasting... ");
    resetear();
    IFigura c3 = new Circulo(new Punto(100, 200), 150);
    System.out.println("c3 = " + c3);
    IFigura f3 = new Dot(new Punto(50, 70));
    System.out.println("f3 = " + f3);
    
    // Error!! java.lang.ClassCastException:
    // System.out.println("(Circulo)f3 = " + (Circulo)f3);  //Error!!
    
    f3 = c3;
    System.out.println("Tipo Figura -> f3 = " + f3);
    System.out.println("Tipo Circulo -> (Circulo)f3 = " + (Circulo)f3);
    
    f3 = r2;
    System.out.println("Tipo Figura -> f3 = " + f3);
    System.out.println("Tipo Rectangulo -> (Rectangulo)f3 = " + (Rectangulo)f3); 
    // Error!! java.lang.ClassCastException:
    System.out.println("Tipo Circulo -> (Circulo)f3 = " + (Circulo)f3); 
    // f3 = new Figura(new Punto(10, 20)); //Error de compilación
  }
  public static void pruebaMover () 
  {
    resetear();
    FiguraJugar.iniciarGraficos();    
    r1.pintar();
    r1.mover(50, 50);
    r1.pintar();
    r1.mover(50, 50);
    r1.pintar();
    r1.mover(50, 50);
    r1.pintar();
    //
    c1.pintar();
    c1.mover(50, 0);
    c1.pintar();
    c1.mover(50, 0);
    c1.pintar();
    c1.mover(50, 0);
    c1.pintar();
  }
  public static void pruebaAnimacion () 
  {
    resetear();
    FiguraJugar.iniciarGraficos();    
    StdDraw.enableDoubleBuffering();
    r1.pintar();
    for (int i=1; i<=15; i++)
    {
      StdDraw.clear();
      r1.mover(20, 20);
      r1.pintar();
      StdDraw.show();
      StdDraw.pause(500);
    }
    c1.pintar();
    for (int i=1; i<=15; i++)
    {
      StdDraw.clear();
      c1.mover(20, 0);
      c1.pintar();
      StdDraw.show();
      StdDraw.pause(500);
    }
  }
  public static void main (String[] args) 
  {
    //Constructores y mostrar en modo texto:
    resetear();
    mostrar();
    
    //Ligadura dinámica:
//     pruebaPolimorfismo();
//     pruebaCasting();
    
    //Gráficos:
    pruebaMover(); 
    
    //Animación:
    pruebaAnimacion();
  }
  
}