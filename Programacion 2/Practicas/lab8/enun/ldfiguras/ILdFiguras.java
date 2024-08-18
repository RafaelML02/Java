package lab8.enun.ldfiguras;

/** 
 * Lista de figuras geométricas.
 * 
 * @author PII
 */
import lab8.enun.figuras.*;
import tads.IList;
import java.awt.Color;

public interface ILdFiguras extends IList<IFigura>
{
  /**
   * Pinta las figuras de esta LdFiguras 
   * en el lienzo con color y relleno
   */ 
  public void pintar ();  
}