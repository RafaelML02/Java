package lab8.enun.ldfiguras;
/** 
 * Figuras geométricas en movimiento.
 * 
 * @author PII
 */
import lab8.enun.figuras.*;
import lab8.enun.pruebas.LdFigurasJugar;
import stdlib.StdDraw;
import stdlib.StdRandom;

public class FigurasMovimiento{
  public static final int MAX = 600;
  public static final int ESCALA = 300;
  public static final double GROSORPINCEL = 0.01;
  
  public static void crearFiguras(ILdFiguras x) {
	  x.add(new Dot(new Punto(-150, 150))); 
	  x.add(new Dot(new Punto(-150, -150))); 
	  x.add(new Circulo(new Punto(100, -200), 20)); 
	  x.add(new Circulo(new Punto(-40, -80), 30));
	  x.add(new Rectangulo(new Punto(50, 100), 20, 10));   
	  x.add(new Rectangulo(new Punto(150, -150), 25, 50)); 
	  x.add(new Poligono(LdFigurasJugar.array3()));
	  x.add(new Poligono(LdFigurasJugar.array5()));    
  }
  public static void iniciarGraficos () 
  {  
    StdDraw.setCanvasSize(MAX, MAX);
    StdDraw.clear(StdDraw.BLACK);
    StdDraw.setScale(-ESCALA, ESCALA);
    StdDraw.setPenRadius(GROSORPINCEL);
    StdDraw.setPenColor(StdDraw.RED);
  }  
  public static void iniciarAnimacion () {  
    iniciarGraficos();
    StdDraw.enableDoubleBuffering();
  }      
  public static void caer (IFigura f, double dy)
  {
    f.mover(0, -dy);  
  }
  public static void caer (ILdFiguras ldf, double dy)
  {
    for (int i = 0; i < ldf.size(); i++)
      caer(ldf.get(i), dy);
  }
  public static void figuraCaer () 
  {
    iniciarAnimacion();    

    IFigura pentagono = new Poligono(LdFigurasJugar.array5());
    while (true){
      StdDraw.clear(StdDraw.BLACK);
      pentagono.pintar();
      caer(pentagono, 10);
      StdDraw.show();
      StdDraw.pause(500);
    }
  }
  public static void ldFigurasCaer (){ 
    iniciarAnimacion();    

    IFigura d1 = new Dot(new Punto(-150, 150));
    IFigura d2 = new Dot(new Punto(-150, -150));    
    IFigura c1 = new Circulo(new Punto(100, -200), 20);
    IFigura c2 = new Circulo(new Punto(-40, -80), 30);
    IFigura r1 = new Rectangulo(new Punto(50, 100), 20, 10);
    IFigura r2 = new Rectangulo(new Punto(150, -150), 25, 50);
    IFigura triangulo = new Poligono(LdFigurasJugar.array3());
    IFigura pentagono = new Poligono(LdFigurasJugar.array5());

    ILdFiguras ldf5 = new LdFiguras();
    ldf5.add(c1); 
    ldf5.add(r1); 
    ldf5.add(d1); 
    ldf5.add(c2);
    ldf5.add(r2);   
    ldf5.add(d2); 
    ldf5.add(triangulo);
    ldf5.add(pentagono);    
    while (true)
    {
      StdDraw.clear(StdDraw.BLACK);
      ldf5.pintar();
      caer(ldf5, 10);
      StdDraw.show();
      StdDraw.pause(500);
    }
  }
  public static void moverAlea (IFigura f){
	  double x = StdRandom.uniformDouble(-MAX,MAX);
	  double y = StdRandom.uniformDouble(-MAX,MAX);
	  f.mover(x,y);

  }
  public static void moverAlea (ILdFiguras ldf){
	  for(int i = 0; i<ldf.size(); i++) {
		  double x = StdRandom.uniformDouble(-MAX,MAX);
		  double y = StdRandom.uniformDouble(-MAX,MAX);
		  ldf.get(i).mover(x, y);
	  }
  }
  
  public static void figuraMoverAlea () {
	   iniciarAnimacion();
	   
	   ILdFiguras aux = new LdFiguras();
	   crearFiguras(aux);
	   
	   int cursor = (int) StdRandom.uniformDouble(0,aux.size());
	   moverAlea(aux.get(cursor));
  }
  
  public static void ldFigurasMoverAlea () { 
	  iniciarAnimacion();
	  ILdFiguras aux = new LdFiguras();
	  crearFiguras(aux);
	  
	  ILdFiguras aux1 = new LdFiguras();
	  for(int i = 0; i<(int)StdRandom.uniformDouble(1, aux.size());i++){
		  aux1.add(aux.get((int)StdRandom.uniformDouble(0, aux.size())));; 
	  }
	  moverAlea(aux1);
  }
  
  public static void main (String args[]){     
     figuraCaer();
     ldFigurasCaer();
     figuraMoverAlea();
     ldFigurasMoverAlea();
  }  
}