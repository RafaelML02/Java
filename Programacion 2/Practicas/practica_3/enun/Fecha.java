package practica_3.enun;
import java.util.Date;

public class Fecha {
	private int dia;
	private int mes;
	private int año;
	
	
	private static boolean esCorrecta(int dia, int mes, int año) {
	        return (mes >= 1 && mes <= 12) && 
	        		(dia >= 1 && dia <= diasDelMes(mes, año));
	    }

	    
	Fecha(int dia, int mes, int año){
		 if (!esCorrecta(dia, mes, año)) {
	            throw new IllegalArgumentException("Fecha no válida.");
	        }
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		
	}
	
	Fecha (String fecha){
		String[] x = fecha.split(":");
		dia = Integer.parseInt(x[0]);
		mes = Integer.parseInt(x[1]);
		año = Integer.parseInt(x[2]);
		
	}
	
	public String toString() {
	    return String.format("%02d/%02d/%04d", dia, mes, año);
	}
	
	public static Fecha hoy(){	
		Date fechaActual = new Date();
        
		int dia = fechaActual.getDate();
        int mes = fechaActual.getMonth() + 1; 
        int año = fechaActual.getYear() + 1900;

        return new Fecha(dia, mes, año);
	}
	
	
	public boolean equals(Object o) {
		Fecha aux = (Fecha) o;
		return this.dia == aux.dia && 
				this.mes == aux.mes && 
				this.año == aux.año;
    }
	
	public boolean esMenor(Fecha f) {
		return (this.año < f.año) ||
	      (this.año == f.año && this.mes < f.mes) ||
	      (this.año == f.año && this.mes == f.mes && this.dia < f.dia);
	}
	
	
	Fecha siguiente() {
        int nuevoDia = this.dia + 1;
        int nuevoMes = this.mes;
        int nuevoAño = this.año;
        if (nuevoDia > diasDelMes(nuevoMes, nuevoAño)) {
            nuevoDia = 1;
            nuevoMes++;
            if (nuevoMes > 12) {
                nuevoMes = 1;
                nuevoAño++;
            }
        }
        return new Fecha(nuevoDia, nuevoMes, nuevoAño);
    }
	
	
	Fecha suma(int n) {
		Fecha res = new Fecha(this.dia, this.mes, this.año);
		for(int i = 1; i<=n; i++) {
			res = res.siguiente();
		}
		return res;
	}
	
	int diferencia(Fecha f) {
		int res = 0;
		Fecha aux = new Fecha(this.dia, this.mes, this.año);
		if(this.esMenor(f)) {
			while(!aux.equals(f)){
				res++;
				aux = aux.siguiente();
				}}
		else {
			while(!f.equals(aux)){
				res++;
				f = f.siguiente();
			}}
		
		return res;
	}
	
	 private static boolean esBisiesto(int año) {
	        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
	    }
	 
	 private static int diasDeFebrero(int año) {
	        return esBisiesto(año) ? 29 : 28;
	    }
	 
	 private static int diasDelMes(int mes, int año) {
	        switch (mes) {
	            case 2:
	                return diasDeFebrero(año);
	            case 4: case 6: case 9: case 11:
	                return 30;
	            default:
	                return 31;
	        }
	    }


	

}


