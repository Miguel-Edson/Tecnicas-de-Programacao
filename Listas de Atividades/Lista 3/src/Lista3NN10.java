package Lista3N;

public class Lista3NN10 {
	
//	Questão 10: 
//	Verificação de igualdade: Sua função deverá receber dois vetores e verificar
//	se eles são iguais, ou seja, se possuem os mesmos elementos na mesma
//	ordem.
	

	public static boolean comparar(int[] valor1, int[] valor2) {
		int tam1 = valor1.length;
		
		for (int i = 0; i < tam1; i++) {
			if (valor1[i] == valor2[i]) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {

		
		int[] teste1 = { 5, 4, 3, 2, 1 };
		int[] teste2 = { 5, 4, 3, 2, 1 };

		
//		System.out.println(checar_ordem_crescente(teste1));
//		System.out.println(checar_ordem_crescente(teste2));
		System.out.println(comparar(teste1, teste2));
	}
}