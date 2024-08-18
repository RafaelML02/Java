package hl;

public class Orientacion {
	private int rumbo;
    private static final int[][] unitarios = { { 0, +1 }, { +1, 0 }, { 0,-1 }, {-1, 0 } };

    private Orientacion(int rumbo) {
        this.rumbo = rumbo;
    }
    
    public static Orientacion orientacionAux(int rumbo) {
        return new Orientacion(rumbo);
    }

    public int rumboaux() {
    	return rumbo;
    }
   
    public Orientacion girarMediaVuelta() {
    	return new Orientacion((rumbo + 2) % 4);
    }

    public Orientacion girarIzquierda() {
    	int res = rumbo - 1;
    	if(res<0) 
    		res = 3;
    	return new Orientacion(res);
    }

    public Orientacion girarDerecha() {
    	int res = rumbo + 1;
    	if(res>3) 
    		res = 0;
    	return new Orientacion(res);
    }

    public void mover(IHormiga h) {
    	 int X = unitarios[rumbo][0];
         int Y = unitarios[rumbo][1];
         h.mover(X, Y);
    }

    public int getAnguloEnGrados() {
    	switch (rumbo) {
    	case 0 : return 0;
    	case 1 : return 270;
    	case 2 : return 180;
    	case 3 : return 90;
    	default : return 0;
    	}
    }

    public static final Orientacion IZQUIERDA = new Orientacion(3);


}
