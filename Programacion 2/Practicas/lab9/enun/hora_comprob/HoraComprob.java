package lab9.enun.hora_comprob;
import java.util.Date;

public class HoraComprob {
	  static void propaga () throws ParametroNoValido{
	    System.out.println("propaga: antes. ");
	    Hora h1 = new Hora(11, 28, 0); 
	    Hora ahora = Hora.ahora();
	    Hora h4 = new Hora(25, 28, 0); 
	    Hora h5 = new Hora("27:28:00");
	    Hora h6 = new Hora(30*3600+28*60);
	  
	    System.out.println("h1 = " + h1);
	    System.out.println("ahora = " + ahora);
	    //
	    System.out.println("propaga: despues. ");
	  }
	  
	  static void trata () throws ParametroNoValido{
	    try { 
	      System.out.println("trata: antes.");
	      //
	      Hora h1 = new Hora(11, 28, 0); 
	      Hora ahora = Hora.ahora();
	      Hora h4 = new Hora(25, 28, 0); 
	      Hora h5 = new Hora("27:28:00");
	      Hora h6 = new Hora(30*3600+28*60);
	    
	      System.out.println("h1 = " + h1);
	      System.out.println("ahora = " + ahora);
	      System.out.println("h1.suma(24*3600) = " + h1.suma(24*3600));
	      System.out.println("h1.suma(14*3600) = " + h1.suma(14*3600));
	      System.out.println("h1.diferencia(new Hora(24*3600)) = " + 
	                           h1.diferencia(new Hora(24*3600)));
	      System.out.println("h1.diferencia(new Hora(\"12:00:00\")) = " + 
	                          h1.diferencia(new Hora("12:00:00")));
	      System.out.println("trata: despues.");
	    } 
	    catch (ParametroNoValido  e){
	      System.out.println("trata: capturada excepcion: " + e);
	      e.printStackTrace(); 
	    }
	  } 
	  
	  public static void main (String[] args) throws ParametroNoValido {   
	    System.out.println("main: antes de llamar a propaga");
	    propaga();
	    System.out.println("main: despues de llamar a propaga");
	  }

}
