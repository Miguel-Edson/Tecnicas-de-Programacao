package Lista3N;


public class Lista3NN16 {
//	16)Verificação de número primo: Sua função deverá receber um número
//	inteiro e verificar se ele é um número primo. Exemplo: 7 -> True.
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
	// mesma situação da questão 12

}
}