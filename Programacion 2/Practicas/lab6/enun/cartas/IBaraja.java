package lab6.enun.cartas;
/**
 * Baraja española (especificación).
 * 
 * @author PII
 */
public interface IBaraja
{
  /**
   POST: resultado es esta Baraja convertida a texto.
   */
  public String toString ();
  /**
   PRE: i in [0, size()-1]
   EFECTO: Pone boca abajo la carta de esta Baraja que está en la posición pos. 
   */
  public void ponerBocaAbajo (int pos);
  /**
   Baraja las cartas de esta Baraja. 
   */
  public void barajar ();
  /**
   POST: resultado se queda con n cartas de esta Baraja elegidas al azar.
   EFECTO LATERAL: Las cartas elegidas se quitan de la Baraja. 
   */
  public Mano repartoMano (int n);
  /**
   Quita de esta Baraja la carta que está en pos. 
   */
  public void quitarCarta (int pos);
  /**
   POST: resultado es el número de cartas que hay en esta Baraja.
   */
  public int size ();
  /**
   POST: resultado es la Carta que ocupa la posición pos en esta Baraja.
   */
  public Carta carta (int pos);
} 
