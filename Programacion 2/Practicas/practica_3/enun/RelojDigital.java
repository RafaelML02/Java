/** 
 * RelojDigital. 
 * 
 * @author PII
 */
package practica_3.enun;
import java.awt.Font;

import stdlib.StdDraw;


public class RelojDigital 
{  
  //Constantes modo gr�fico:
  private static final int XMAX = 1250;
  private static final int YMAX = 700;
  private static final int ESCALA = 100;
  private static final double RADIOPINCEL = 0.02;
  private static final int XTEXTO = ESCALA/2;
  private static final int YTEXTO = ESCALA/2;
  private static final int TAMANOTEXTO = YMAX/3;

  public static void iniciarGraficos () 
  {  
    StdDraw.enableDoubleBuffering();
    StdDraw.setCanvasSize(XMAX, YMAX);
    StdDraw.setScale(0, ESCALA);
    StdDraw.setPenRadius(RADIOPINCEL);
  }  
  public static void print (Hora h) 
  {  
    Font font = new Font("Arial", Font.BOLD, TAMANOTEXTO);
    StdDraw.setFont(font);
    StdDraw.text(XTEXTO, YTEXTO, h.toString());
  }  
  public static void test_graficos ()
  {
    iniciarGraficos();
    StdDraw.clear(StdDraw.BLACK);
    StdDraw.setPenColor(StdDraw.GREEN);
    print(Hora.ahora());
    StdDraw.show();
    StdDraw.pause(1000);   
    print(Hora.ahora());
    StdDraw.show();
    StdDraw.pause(1000);   
  }
  public static void reloj ()
  {
    iniciarGraficos();
    while (true)
    {
      StdDraw.clear();
      print(Hora.ahora());
      StdDraw.show();
      StdDraw.pause(1000);
    }  
  }  
  public static void main (String[] args) 
  {
    // test_graficos();
    reloj();
  }
}
