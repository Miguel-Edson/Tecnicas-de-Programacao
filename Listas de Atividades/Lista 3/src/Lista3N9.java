package Lista3N;

public class Lista3N9 {
	
//	Questão 09: 
//	K-ésimo menor valor: Sua função deverá receber um vetor e um K e
	//retornar o K-ésimo menor valor presente no vetor.
	
	

	public static void troca(int[] valores, int troca_1, int troca_2) {
		int aux = valores[troca_1];
		valores[troca_1] = valores[troca_2];
		valores[troca_2] = aux;
		
	}
	
	public static int[] ordenar(int [] valores) {
		int[] valor_copia = valores.clone(); // cópia

		int tam = valores.length;
		
		for(int i = 0; i < tam; i++) {
		for(int c = 0; c < tam - i - 1; c++) {
		if(valor_copia[c] > valor_copia[c + 1]) {
		troca(valor_copia, c, c + 1);
		}
		}
		}
		
		return valor_copia;
	}
	
	public static int K_esimo_menor (int k , int[] valores) {
		int k_esimo = 0;
		
			int[] teste_ordenado = ordenar(valores);
			
			k_esimo = teste_ordenado[k-1];
			return k_esimo;
	}
	
	public static void main(String[] args) {

		
		int[] teste1 = { 5, 4, 3, 2, 1 };

		
//		System.out.println(checar_ordem_crescente(teste1));
//		System.out.println(checar_ordem_crescente(teste2));
		System.out.println(K_esimo_menor(3, teste1));
	}
}