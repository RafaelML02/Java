package lab9.enun.pila_fracciones;
/** 
 * TAD Fraccion 
 * Representa una fracción como num / den.
 *
 * @author PII
 */
class Fraccion
{
  private int num; // numerador
  private int den; // denominador
  /*
   * PRE: den /= 0 
   */
  Fraccion (int num, int den) 
  {
    this.num = num;
    this.den = den;
  }
  Fraccion (String texto)
  {
    String[] items = texto.split("/");
    num = Integer.parseInt(items[0]);
    den = Integer.parseInt(items[1]);
  }
  public String toString () 
  {
    return num + "/" + den;
  } 
  public boolean equals (Object o) 
  {
    Fraccion f = (Fraccion)o;
    return 
      num == f.num && 
      den == f.den ;
  }
  Fraccion suma (Fraccion f)
  { 
    int n = num * f.den + den * f.num;
    int d = den * f.den;
    return new Fraccion(n, d).sim();
  }
  Fraccion resta (Fraccion f)
  {  
    int n = num * f.den - den * f.num;
    int d = den * f.den;
    return new Fraccion(n, d).sim();
  }
  Fraccion producto (Fraccion f)
  {  
    int n = num * f.num;
    int d = den * f.den;
    return new Fraccion(n, d).sim();
  }
  Fraccion division (Fraccion f)
  {  
    int n = num * f.den;
    int d = den * f.num;
    return new Fraccion(n, d).sim();
  }
  Fraccion sim ()
  {  
    return new Fraccion(num / mcd(num, den), den / mcd(num, den));
  }
  static int mcd (int a, int b)
  {
    int i = Math.min(a, b);
    boolean encontrado = false;
    while (i >= 1 && !encontrado)
      if (a % i == 0 && b % i == 0)
        encontrado = true;
      else 
        i -= 1;
    return i;
  }
  int numerador ()
  {
    return num;
  }
  int denominador ()
  {
    return den;
  }
}