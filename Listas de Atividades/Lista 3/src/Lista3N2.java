package Lista3N;

public class Lista3N2 {
	
//	Questão 02: 
//	 Média: Sua função deverá receber dois vetores como entrada e retornar a
//	média dos valores presentes nos vetores.	
	public static float media(int[] valores, int[]valores2) {
		int tam= valores.length + valores2.length;
		int [] vetor_resultante= new int [tam];
		int soma=0;
		float valor_media=0;
		
		System.arraycopy(valores, 0, vetor_resultante, 0, valores.length);
	    System.arraycopy(valores2, 0, vetor_resultante , valores.length, valores2.length);
		
//			 for (int i=0; i<tam; i++) {
//				 System.out.println ("agr o valor é" + vetor_resultante[i]);
//				 }
			 
			 for (int cont=0; cont<=tam-1; cont++) {
				
				soma = soma + vetor_resultante[cont];
				
//				System.out.println (valores[cont]);
//				System.out.println ("a soma é " + soma);
			 }
			 valor_media = soma / tam;
				return valor_media;
			 }
			


	public static void main(String[] args) {
	
		int[] Teste1 = {12, 5, 2, 9, 9, 9}; //tamanho : 6
		int[] Teste2 = {1,2,1, 3};             //tamanaho: 3
		
		System.out.println("A média é: " + media(Teste1, Teste2));
		
	}
}