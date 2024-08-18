package lab8.enun.figuras;
/** 
 * Implementaci�n de una figura geom�trica en el plano 
 * especificada en IFigura.
 * 
 * @author PII
 */
import java.awt.Color;
import stdlib.StdRandom;

public abstract class Figura implements IFigura 
{
  private IPunto posicion;
  private Color color;
  private boolean rellena; 
  
  public Figura (IPunto posicion, Color color) 
  {
    this.posicion = posicion;
    this.color = color;
    rellena = true;
  }
  public static Color colorAlea () 
  {
    int rojo  = StdRandom.uniformInt(0, 255);
    int verde = StdRandom.uniformInt(0, 255);
    int azul  = StdRandom.uniformInt(0, 255);
    return new Color(rojo, verde, azul);
  }
  public Figura (IPunto posicion) 
  {
    this(posicion, colorAlea());
  }
  public IPunto posicion ()
  {
    return posicion;
  }  
  public Color color ()
  {
    return color;
  }
  public boolean rellena ()
  {
    return rellena;
  }
  public String toString ()
  {
    return "Figura(" + posicion.toString() + ")";
  }
  public boolean equals (Object o) 
  {
    if (! (o instanceof Figura))
      return false;
    else
    {
      Figura f = (Figura)o;
      return posicion.equals(f.posicion);
    }
  }
  public double distancia (IFigura f)
  {
    return posicion.distancia(f.posicion()); 
  }
  public void mover (double dx, double dy) 
  {
    posicion.mover(dx, dy);
  }
  public abstract double perimetro ();
  public abstract void pintar ();
}
