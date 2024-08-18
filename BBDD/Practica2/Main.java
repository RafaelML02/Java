package asociacioncervecera;
public class Main {
	public static void main (String[] args) {
	AsociacionCerveceraS3 x = new AsociacionCerveceraS3();
	
	x.openConnection("bd", "bdupm");
	x.closeConnection();
	x.getCervezasFabricante("Mahou");

	}

}