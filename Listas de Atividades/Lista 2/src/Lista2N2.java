package Lista2N;
import java.util.Scanner;

public class Lista2N2 {

	//	Questão 02: 
//	Escreva um programa que leia uma sequência de números do usuário e
//	pare a leitura quando o usuário digitar um número negativo. Em seguida,
//	o programa deve imprimir a soma dos números positivos lidos.
	
	public static void main (String[] args) {
	
	Scanner scan = new Scanner(System.in);
	float valor_recebido;
	float total = 0;
	
	System.out.println("Digite um valor: ");
	valor_recebido = scan.nextFloat();
	
	
	while (valor_recebido >= 0) {
		total += valor_recebido;
		System.out.println("Digite outro valor a sem somado: ");
		valor_recebido = scan.nextFloat();
	}
	scan.close();
	
	System.out.println(total);
	}
	
}