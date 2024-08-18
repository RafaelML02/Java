package Entregas;

public class CC_01_Threads {
	private final static int N = 3;
	private final static int X = 1000;
	
	private static class Prueba extends Thread{
		public void run () {
			for(int i=0; i<N; i++) {
				System.out.println("Esta es la prueba número " + i);
				try {
					Thread.sleep(X);
					}
				catch(Exception e) {}
				System.out.println("Esta es la prueba número " + i);
			}// del for
		} // del run 
	}// del Prueba

	
	public static void main(String [] args){
		Thread inicial = new Prueba();
		inicial.start();
		try {
			inicial.join();
		}
		catch(Exception e) {
			
		}
		System.out.println("Todos los procesos han terminado");


}
}
