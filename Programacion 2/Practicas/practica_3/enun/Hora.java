/** 
 * Hora 
 *
 * Representa una hora como hh:mm:ss.
 *
 * @author PII
 */
package practica_3.enun;
import java.util.Date;


class Hora
{
  private int hh; // horas
  private int mm; // minutos
  private int ss; // segundos
  
  Hora (int hh, int mm, int ss) 
  {
    this.hh = hh;
    this.mm = mm;
    this.ss = ss;
  }
  Hora (String hora)
  {
    String[] items = hora.split(":");
    hh = Integer.parseInt(items[0]);
    mm = Integer.parseInt(items[1]);
    ss = Integer.parseInt(items[2]);
  }
  Hora (int segs)
  { 
    hh = horas(segs);
    mm = minutos(segs);
    ss = segundos(segs);
  }   
  public String toString () 
  {
    return String.format("%02d:%02d:%02d", hh, mm, ss);
  } 
  public static Hora ahora ()
  { 
    String[] items = new Date().toString().split(" ");
    String bloqueHora = items[3];
    String[] itemsHora = bloqueHora.split(":");
    int h = Integer.parseInt(itemsHora[0]);
    int m = Integer.parseInt(itemsHora[1]);
    int s = Integer.parseInt(itemsHora[2]);
    return new Hora(h, m, s); 
  }
  public boolean equals (Object o) 
  {
    Hora h = (Hora)o;
    return 
      hh == h.hh && 
      mm == h.mm && 
      ss == h.ss;
  }
  public boolean esMenor (Hora h) 
  {
    return 
      (hh < h.hh) ||
      (hh == h.hh && mm < h.mm) ||
      (hh == h.hh && mm == h.mm && ss < h.ss);
  }
  int aSegundos ()
  {
    return hh*3600 + mm*60 + ss; 
  }
  Hora suma (int s)
  { 
    return new Hora (this.aSegundos() + s);
  }
  int diferencia (Hora h)
  {  
    return this.aSegundos() - h.aSegundos();
  }
  int horas () 
  {
    return hh;
  }
  int minutos () 
  {
    return mm;
  }    
  int segundos () 
  { 
    return ss;
  }    
  private int horas (int segs) 
  {
    return segs/3600;
  }
  private int minutos (int segs) 
  {
    return (segs % 3600) / 60;
  }    
  private int segundos (int segs) 
  { 
    return (segs % 3600) % 60;
  }  
  
}