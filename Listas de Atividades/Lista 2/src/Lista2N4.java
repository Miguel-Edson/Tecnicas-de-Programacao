package Lista2N;
import java.util.Scanner;

public class Lista2N4 {

	//	Questão 04: 
//	Escreva um programa que imprima a tabela de multiplicação de um
//	número específico fornecido pelo usuário usando um loop while.
	
	public static void main (String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int valor_do_usuario;
	int numerador = 0;
	int resultado;
	
	System.out.println("Informe qual o valor que deseja analisar a tabela de multiplicação");
	valor_do_usuario = scan.nextInt();
	
	
	while (numerador <= 10) {
		resultado = valor_do_usuario * numerador;
		System.out.println(numerador + "*" + valor_do_usuario + " = " + resultado );
		numerador ++;
		
	}
	scan.close();

	}
}