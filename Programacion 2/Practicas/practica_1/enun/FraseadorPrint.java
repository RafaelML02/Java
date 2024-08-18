package practica_1.enun;

public class FraseadorPrint {
	public void printfFraseador(String file) {
		Fraseador res = new Fraseador(file);
		System.out.println(res.toString());
	}
	
	public void printFraseAleatoria(String file){
		Fraseador res = new Fraseador(file);
		System.out.println(res.fraseAleatoria());
	}
	
	public void escribirAleatoriaHTML (String file) throws Exception{
		Fraseador res = new Fraseador(file);
		res.escribirAleatoriaHTML();
	}
	
	public void escribirTodasHTML (String file) throws Exception{
		Fraseador res = new Fraseador(file);
		res.escribirTodasHTML();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
