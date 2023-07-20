package Lista3N;

public class Lista3N3 {
	
//	Questão 03: 
//	 Média ponderada: Sua função deverá receber um vetor de notas e um vetor
//	de pesos correspondentes. A função deve retornar a média ponderada das
//	notas. Exemplo: [7, 8, 6], [2, 3, 1] -> 7.33
	
	public static float mediap(int[] valores, int[]valores2) {
		int tam= valores.length;
		int soma_peso=0;
		float valor_mediap=0;
		
		
//				 System.out.println ("agr o valor é" + vetor_resultante[i]);
//				 }
			 
			 for (int cont=0; cont<=tam-1; cont++) {
				
				soma_peso = soma_peso +(valores[cont]*valores2[cont]);
				
//				System.out.println (valores[cont]);
//				System.out.println ("a soma é " + soma);
			 }
			 valor_mediap = soma_peso / tam;
				return valor_mediap;
			 }
			


	public static void main(String[] args) {
	
		int[] Teste1 = {6, 8, 4, 6};             //tamanho : 6
		int[] Peso = {1,2, 1, 3};             //tamanho: 3
		
		System.out.println("A média é: " + mediap(Teste1, Peso));
		
	}
}