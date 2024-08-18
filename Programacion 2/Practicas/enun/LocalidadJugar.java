package enun;

public class LocalidadJugar {
	public static void main(String[] args) {
		
		Localidad ciudad = new Localidad("Ciudad A", 5000, 4500);
		//String 
        System.out.println(ciudad.toString());
        //int
        System.out.println("Población total: " + ciudad.poblacion());
        System.out.println("Nombre de la localidad: " + ciudad.nombre());
        //Booleanos
        System.out.println(ciudad.equals(new Localidad("Ciudad A", 5000, 4500)));
        System.out.println(ciudad.equals(new Localidad("Ciudad A", 5001, 4500)));
    }

}
