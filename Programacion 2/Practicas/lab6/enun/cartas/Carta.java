package lab6.enun.cartas;

/**
 * Carta de la baraja española.
 * 
 * @author PII
 */
public class Carta
{
  private String valor;  //valor de la carta
  private String palo;  //palo de la carta
  private boolean bocaArriba; //indica si la carta esta boca arriba o no
 
  public Carta (String valor, String palo)
  {
    this.valor = valor;
    this.palo = palo; 
    bocaArriba = true;
  }
  public String palo ()
  {
    return palo;
  } 
  public String valor ()
  {
    return valor;
  } 
  public boolean estaBocaArriba ()
  {
    return bocaArriba;
  } 
  public String toString ()
  {
    return valor + "De" + palo;
  } 
  public void darLaVuelta ()
  {
    bocaArriba = !bocaArriba;
  }
  public boolean equals (Object c) 
  {
    Carta carta = (Carta)c;
    return 
      valor.equals(carta.valor) && 
      palo.equals(carta.palo);
  }  

} 
  