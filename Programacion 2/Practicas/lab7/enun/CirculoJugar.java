package lab7.enun;
import stdlib.*;

/** 
 * Pruebas de la clase Circulo.
 *
 * @author PII
 */
public class CirculoJugar
{
  public static void main (String[] args) 
  {  
    //Constructor:
    Circulo c1 = new Circulo(3, 4, 4);
    Circulo c2 = new Circulo(10, 20, 40);
    
    //Visualizador:
    System.out.println("c1 = " + c1);
    System.out.println("c2 = " + c2);
    
    //Modificador - mover:
    System.out.println("c2.mover(20, 20);"); 
    c2.mover(20, 20);
    System.out.println("c2 = " + c2);   
  }
}  
  
