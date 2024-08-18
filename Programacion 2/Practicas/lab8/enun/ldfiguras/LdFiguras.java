package lab8.enun.ldfiguras;
/** 
 * Lista de figuras geométricas.
 * 
 * @author PII
 */
import lab8.enun.figuras.*;
import tads.ArrayList;

public class LdFiguras extends ArrayList<IFigura> implements ILdFiguras
{
  public void pintar (){
    for (int i=0; i<super.size(); i++)
      super.get(i).pintar();
  }
  
}