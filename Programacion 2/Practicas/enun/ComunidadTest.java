/**
 * Pruebas de Comunidad<br>
 *
 * @author PII
 */
package enun;
import tads.*;



public class ComunidadTest
{
  
  public static Comunidad comunidad0, comunidad1, comunidad2, comunidad3, comunidad5;
  
  public static void resetear ()
  {
    LocalidadTest.resetear();

    comunidad0 = new Comunidad();

    comunidad1 = new Comunidad();
    comunidad1.add(LocalidadTest.loc1);

    comunidad2 = new Comunidad();
    comunidad2.add(LocalidadTest.loc1);
    comunidad2.add(LocalidadTest.loc2);

    comunidad3 = new Comunidad();
    comunidad3.add(LocalidadTest.loc1);
    comunidad3.add(LocalidadTest.loc2);
    comunidad3.add(LocalidadTest.loc3);
    
    comunidad5 = new Comunidad();
    comunidad5.add(LocalidadTest.loc1);
    comunidad5.add(LocalidadTest.loc2);
    comunidad5.add(LocalidadTest.loc3);
    comunidad5.add(LocalidadTest.loc4);
    comunidad5.add(LocalidadTest.loc5);  
  }
  static void mostrar ()
  {
    System.out.println("comunidad0 = \n" + comunidad0);
    System.out.println("comunidad1 = \n" + comunidad1);
    System.out.println("comunidad2 = \n" + comunidad2);
    System.out.println("comunidad3 = \n" + comunidad3);
    System.out.println("comunidad5 = \n" + comunidad5);
  }
  // public static boolean test_posicion ()
  // {
    // return 
      // test1_buscaTelefono() &&
      // test2_buscaTelefono() &&
      // test3_buscaTelefono();
  // }
  public static void test_posicion ()
  {
    resetear();
    System.out.println("comunidad5.posicion(Alcorcon) = " +
                        comunidad5.posicion("Alcorcon"));
    System.out.println("comunidad5.posicion(Mostoles) = " +
                        comunidad5.posicion("Mostoles"));
    System.out.println("comunidad1.posicion(Mostoles) = " +
                        comunidad1.posicion("Mostoles"));
  }
  public static void test_poblacion ()
  {
    resetear();
    System.out.println("comunidad5.poblacion(Alcorcon) = " +
                        comunidad5.poblacion("Alcorcon"));
    System.out.println("comunidad5.poblacion(Mostoles) = " +
                        comunidad5.poblacion("Mostoles"));
    System.out.println("comunidad5.poblacion(Fuenlabrada) = " +
                        comunidad5.poblacion("Fuenlabrada"));
  }
  public static void test_poblacionConjunta ()
  {
    resetear();
    IList<String> locs = new ArrayList<String>();
    locs.add("Alcorcon");
    locs.add("Mostoles");
    locs.add("Fuenlabrada");
    System.out.println("locs = " + locs);
    System.out.println("comunidad5.poblacionConjunta(locs) = " +
                        comunidad5.poblacionConjunta(locs));
  }
  public static void main (String[] args)
  {
    resetear();
    mostrar();
    // test_posicion();
    test_poblacion();
    test_poblacionConjunta();
  }
}