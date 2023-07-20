package Lista2N;
import java.util.Scanner;

public class Lista2N5 {

	//	Questão 05:
//	Faça um programa que possa exibir uma sequência como a abaixo,
//	sendo o limite superior dos pares da esquerda e direita informados pelo
//	usuário. Exemplo: com pares da esquerda e direta com o limite superior
//	de 2 unidades.
	
	public static void main (String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int lado_esquerdo;
	int lado_direito;
	
	System.out.println("Qual o limite esquerdo?");
	lado_esquerdo = scan.nextInt();
	
	System.out.println("Qual o limite direito?");
	lado_direito = scan.nextInt();
	
	
	for (int contador_esquerdo=0; contador_esquerdo <= lado_esquerdo; contador_esquerdo++){
		
		for (int contador_direito=0; contador_direito <= lado_direito; contador_direito++){
			System.out.println (contador_esquerdo + " - " + contador_direito);
	}
	scan.close();

	}
	
}
}