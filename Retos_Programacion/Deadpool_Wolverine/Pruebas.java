package Java.Retos_Programacion.Deadpool_Wolverine;

public class Pruebas {
    public static void main(String [] args){
        Personaje deadpool = new Personaje(500,0);
        Personaje wolverine = new Personaje(565,1);

        Batalla aux = new Batalla(deadpool, wolverine);
        aux.accion();



    }
    
}
