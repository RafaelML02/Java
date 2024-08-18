package lab9.enun.pila_fracciones;

import tads.*;
import stdlib.*;


public class EvaluaPostfija {
	static boolean esOperador (String s){
	    return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
	  }
	
	static void operar (String op, IStack<Fraccion> pila){
		Fraccion op1 = pila.peek();
	    pila.pop();
	    Fraccion op2 = pila.peek();
	    pila.pop();
	    
	    if (op.equals("+"))
	      pila.push(op1.suma(op2));
	    else if (op.equals("-"))
	      pila.push(op1.resta(op2));
	    else if (op.equals("*"))
	      pila.push(op1.producto(op2));
	    else
	      pila.push(op1.division(op2));
	}
	
	static Fraccion evaluacion () {
		IStack<Fraccion> pila = new BoundedStack<Fraccion>();
		while (!StdIn.isEmpty()) {
			String s = StdIn.readString();
			if (esOperador(s))
		        operar(s, pila);
			else
		        pila.push((new Fraccion(s)));
		    }
		    return pila.peek();
	}
	
	public static void main (String[] args){
	    System.out.println(evaluacion());
	  }

}
