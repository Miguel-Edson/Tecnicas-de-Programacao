package Lista3N;


public class Lista3NN12 {
	
	private static boolean Verificar_Primo (int numero) {
		int contador = 1;
		int j = 2;
		while( j < numero) {
	        if (numero % j == 0) {
	        	contador++;  
	        	} else if (contador>1) {
	        			return false;
	        		}
	        j++;
	    }
		return true;
	}
		


	public static void main(String[] args) {
		
	
	int valor = 7;
	
	if (Verificar_Primo(valor)==true) {
		System.out.println("é primo");
		
	}else {
		System.out.println("não é primo");
	}
	

}
}