/** 
 * Algunas pruebas de la clase Fecha.
 * 
 * @author PII
 */
package practica_3.enun;

public class FechaTest 
{
  static Fecha f1, f2, f3, f4, f5, f6, f7, f8, f9;
  
  static void resetear ()
  {
//     f1 = new Fecha(0, 6, 1978);   //Destapar y ver qu� pasa
    f2 = new Fecha(1, 6, 1978); 
//     f3 = new Fecha(1, 14, 1978);  //Destapar y ver qu� pasa
//     f4 = new Fecha(31, 6, 1978);  //Destapar y ver qu� pasa
    f5 = new Fecha(31, 1, 2016); 
    f6 = new Fecha(1, 2, 2016); 
    f7 = new Fecha(31, 12, 2016); 
    f8 = new Fecha(1, 1, 2017); 
    f9 = new Fecha("2/2/2016"); 
  }
  static boolean testEquals ()
  { 
    boolean test1Equals = f5.equals(f5) == true;
    boolean test2Equals = f5.equals(f2) == false;
    boolean test3Equals = f7.equals(f8) == false;
    return 
      test1Equals &&
      test2Equals &&
      test3Equals;
  }
  static boolean testEsMenor ()
  {
    boolean test1EsMenor = f5.esMenor(f5) == false;
    boolean test2EsMenor = f5.esMenor(f2) == false;
    boolean test3EsMenor = f7.esMenor(f8) == true;
    return
      test1EsMenor &&
      test2EsMenor &&
      test3EsMenor;
  }
  static boolean testSiguiente ()
  {
    boolean test1Siguiente = f6.siguiente().equals(f9);
    boolean test2Siguiente = f5.siguiente().equals(f6);
    boolean test3Siguiente = f7.siguiente().equals(f8);
    return  
      test1Siguiente &&
      test2Siguiente &&
      test3Siguiente;
  }
  static boolean testSuma ()
  {
    boolean test1Suma = f6.suma(0).equals(f6);
    boolean test2Suma = f6.suma(1).equals(f9);
    boolean test3Suma = f7.suma(1).equals(f8);
    return  
      test1Suma &&
      test2Suma &&
      test3Suma;
  }
  static boolean testDiferencia ()
  {
    boolean test1Diferencia = f6.diferencia(f6) == 0;
    boolean test2Diferencia = f9.diferencia(f6) == 1;
    boolean test3Diferencia = f8.diferencia(f7) == 1;
    return  
      test1Diferencia &&
      test2Diferencia &&
      test3Diferencia;
  }
  public static void main (String[] args) 
  {   
     resetear(); //Comprobar qu� pasa si no se ejecuta esta sentencia.
     System.out.println("testEquals() = " + testEquals());
     System.out.println("testEsMenor() = " + testEsMenor());
     System.out.println("testSiguiente() = " + testSiguiente());  
     System.out.println("testSuma() = " + testSuma());
     System.out.println("testDiferencia() = " + testDiferencia());
  }
}
