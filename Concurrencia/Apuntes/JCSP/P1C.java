package Java.Concurrencia.JCSP;

import org.jcsp.lang.*;

import es.upm.babel.cclib.Producto;
import es.upm.babel.cclib.Fabrica;
import es.upm.babel.cclib.Consumo;

public class P1C {
  private static final int N = 10;

  static class Prod implements CSProcess {
    ChannelOutput co;
    public Prod(ChannelOutput co) {
      this.co = co;
    }
    public void run() {
      for (int i = 0; i < N; i++) {
        Producto p = Fabrica.producir();
        co.write(p);
      }
    }
  }

  static class Cons implements CSProcess {
    ChannelInput ci;
    public Cons(ChannelInput ci) {
      this.ci = ci;
    }
    public void run() {
      for (int i = 0; i < N; i++) {
        Producto p = (Producto) ci.read();
        Consumo.consumir(p);
      }
    }
  }

  static class Buffer1 implements CSProcess {
    ChannelInput ci;
    ChannelOutput co;
    public Buffer1(ChannelInput ci, ChannelOutput co) {
      this.ci = ci;
      this.co = co;
    }
    public void run() {
      int n = 0;
      while (true) {
         Producto p = (Producto) ci.read();
         co.write(p);
      }
    }
  }

  public static void main(String[] args) {
    One2OneChannel pb = Channel.one2one();
    One2OneChannel bc = Channel.one2one();
    CSProcess p = new Prod(pb.out());
    CSProcess c = new Cons(bc.in());
    CSProcess b = new Buffer1(pb.in(), bc.out());
    new Parallel(new CSProcess[]{p, c, b}).run();
  }
}
