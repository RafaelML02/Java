package clase;
import es.upm.babel.cclib.Semaphore;

public class semaforos {
	public static Semaphore s = new Semaphore(0);
	
	
	static class X extends Thread {
		public void run() {
		System.out.println("1");
		s.signal();
		System.out.println("2"); 
		}
	}
	static class Y extends Thread{
		public void run() {
			System.out.println("3");
			s.await();
			System.out.println("4");
			
		}
	}
	static class Z extends Thread{
		public void run() {
			System.out.println("5");
			System.out.println("6");
			
		}
	}
	
	public static void main(String args[]) {
		X x1 = new X();
		Y y1 = new Y();
		Z z1  =new Z();
		
		x1.start();
		y1.start();
		z1.start();
		}

}
