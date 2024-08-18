package lab6.enun.juego;

import lab6.enun.cartas.*;

public class SieteYMediaTest
{
  static Carta as_de_oros = new Carta("As", "Oros");
  static Carta cuatro_de_bastos = new Carta("Cuatro", "Bastos");
  static Carta sota_de_copas = new Carta("Sota", "Copas");
  static Carta tres_de_espadas = new Carta("Tres", "Espadas");
  static IMano mano_0, mano_2, mano_4;
  static ISieteYMedia sym = new SieteYMedia();

  static void resetear () 
  { 
    mano_0 = new Mano();
    //
    mano_2 = new Mano();
    mano_2.add(as_de_oros);
    mano_2.add(cuatro_de_bastos);
    //
    mano_4 = new Mano();
    mano_4.add(as_de_oros);
    mano_4.add(cuatro_de_bastos);
    mano_4.add(sota_de_copas);
    mano_4.add(tres_de_espadas);
  }
  static void mostrar () 
  { 
    resetear();
    System.out.println("mano_0 = " + mano_0);
    System.out.println("mano_2 = " + mano_2);
    System.out.println("mano_4 = " + mano_4);
  }
  static boolean puntosCartaTest () 
  {
    resetear();  
    boolean resultado =
         sym.puntos(as_de_oros) == 1 &&
         sym.puntos(cuatro_de_bastos) == 4 &&
         sym.puntos(sota_de_copas) == 0.5 &&
         sym.puntos(tres_de_espadas) == 3 ;
    return resultado; 
  }
  static boolean puntosTest () 
  {
    resetear();  
    boolean resultado =
         sym.puntos(mano_0) == 0 &&
         sym.puntos(mano_2) == 5 &&
         sym.puntos(mano_4) == 8.5 ;
    return resultado; 
  }
  static boolean esSieteYMediaTest () 
  {
    resetear();  
    boolean resultado =
         sym.esSieteYMedia(mano_0) == false &&
         sym.esSieteYMedia(mano_2) == false &&
         sym.esSieteYMedia(mano_4) == false ;
    return resultado; 
  }
  static boolean mayorCartaTest () 
  {
    resetear();  
    boolean resultado =
         sym.mayorCarta(mano_2).equals(cuatro_de_bastos) &&
         sym.mayorCarta(mano_4).equals(cuatro_de_bastos);
    return resultado; 
  }
  static boolean estaOrdenadaTest () 
  {
    resetear();  
    boolean resultado =
         sym.estaOrdenada(mano_0) == true &&
         sym.estaOrdenada(mano_2) == true &&
         sym.estaOrdenada(mano_4) == false ;
    return resultado; 
  }
  public static void main (String[] args) 
  {
    resetear();
    mostrar();
    System.out.println("puntosCartaTest() = " + puntosCartaTest());
    System.out.println("puntosTest() = " + puntosTest());
    System.out.println("esSieteYMediaTest() = " + esSieteYMediaTest());
    System.out.println("mayorCartaTest() = " + mayorCartaTest());
    System.out.println("estaOrdenadaTest() = " + estaOrdenadaTest());
  }
} 
