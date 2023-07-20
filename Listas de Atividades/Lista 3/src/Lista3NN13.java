package Lista3N;
import java.util.Arrays;

public class Lista3NN13 {
//	13) Busca por ocorrências: Sua função deverá receber dois vetores e deverá
//	retornar um novo vetor com todos os elementos que aparecem em ambos os
//	vetores.
	private static int [] elementos_repetidos (int[] valores1, int [] valores2) {
		int repetido = 0;
		int tam=0;
		
		if (valores1.length > valores2.length) {
			tam = valores1.length;
		} else {
			tam = valores2.length;
		}
		
		int[] resultado = new int[tam];
				
				for (int i = 0; i < valores1.length; i++) {
					for (int j = 0; j < valores2.length; j++) {
						if (valores1[i] == valores2[j]) {
							System.out.println(valores1[i]);
							resultado[repetido] = valores1[i];
							
							repetido++;
						}
					}
				}
				for (int p=0; p<10; p++) {
					System.out.println(resultado[p]);
				}
			return resultado;	
			}
		


	public static void main(String[] args) {
		
	
		int[] teste1 = { 5, 4, 3, 2, 1 };
		int[] teste2 = { 2, 2, 1, 9, 0 };
	
		System.out.println (Arrays.toString(elementos_repetidos (teste1, teste2)));
		
}
}