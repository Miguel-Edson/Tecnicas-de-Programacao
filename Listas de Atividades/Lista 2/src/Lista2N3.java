package Lista2N;
import java.util.Scanner;

public class Lista2N3 {

	//	Questão 03: 
//	Escreva um programa que peça ao usuário para adivinhar um número
//	entre 1 e 100. Se o usuário adivinhar incorretamente, o programa deve
//	dizer se o número a ser adivinhado é maior ou menor do que o número
//	digitado pelo usuário. O programa deve continuar a pedir ao usuário que
//	adivinhe até que ele adivinhe corretamente.
	
	public static void main (String[] args) {
		
	Scanner scan = new Scanner(System.in);
	float valor_do_usuario;
	double numero_aleatorio = Math.floor(Math.random() * 100);;
	
	System.out.println("Tente a sorte, chute um número entre 0 e 100: ");
	valor_do_usuario = scan.nextFloat();
	
	
	while (valor_do_usuario != numero_aleatorio) {
			if (valor_do_usuario < numero_aleatorio) {
				System.out.println("Boa tentativa, tente um numero maior:");
				} else {
					System.out.println("Boa tentativa, tente um numero menor:");
			}
		valor_do_usuario = scan.nextFloat();
	}

	System.out.println("Parabéns, você acertou!");
	scan.close();

	}
}