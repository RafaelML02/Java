package practica_2.enun;

public class FraccionMenu {
	private static Fraccion a;
	private static Fraccion b;
	private static final String PRIMER = "1", 
                              SEGUNDO= "2", 
                              SUMA= "3",
                              RESTA="4",
                              PRODUCTO="5",
                              DIVISION="6",
                              SALIR="7";
  private Menu menu;
  
  public FraccionMenu (String[] opciones){
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
    do {
      menu.mostrarOpciones();
      String opcion = menu.leerOpcion();  
      switch (opcion){                                                                                                                  
        case PRIMER: 
        	System.out.println("Fraccion 1 > ");
        	a = new Fraccion(StdIn.readInt(),StdIn.readInt());
        	System.out.println("Fraccion1 =  " + a.toString());
        	espera(3);
          break;  
        case SEGUNDO:
        	System.out.println("Fraccion 2 > ");
        	b = new Fraccion(StdIn.readInt(),StdIn.readInt());
        	System.out.println("Fraccion2 =  " + b.toString());
        	espera(3);
          break; 
        case SUMA:
            System.out.println(a.toString() + " + " + b.toString() + " = " + Fraccion.suma(a, b).toString());
            espera(3); 
            break; 
        case RESTA:
        	System.out.println(a.toString() + " - " + b.toString() + " = " + Fraccion.resta(a, b).toString());
            espera(3);
            break; 
        case PRODUCTO:
        	System.out.println(a.toString() + " * " + b.toString() + " = " + Fraccion.producto(a, b).toString());
            espera(3);
            break; 
        case DIVISION:
        	System.out.println(a.toString() + " / " + b.toString() + " = " + Fraccion.division(a, b).toString());
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
      {"Primer operando", "Segundo operando", "Suma", "Resta", "Producto", "Division", "Salir"};

    new FraccionMenu(opciones);
  }
}