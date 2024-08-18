package lab9.enun.pila_int;

/**
 * Evaluacion de expresiones en notacion postfija
 *
 * PRE: Las expresiones en infija vienen siempre con paréntesis.
 *
 *  > java InfijaAPostfija
 *  ( 2 + 3 ) 
 *  <Ctrl-z>
 *  2 3 + 
 *
 *  > java InfijaAPostfija
 *  ( 2 + 3 ) * ( 4 + 5 ) 
 *  <Ctrl-z>
 *  2 3 + 4 5 + *  
 *
 *  > java InfijaAPostfija
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  <Ctrl-z>
 *  2 3 4 + 5 6 * * + 
 *
 *  > java InfijaAPostfija | java EvaluaPostfija
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  <Ctrl-d>
 *  212
 *
 *  Premisas
 *  ----------
 *  - No hay comprobación de errores - se supone que la entrada es una 
 *    expresión postfija correcta.
 *  - Todos los "tokens" deben estar separados con espacios, por ej. 
 *    1/2 1/5+ es incorrecto.
 */
import tads.*;
import stdlib.*;

public class InfijaAPostfija
{
  static boolean esOperador (String s){
    return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
  }
  /**
   * Chivato para ver el estado del programa.
   **/
  static void estado (IStack pila, String s, String result)
  {
    System.out.println("pila = " + pila);        
    System.out.println("s = " + s);
    System.out.println("result = " + result);     
    System.out.println();     
  }
  /**
   * POST: resultado es la expresión equivalente a la que se teclee
   *       en infija con paréntesis desde el input.
   *
   * Se puede quitar la llamada a `estado`.
   **/
  static String conversion () 
  {
    IStack<String> pila = new BoundedStack<String>();
    String result = "";
    while (!StdIn.isEmpty()) 
    {
      String s = StdIn.readString();
      if (esOperador(s))
      {
        pila.push(s);
        estado(pila, s, result);
      }
      else if (s.equals(")")) 
      {
        result +=  pila.peek() + " ";
        pila.pop();
        estado(pila, s, result);
      }
      else if (s.equals("(")) 
      {
        estado(pila, s, result);
      }
      else // esOperando(s)
      {
        result += s + " ";
        estado(pila, s, result);
      }
    }
    return result;
  }
  public static void main (String[] args)
  {
    System.out.println(conversion());
  }
}