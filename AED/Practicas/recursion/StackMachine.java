package aed.recursion;

import es.upm.aedlib.map.*;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.lifo.*;

public class StackMachine {
  Map<String, PositionList<Instruction>> code;
  LIFO<Integer> stack;
private Instruction instruction;

  public StackMachine(Map<String, PositionList<Instruction>> code) {
    this.stack = new LIFOArray<>();
    this.code = code;
  }

  public void run(String procedureName) {
    PositionList<Instruction> routine = code.get(procedureName);
    if (routine == null) {
      throw new RuntimeException("Rutina no encontrada: " + procedureName);
    }

    for (Instruction i : routine) {
    	instruction=i;
      System.out.println("Ejecutando " + i + " stack: " + stack);

      switch (i.getInstType()) {
        case ADD:
          int e1 = stack.pop();
          int e2 = stack.pop();
          stack.push(e1 + e2);
          break;
          
        case SUB:
        	int val1 = stack.pop();
            int val2 = stack.pop();
            int resultado = val2 - val1;
            if(resultado<0)
            	resultado = resultado*(-1);// Tomar el valor absoluto
            stack.push(resultado);
            break;

       
        case MULT:
            int num2 = stack.pop(); int num1 = stack.pop();
            stack.push(num1 * num2);
            break;
          
        case DUP:
            int valor = stack.top();
            stack.push(valor);
            break;
        
        case DROP:
            stack.pop();
            break;
          
        case SWAP:
            int cambio1 = stack.pop(); int cambio2 = stack.pop();
            stack.push(cambio1);
            stack.push(cambio2);
            break;
          
        case PUSH:
        	stack.push(instruction.getIntParm());
            break;
          
        case PRINT:
//        	int x = stack.top();
//            System.out.println(x);
//            break;
        	
        	if (!stack.isEmpty()) {
                int x = stack.pop(); 
                System.out.println(x);
            } else {
              
                System.out.println("vacio");
            }
            break;
          
          case EQ:
            int n2 = stack.pop();
            Integer n1 = stack.pop();
            stack.push(n1.equals(n2) ? 1 : 0);
            break;
          
          case CALL:
        	  run(instruction.getNameParm());
        	  break;
          
          case RET:
            return;
          
          case IF_SKIP:
              int condition = stack.pop();
              if (condition == 0) {
                  continue;
              }
              
              else {
            	  return;
            	  }
	default:

	       throw new IllegalArgumentException("Instrucción nula " + instruction.getInstType());
		// TODO Auto-generated method stub

      }
    }
  }
}