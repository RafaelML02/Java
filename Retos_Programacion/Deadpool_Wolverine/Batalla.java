package Java.Retos_Programacion.Deadpool_Wolverine;

public class Batalla {
    Personaje a;
    Personaje b;

    public Batalla(Personaje a, Personaje b){
        this.a = a;
        this.b = b;
    }

    public int ataque1(Personaje deadpool, Personaje wolverine){
                int daño = deadpool.daño();
                int evita = wolverine.evasion();
                //NO EVITA EL ATAQUE               
                if(evita != 0){
                    int saludnueva = wolverine.salud() - daño;
                    wolverine.setsalud(saludnueva); 
                    System.out.println("Deadpool hace " + daño + " de daño");
                    System.out.println("Wolverine le quedan " + wolverine.salud() + " puntos de vida");
                }
                //EVITA EL ATAQUE
                else{
                    System.out.println("Wolverine evita el ataque de Deadpool");
                }
                if(daño == 100){return 1;}
                else{return 0;}
    }


    public int ataque2(Personaje deadpool, Personaje wolverine){
        int daño = wolverine.daño();
        int evita = deadpool.evasion();
        //NO EVITA EL ATAQUE               
        if(evita != 0){
            int saludnueva = deadpool.salud() - daño;
            deadpool.setsalud(saludnueva); 
            System.out.println("Wolverine hace " + daño + " de daño");
            System.out.println("Deadpool le quedan " + deadpool.salud() + " puntos de vida");
        }
        //EVITA EL ATAQUE
        else{
            System.out.println("Deadpool evita el ataque de Wolverine");
        }
        if(daño == 120){return 1;}
        else{return 0;}
    }


    public String resultado(Personaje a, Personaje b){
        if(a.salud()<=0){return "Wolverine ha ganado";}
        else{
            return "Deadpool ha ganado";
        }
    }



    public void accion(){
        System.out.println("Empieza el combate");
        int i;
        int turno;
        int bloqueo1=0;
        int bloqueo2 = 0;
        Personaje deadpool = this.a;
        Personaje wolverine= this.b;
        for(i = 0; deadpool.salud()>0 && wolverine.salud()>0 ; i++){
            System.out.println("Turno " + i);
             
             if(bloqueo1 == 0 && bloqueo2 == 0){
                turno = stdlib.StdRandom.uniformInt(2);
                if(turno == 0){
                    bloqueo1 = ataque1(deadpool, wolverine);
                    bloqueo2 = ataque2(deadpool, wolverine);
                 }
                 if(turno == 1){
                    bloqueo2 = ataque2(deadpool, wolverine);
                    bloqueo1 = ataque1(deadpool, wolverine);
                 }
             }

             else if(bloqueo1 != 0 && bloqueo2 == 0){
                bloqueo1 = ataque1(deadpool, wolverine);
             }

             else if(bloqueo1 == 0 && bloqueo2 != 0){
                bloqueo2 = ataque2(deadpool, wolverine);
             }
            }

            System.out.println(resultado(deadpool, wolverine));
        }
    }

    

