package lab6.enun.juego;

import lab6.enun.cartas.*;
/**
 * Especificación de operaciones sobre Carta y Mano de Carta(s) para el 
 * juego de las siete y media.
 * 
 * @author Galve
 */
public interface ISieteYMedia
{
  /**
   * POST: resultado es el valor en puntos de una carta según el juego de las
   *       siete y media: el as vale 1, el dos 2, hasta el 7 y 0.5 para las 
   *       figuras (sota, caballo y rey). 
   */
  public double puntos (Carta carta);
  /**
   * POST: resultado es la suma de los puntos de la <mano> según 
   *       el juego de cartas de las siete y media.
   */     
  public double puntos (IMano mano);
  /**
   * POST: Determina si <mano> tiene siete y media o no.
   */     
  public boolean esSieteYMedia (IMano mano);
  /**
   * POST: resultado es la carta de mayor valor de <mano> según 
           el juego de cartas de las siete y media.
   */     
  public Carta mayorCarta (IMano mano);
  /**
   * POST: Determina si las cartas de <mano> están ordenadas en 
   *       orden creciente del palo (oros, copas, espadas y bastos).
   */     
  public boolean estaOrdenada (IMano mano);
}

