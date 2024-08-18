package practica_1.enun;
/** 
 * Pruebas del fraseador.
 * @author PII
 */
public class FraseadorJugar
{
  public static void main (String[] args) throws Exception
  {   
    // 1 - Crear el fraseador:
    Fraseador fraseador = new Fraseador("files\\tus_frases.txt");    
    // 2 - Escribir todas las frases:
     System.out.println(fraseador);    
    // 3 - Escribir una frase aleatoria:
     System.out.println(fraseador.fraseAleatoria());
    // 4 - Escribir una frase aleatoria en web:
    fraseador.escribirAleatoriaHTML();
    fraseador.escribirTodasHTML();
  } 
  
}