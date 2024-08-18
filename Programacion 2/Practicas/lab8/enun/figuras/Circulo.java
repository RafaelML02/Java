package lab8.enun.figuras;
/**
 * Circulo.
 * Representa un círculo formado por un centro y un radio.
 * Circulo hereda de Figura:
 *   - El centro de Circulo está representado
 *     por la posicion de Figura.  
 * 
 * @author PII
 */
import java.awt.Color;
import stdlib.StdDraw;

public class Circulo extends Figura
{
  private int radio;
  
  public Circulo (Punto centro, int radio, Color color) 
  {
    super(centro, color);
    this.radio = radio;
  }
  public Circulo (Punto centro, int radio) 
  {
    super(centro);
    this.radio = radio;
  }
  public int radio ()
  {
    return radio;
  }
  @Override
  public String toString ()
  {
    return new String("Circulo(" + super.toString() + 
                      ", " + this.radio + ")");
  }
  @Override
  public boolean equals (Object o) 
  {
    if (! (o instanceof Circulo))
      return false;
    else
    {
      Circulo c = (Circulo)o;
      return 
        super.equals(c) &&
        radio==c.radio;
    }
  }
  public double perimetro ()
  {
    return 2*radio*Math.PI; 
  }
  public void pintar ()
  {
    StdDraw.setPenColor(color());
    if (rellena())
      StdDraw.filledCircle(super.posicion().x(), super.posicion().y(), radio);
    else
      StdDraw.circle(super.posicion().x(), super.posicion().y(), radio());
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.point(super.posicion().x(), super.posicion().y());
  }    
}