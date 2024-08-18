package lab8.enun.figuras;
/** 
 * @author PII
 */
public class Punto implements IPunto
{
  private double x;
  private double y; 
  
  public Punto (double x, double y) 
  {
    this.x = x;
    this.y = y;
  }
  public double x () 
  {
    return x;
  }  
  public double y () 
  {
    return y;
  }
  public String toString () 
  {
    return "(" + x + ", " + y + ")";
  }
  public boolean equals (Object o) 
  {
    if (! (o instanceof Punto))
      return false;
    else
    {
      Punto p = (Punto)o;
      return x==p.x && y==p.y;
    }
  } 
  public double distancia (IPunto p) 
  {
    double dx = x - p.x();
    double dy = y - p.y();
    return Math.sqrt(dx * dx + dy * dy); 
  }
  public void mover (double dx, double dy) 
  {
    x += dx;
    y += dy;
  }

}