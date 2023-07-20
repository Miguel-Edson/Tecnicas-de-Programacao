package Lista2N;

import java.util.Scanner;

public class Lista2N7 {
	
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
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Informe o valor: ");
	int valor = scan.nextInt()-1;
	
		while (Verificar_Primo(valor)) {
		valor--;
	}
	
	System.out.println("Número primo que é menor do que o numero informado: " + valor);
	
	scan.close();
}
}