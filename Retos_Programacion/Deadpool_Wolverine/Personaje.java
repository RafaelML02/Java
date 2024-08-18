package Java.Retos_Programacion.Deadpool_Wolverine;

public class Personaje{
    private int salud;
    private int id;

    public Personaje(int salud, int id){
        this.salud = salud;
        this.id = id;
    }

    public int salud(){
        return this.salud;
    }
    public void setsalud (int saludnueva){
        this.salud = saludnueva;
    }

    public int daño(){
        if(this.id == 0)
            return stdlib.StdRandom.uniformInt(10,101);
        return stdlib.StdRandom.uniformInt(10, 121);
    }

    public int evasion(){
        if(this.id == 0)
            return stdlib.StdRandom.uniformInt(0,4);
        return stdlib.StdRandom.uniformInt(0, 5);
    }


}
