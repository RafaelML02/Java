package practica_1.enun;
public class Menu {
  
  private String[] opciones;
  
  public Menu (String[] opciones)
  {    
    this.opciones = opciones;
  }
  private boolean esOpcionValida (String opcion) 
  {
    int n = Integer.parseInt(opcion);
    return 1 <=  n && n <= opciones.length;
  }
  public String leerOpcion ()
  {
    String opcionSeleccionada;
    do
    {
      System.out.print("\n Seleccione una de las opciones para continuar: ");
      opcionSeleccionada = StdIn.readString();
    } 
    while (!esOpcionValida(opcionSeleccionada));
    return opcionSeleccionada;
  }
  public void mostrarOpciones ()
  {
    System.out.println();
    for (int i=0; i<opciones.length; i++)
    {
      String opcion = Integer.toString(i+1);
      System.out.printf("%s. %s\n", opcion, opciones[i]);
    }
  }
  }
