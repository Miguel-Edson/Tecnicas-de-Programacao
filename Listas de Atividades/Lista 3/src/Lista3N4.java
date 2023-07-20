package Lista3N;

public class Lista3N4 {
	
//	Questão 04: 
//	 Contagem de elementos: Sua função deverá receber dois vetores e um
//	elemento a ser contado. A função deve retornar a quantidade de vezes que
//	esse elemento aparece nos vetores. Exemplo: [1,3, 3, 2, 5],[1, 2, 3, 2, 4],
//	2 -> 3	
	public static int repeticao(int e, int[] valores, int[]valores2) {
		int tam= valores.length + valores2.length;
		int [] vetor_resultante= new int [tam];
		int repetiu=0;
		
		System.arraycopy(valores, 0, vetor_resultante, 0, valores.length);
	    System.arraycopy(valores2, 0, vetor_resultante , valores.length, valores2.length);
		

			 
	    for(int i = 0; i < tam; i++) {
			if (e == vetor_resultante[i]) {
				repetiu++;
			}
		}
				return repetiu;
			 }
			


	public static void main(String[] args) {
	
		int[] Teste1 = {12, 5, 2, 9, 1, 9}; //tamanho : 6
		int[] Teste2 = {1,2,1, 3};             //tamanaho: 3
		int elemento = 1;
		
		System.out.println("O valor repetiu: " + repeticao(elemento, Teste1, Teste2) +" vezes.");
		
	}
}