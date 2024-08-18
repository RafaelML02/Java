/**
 * Pruebas informales de Comunidad<br>
 * 
 * @author PII
 */
package enun;
public class ComunidadJugar
{
  public static void prueba_1 ()
  {
    Comunidad vacia = new Comunidad();
    System.out.println("vacia = " + vacia);   
    System.out.println();
  }
  public static void prueba_2 ()
  {
    LocalidadTest.resetear();
    Comunidad comunidad = new Comunidad();
    comunidad.add(LocalidadTest.loc1);
    comunidad.add(LocalidadTest.loc2);
    comunidad.add(LocalidadTest.loc3);
    System.out.println("comunidad = " + "\n" + comunidad); 
  }
  public static void prueba_3 ()
  {
    Comunidad comunidad = new Comunidad(".\\files\\cam_municipios_poblacion_2022.csv");
    System.out.println("comunidad = " + "\n" + comunidad);   
  }
  public static void prueba_4 ()
  {
    Comunidad comunidad = new Comunidad(".\\files\\cam_municipios_poblacion_2022.csv");
    System.out.println("comunidad = " + "\n" + comunidad.nombresLocalidades());   
  }
  public static void main (String[] args)
  {
     prueba_1();
     prueba_2();
     prueba_3();
     prueba_4();
  }
}