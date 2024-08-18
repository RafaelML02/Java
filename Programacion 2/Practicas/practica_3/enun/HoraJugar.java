/** 
 * HoraJugar
 *
 * Pruebas informales de la clase Hora.
 * 
 * @author PII
 */
package practica_3.enun;

public class HoraJugar
{
  public static void main (String[] args) 
  {   
    Hora h1 = new Hora(2, 6, 12); 
    Hora h2 = new Hora("11:28:00");
    Hora h3 = new Hora(11*3600+28*60);
    Hora ahora = Hora.ahora();

    System.out.println("h1 = " + h1);
    System.out.println("h2 = " + h2);
    System.out.println("h3 = " + h3);
    System.out.println("ahora = " + ahora);

    System.out.println("h1.equals(h2) = " + h1.equals(h2));
    
    //Prueba especifica pedida
    System.out.println(Hora.ahora().diferencia(new Hora(12,0,0)));
    
    
    // Pruebas de todos los metodos
    System.out.println("H1 en segundos es " + h1.aSegundos());
    System.out.println("La nueva hora de h1 es " + h1.suma(50));
    System.out.println("La diferencia entre h1 y h2 es de " + h1.diferencia(h2));
    System.out.println("La diferencia de h1 con la hora actual es de " + h1.diferencia(new Hora(3,33,33)));
    
    System.out.println(h1.horas());
    System.out.println(h1.minutos());
    System.out.println(h1.segundos());
   
  
  }}
