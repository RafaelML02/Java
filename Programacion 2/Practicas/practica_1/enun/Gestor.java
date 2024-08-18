package practica_1.enun;

public class Gestor {
	
  private static final String COMPRAR = "1", 
                              CONSULTAR_SESION = "2", 
                              SALIR = "3";  

  private Menu menu;
  
  public Gestor (String[] opciones)
  {
    menu = new Menu(opciones);
    operar(menu);
  }
  /**
   * Pausa la ejecución durante un segundo.
   */
  static void esperar1segundo ()
  {
    double ahora = System.currentTimeMillis();
    double dentroDe1Seg = ahora + 1000; 
    while (System.currentTimeMillis() < dentroDe1Seg);
  }
  /**
   * Pausa la ejecución durante `segundos`.
   */
  static void espera (int segundos)
  {
    for (int i = 1; i <= segundos; i++)
      esperar1segundo();
  }
  public static void operar (Menu menu) 
  {
    boolean seguir = true;
    do 
    {
      menu.mostrarOpciones();
      String opcion = menu.leerOpcion();  
      switch (opcion)
      {
        case COMPRAR: 
          System.out.println("Opcion 1");
          espera(3);
          break;  
        case CONSULTAR_SESION:
          System.out.println("Opcion 2");
          espera(3);
          break; 
        case SALIR: 
          seguir = false;
      }
    } while (seguir);

  }
  public static void main (String[] args) 
  {
    String[] opciones = 
      {"Comprar Entrada", "Consultar Estado Sesión", "Salir"};

    new Gestor(opciones);
  }
  
}
