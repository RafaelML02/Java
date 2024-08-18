package Java.Concurrencia.JCSP;
import org.jcsp.lang.*;
public class ID {
  private static final int N = 10;
  static class Inc implements CSProcess {
    ChannelOutput co;
    public Inc(ChannelOutput co) {
      this.co = co;
    }
    public void run() {
      for (int i = 0; i < N; i++) {
        System.out.println("Enviando +1");
        co.write(1);
      }
    }
  }
  static class Dec implements CSProcess {
    ChannelOutput co;
    public Dec(ChannelOutput co) {
      this.co = co;
    }
    public void run() {
      for (int i = 0; i < N; i++) {
        System.out.println("Enviando -1");
        co.write(-1);
      }
    }
  }
  static class Contador implements CSProcess {
    ChannelInput ci;
    public Contador(ChannelInput ci) {
      this.ci = ci;
    }
    public void run() {
      int n = 0;
      while (true) {
         int x = (int) ci.read();
         n = n + x;
         System.out.println(n);
      }
    }
  }
  public static void main(String[] args) {
    Any2OneChannel c = Channel.any2one();
    CSProcess inc = new Inc(c.out());
    CSProcess dec = new Dec(c.out());
    CSProcess cont = new Contador(c.in());
    new Parallel(new CSProcess[]{inc, dec, cont}).run();
  }
}
