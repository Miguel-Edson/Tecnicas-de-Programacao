package Main;
import Negócio.*;

public class Main {

	public static void main(String[] args) {
		Servidor servidor = new Servidor(1313);
		
		servidor.ouvir();
		
	}
	
}