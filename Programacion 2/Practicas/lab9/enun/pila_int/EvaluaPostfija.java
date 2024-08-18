package lab9.enun.pila_int;
/**
 * Evaluacion de expresiones en notacion postfija
 *
 *  > java EvaluaPostfija
 *  3 4 5 + *
 *  <Ctrl-z>
 *  27
 *
 *  > java EvaluaPostfija
 *  1 2 3 4 5 * + 6 * * +
 *  <Ctrl-z>
 *  277
 *
 *  > java EvaluaPostfija
 *  7 16 16 16 * * * 5 16 16 * * 3 16 * 1 + + +
 *  <Ctrl-z>
 *  30001
 *  
 *  > java EvaluaPostfija
 *  7 16 * 5 + 16 * 3 + 16 * 1 +
 *  <Ctrl-z>
 *  30001
 *
 *  > java EvaluaPostfija
 *  2 3 4 + 5 6 * * + 
 *  <Ctrl-z>
 *  212
 *
 *  Premisas
 *  ----------
 *  - No hay comprobación de errores - se supone que la entrada es una 
 *    expresión postfija correcta.
 *  - Todos los "tokens" deben estar separados con espacios, por ej. 
 *    1/2 1/5+ es incorrecto.
 *
 *  > java InfijaAPostfija | java EvaluaPostfija
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  <Ctrl-z>
 *  212
 */
import tads.*;
import stdlib.*;

public class EvaluaPostfija
{

  static boolean esOperador (String s)
  {
    return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
  }
  static void operar (String op, IStack<Integer> pila)
  {
    int op1 = pila.peek();
    pila.pop();
    int op2 = pila.peek();
    pila.pop();
    if (op.equals("+"))
      pila.push(op1 + op2);
    else if (op.equals("-"))
      pila.push(op1 - op2);
    else if (op.equals("*"))
      pila.push(op1 * op2);
    else
      pila.push(op1 / op2);
  }
  static int evaluacion () 
  {
    IStack<Integer> pila = new BoundedStack<Integer>();
    String result = "";
    while (!StdIn.isEmpty()) 
    {
      String s = StdIn.readString();
      if (esOperador(s))
        operar(s, pila);
      else //esOperando(s) 
        pila.push(Integer.parseInt(s));
    }
    return pila.peek();
  }
  public static void main (String[] args)
  {
    System.out.println(evaluacion());
  }
}