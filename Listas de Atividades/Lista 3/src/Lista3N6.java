package Lista3N;

public class Lista3N6 {
	
//	Questão 06: 
//	Ordenação crescente: Sua função deverá receber um vetor e retornar o
//	vetor ordenado em ordem crescente. Exemplo: [5, 2, 9, 1, 7] -> [1, 2, 5, 7, 9]
	
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
		

		
		
	
	
	public static void main(String[] args) {

		
		int[] teste1 = { 5, 4, 3, 2, 1 };
		int[] teste2 = ordenar(teste1);
		
	}
}