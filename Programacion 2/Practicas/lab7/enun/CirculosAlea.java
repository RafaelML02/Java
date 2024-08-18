package lab7.enun;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import lab7.enun.Circulos.Node;
import stdlib.StdRandom;

public class CirculosAlea {
	static JPanel panel;
	static JFrame frame;
	
	static void iniciarGraficos() {
		frame = new JFrame("Círculos Aleatorios");
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        
        frame.add(panel);
        frame.setVisible(true);
	}
	
	static void pintarRelleno(Circulo c, Color color) {
		 Graphics g = panel.getGraphics();
		 g.setColor(color);
		 int x = (int) (c.x - c.radio);
		 int y = (int) (c.y - c.radio);
		 int diameter = (int) (2 * c.radio);
		 g.fillOval(x, y, diameter, diameter);
	}
	
	static Circulo circuloAlea(double r) {
		double randomx =StdRandom.uniformDouble(0,1000);
		double randomy =StdRandom.uniformDouble(0,1000);;
		return new Circulo(randomx, randomy,r);
		
	}
	
	static Color colorAlea() {
		int a = (int) StdRandom.uniformDouble(0,256);
        int b = (int) StdRandom.uniformDouble(0,256);
        int c = (int) StdRandom.uniformDouble(0,256);
        return new Color(a, b, c);
		
	}
	
	static void dibujarCirculos(int n, Color color) {
		 for (int i = 0; i < n; i++) {
			 Circulo c = circuloAlea(5);
			 pintarRelleno(c, color);
			 }
		 }
	
	static void dibujarCirculos(Circulos circulos, Color color) {
		for (int i = 0; i < circulos.size(); i++) {
			Circulo c = circulos.get(i);
			pintarRelleno(c,color);
		}
	}
	
	static void dibujarCirculos(int n) {
		for (int i = 0; i < n; i++) {
			Circulo c = circuloAlea(5);
			Color aux = colorAlea();
			pintarRelleno(c, aux);
		}
	}
	
	static void dibujarCirculos(Circulos circulos) {
		for (int i = 0; i < circulos.size(); i++) {
			Circulo c = circulos.get(i);
			Color aux = colorAlea();
			pintarRelleno(c,aux);
		}
	}
	
	static Circulos circulosGenerados(int n) {
		Circulos res = new Circulos();
		 for (int i = 0; i < n; i++) {
	            Circulo c = circuloAlea(10); 
	            res.addLast(c);
	        }
	        return res;
	        }
	
	static boolean esExternoATodos(Circulo c, Circulos circulos) {
		boolean res = true;
		Node<Circulo> aux = circulos.inicio;
		while(aux != null && res) {
			if(CirculoOps.intersectan(c, aux.element))
				res = false;
			aux = aux.next;
		}
		return res;
	}
	
	static Circulos circulosValidos(int n) {
		Circulos res = new Circulos();
	    int intentos = 0;
	    int exitos = 0;
	    
	    while(res.size() < n) {
	    	Circulo aux = circuloAlea(5); 
	    	intentos++;
	    	if (esExternoATodos(aux, res)) {
	    		res.addLast(aux);
	    		exitos++;	    	
	    }
	}
	    double porcentajedeexito =(double) exitos / intentos * 100;
	    
	    System.out.println("intentos = " + intentos);
	    System.out.println("exitos = " + exitos);
	    System.out.println("Porcentaje = " + porcentajedeexito);
	    return res;
}




}


