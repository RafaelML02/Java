package practica_1.enun;

public class FraseadorMenu {
	private static final String CARGAR = "1", 
                              FRASE_TERMINAL = "2", 
                              FRASE_NAVEGADOR = "3",
                              FRASES = "4",
                              SALIR = "5";  

  private Menu menu;
  
  public FraseadorMenu (String[] opciones){
    menu = new Menu(opciones);
    operar(menu);
  }
  
  
  static void esperar1segundo (){
    double ahora = System.currentTimeMillis();
    double dentroDe1Seg = ahora + 1000; 
    while (System.currentTimeMillis() < dentroDe1Seg);
  }

  
  static void espera (int segundos){
    for (int i = 1; i <= segundos; i++)
      esperar1segundo();
  }
  
  
  public static void operar (Menu menu){
    boolean seguir = true;
    do{
      menu.mostrarOpciones();
      String opcion = menu.leerOpcion();  
      switch (opcion){
        case CARGAR: 
        	System.out.println("Usted ha solicitado : Cargar frases");
        	espera(3);
        	break;  
        case FRASE_TERMINAL:
        	System.out.println("Usted ha solicitado : Frase aleatoria en terminal");
        	espera(3);
        	break; 
        case FRASE_NAVEGADOR:
        	System.out.println("Usted ha solicitado : Frase aleatoria en navegador");
            espera(3);
            break; 
        case FRASES:
            System.out.println("Usted ha solicitado : Todas las frases en el navegador");
            espera(3);
            break; 
        case SALIR: 
        	seguir = false;
      }
    }while (seguir);
  }
  
  
  public static void main (String[] args) {
    String[] opciones = {"Cargar frases", "Frase aleatoria en terminal"
    		  , "Frase aleatoria en navegador", "Todas las "
    		  		+ "frases en el navegador", "Salir"};

    new FraseadorMenu(opciones);
  }
  
  
  
  
  
  
}
