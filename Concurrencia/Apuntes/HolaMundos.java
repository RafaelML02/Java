package clase;

public class HolaMundos {
	private static class HolaMundo extends Thread{
		public HolaMundo() {
			
		}
		public void run () {
			System.out.println("Hola Mundo");
		}
	}
	
	public static void main(String []args) {
		HolaMundo hola1 = new HolaMundo();
		HolaMundo hola2 = new HolaMundo();
		
		hola1.start();
		hola2.start();
//		hola1.join();
//		hola2.join();
		
		System.out.println("Hola, soy el main");
	}

}
