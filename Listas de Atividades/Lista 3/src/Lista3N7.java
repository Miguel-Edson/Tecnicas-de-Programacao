package Lista3N;

public class Lista3N7 {
	
//	Questão 07: 
//	K-ésimo maior valor: Sua função deverá receber um vetor e um K e retornar
//	o K-ésimo maior valor presente no vetor.
	
	

	public static boolean checar_ordem_crescente(int [] valores) {
		boolean indicador = true;
		int tam = valores.length;
		
		for(int i = 0; i < tam-1; i++) {
			if (valores[i]>valores[i+1]) {
				indicador = false;
			}
		}
		return indicador;
		
		
	}
	
	public static void main(String[] args) {

		
		int[] teste1 = { 5, 4, 3, 2, 1 };
		int[] teste2 = { 1, 2, 3, 4, 5};
		
		System.out.println(checar_ordem_crescente(teste1));
		System.out.println(checar_ordem_crescente(teste2));
	}
}