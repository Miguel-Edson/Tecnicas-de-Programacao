package Lista3N;

public class Lista3N5 {
	
//	Questão 05: 
//	Cópia de vetor: Sua função deverá receber um vetor e retornar uma cópia
//	exata desse vetor.
	
	public static int [] copiar (int[] valores) {
		int tam= valores.length;
		int [] vetor_copia= new int [tam];

		for (int i = 0; i <= tam; i++) {
			vetor_copia[i] = valores[i];
		}
		
		return vetor_copia;
	}

	public static void main(String[] args) {
	
		int[] Teste1 = {12, 5, 2, 9, 1, 9}; //tamanho : 6
		
		int[] copiado = copiar (Teste1);
	


		
	}
}