package enun;


public class ComunidadPruebas2 {
	public static void main (String [] args) 
	{
		Comunidad a = new Comunidad();
		System.out.println(a.size());
		a.add(new Localidad("Ciudad A", 5000, 4500));
		a.add(new Localidad("Ciudad B", 5000, 4500));
		System.out.println(a.size());
		
		
		System.out.println(a.nombresLocalidades());
		
	}
}
