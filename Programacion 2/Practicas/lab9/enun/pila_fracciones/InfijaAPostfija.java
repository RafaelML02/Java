package lab9.enun.pila_fracciones;

import tads.*;
import stdlib.*;

public class InfijaAPostfija {
    static int prioridad(String operador) {
        switch (operador) {
            case "+":
            case "-": return 1;
            case "*":
            case "/": return 2;
            default: return 0; 
                }
    }

    static boolean esOperador(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    static String conversion() {
        String res = "";
        IStack<String> pila = new BoundedStack<String>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (esOperador(s)) {
                while (!pila.isEmpty() && prioridad(pila.peek()) >= prioridad(s)) {
                    res += pila.peek() + " ";
                    pila.pop();
                }
                pila.push(s);
            } 
            else if (s.equals(")")) {
                
                while (!pila.isEmpty() && !pila.peek().equals("(")) {
                    res += pila.peek() + " ";
                    pila.pop();
                }
                pila.pop();
            } 
            else if (s.equals("(")) {
                pila.push(s);
            } 
            else {
                res += s + " ";
            }
        }
        while (!pila.isEmpty()) {
            res += pila.peek() + " ";
            pila.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(conversion());
    }
}
