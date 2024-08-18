package lab7.enun;

public class Circulo {
	double x,y, radio;
	
	public Circulo(double x0, double y0, double radio0) {
		this.x = x0;
		this.y = y0;
		this.radio = radio0;
	}
	
	public String toString() {
		return "El circulo con centro en " + this.x + ", " 
	+ this.y + " y con un radio de " + this.radio;
		
	}
	
	void mover(float dx, float dy) {
		this.x += dx;
		this.y += dy;
	}
	
	double distancia(Circulo otro) {
		double distanciax = this.x - otro.x;
		double distanciay = this.y - otro.y;
		return Math.sqrt(distanciax * distanciax + 
				distanciay * distanciay);
	}
	
	double radio() {
		return this.radio;
	}
	
	Punto centro() {
		return new Punto(this.x, this.y);
	}
	
	boolean equals(Circulo otro) {
		return this.x == otro.x &&
				this.y == otro.y &&
				this.radio == otro.radio;
		
	}
}
