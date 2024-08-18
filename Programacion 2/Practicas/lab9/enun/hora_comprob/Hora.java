package lab9.enun.hora_comprob;
import java.util.Date;

public class Hora {
	  private int hh;
	  private int mm;
	  private int ss; 
	  
	  Hora (int h, int m, int s) throws ParametroNoValido { 
	    if (!esHoraValida(h, m, s))
	      throw new ParametroNoValido("hora no valida: " + h + ":" + m + ":" +  s); 
	    hh = h; 
	    mm = m; 
	    ss = s; 
	  } 
	  
	  Hora (String hora) throws ParametroNoValido{
	    String[] items = hora.split(":");
	    int h = Integer.parseInt(items[0]);
	    int m = Integer.parseInt(items[1]);
	    int s = Integer.parseInt(items[2]);
	    if (!esHoraValida(h, m, s))
	      throw new ParametroNoValido("hora no valida: " + h + ":" + m + ":" +  s); 
	    hh = h;
	    mm = m;
	    ss = s;
	  }
	  
	  Hora (int segs) throws ParametroNoValido { 
	    int h = segs/3600;;
	    int m = (segs % 3600) / 60;
	    int s = (segs % 3600) % 60;    
	    if (!esHoraValida(h, m, s))
	      throw new ParametroNoValido("hora no valida: " + h + ":" + m + ":" +  s); 
	    hh = h;
	    mm = m;
	    ss = s;
	  }
	  
	  public String toString (){
		    return String.format("%02d:%02d:%02d", hh, mm, ss);
		  }
	  
	  static Hora ahora () throws ParametroNoValido{ 
	    String[] items = new Date().toString().split(" ");
	    String bloqueHora = items[3];
	    String[] itemsHora = bloqueHora.split(":");
	    int h = Integer.parseInt(itemsHora[0]);
	    int m = Integer.parseInt(itemsHora[1]);
	    int s = Integer.parseInt(itemsHora[2]);
	    return new Hora(h, m, s); 
	  }
	  
	  public boolean equals (Object o) {
	    Hora h = (Hora)o;
	    return 
	      hh == h.hh && 
	      mm == h.mm && 
	      ss == h.ss;
	  }
	  
	  boolean esMenor (Hora h) throws ParametroNoValido{
	    if (!esHoraValida(h.hh, h.mm, h.ss))
	      throw new ParametroNoValido("hora no valida: " + h); 
	    return 
	      (hh < h.hh) ||
	      (hh == h.hh && mm < h.mm) ||
	      (hh == h.hh && mm == h.mm && ss < h.ss);
	  }
	  
	  int aSegundos (){
	    return hh*3600 + mm*60 + ss; 
	  }
	  
	  Hora suma (int s) throws ParametroNoValido{ 
	    return new Hora(aSegundos() + s);
	  }
	  
	  int diferencia (Hora h) throws ParametroNoValido{  
	    if (!esHoraValida(h.hh, h.mm, h.ss))
	      throw new ParametroNoValido("hora no valida: " + h); 
	    int dif = aSegundos() - h.aSegundos();
	    if (dif < 0)
	      throw new ParametroNoValido("hora no valida: " + dif + " segundos");       
	    return dif;
	  }
	  
	  int horas () {
	    return hh;
	  }
	  
	  int minutos () {
	    return mm;
	  }    
	  
	  int segundos () { 
	    return ss;
	  }    
	  
	  
	  // para ver si la hora es correcta
	  private static boolean esHoraValida (int h, int m, int s){
		    return esHorasValido (h) &&
		           esMinutosValido (m) &&
		           esSegundosValido (s);
		  }        
	  private static boolean esHorasValido (int horas){
		  return horas >= 0 && horas < 24; 
		  } 
		  
	  private static boolean esMinutosValido (int minutos){ 
		  return minutos >= 0 && minutos < 60; 
		  }
		  
	  private static boolean esSegundosValido (int segundos){ 
		  return segundos >= 0 && segundos < 60; 
		  }
		  

	  
	}


