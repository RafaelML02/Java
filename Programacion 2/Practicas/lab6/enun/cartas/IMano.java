package lab6.enun.cartas;
/**
 * Mano de cartas de un juego con la Baraja española (especificación).
 * 
 * @author PII
 */
public interface IMano
{
  /**
   POST: resultado es esta Mano convertida a texto.
   */
  public String toString ();
  /**
   Añade carta a esta mano (poniéndola al final). 
   */
  public void add (Carta carta);
  /**
   Quita de esta Mano la carta que está en pos. 
   */
  public void quitarCarta (int pos);
  /**
   POST: resultado es el número de cartas que hay en esta Mano.
   */
  public int size ();
  /**
   POST: resultado es la Carta que ocupa la posición pos en esta Mano.
   */
  public Carta carta (int pos);
} 
