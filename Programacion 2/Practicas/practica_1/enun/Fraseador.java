/** 

 * Fraseador
 
 * @author PII
 */
package practica_1.enun;
import java.awt.Desktop;
import java.net.URI;

public class Fraseador
{
  private String[] frases;
    
  public Fraseador (String archivo) 
  { 
    In f = new In(archivo);
    frases = f.readAllLines();
  }
  public String toString () 
  {  
    String resultado = new String("");
    for (int i=0; i<frases.length; i+=1)
      resultado += frases[i] + "\n"; 
    return resultado;
  }  
  public int longitud () 
  { 
    return frases.length;
  }
  public String fraseAleatoria ()
  {
    return frases[StdRandom.uniformInt(frases.length)];
  }
  public void escribirAleatoriaHTML () throws Exception 
  {  
    In htmlTemplate = new In("template.html");
    String htmlString = htmlTemplate.readAll();
    htmlTemplate.close();
    
    String title = "Fraseador";
    String body = "<h2>" + fraseAleatoria() + "</h2>";
    htmlString = htmlString.replace("$title", title);
    htmlString = htmlString.replace("$body", body);
    
    Out fraseHtml = new Out("frase.html");
    fraseHtml.print(htmlString);
    fraseHtml.close();
    
    URI uri = new URI("frase.html");
    Desktop.getDesktop().browse(uri);
  }  
  public void escribirTodasHTML () throws Exception 
  {  
	  In res = new In("template.html");
	  String htmlString = res.readAll();
	  res.close();

	  
	  String cuerpo = "";
	    for (String frase : frases) {
	    	cuerpo +=frase + "\n";
	    }
	  
	  String title = "Fraseador";
	  htmlString = htmlString.replace("$title", title);
	  htmlString = htmlString.replace("$body", cuerpo.toString());
	  
	  Out dochtml = new Out("todas.html");
	  dochtml.print(htmlString);
	  dochtml.close();

  }  
  
}