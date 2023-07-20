package Lista3N;

public class Lista3N1 {
	
//	Questão 01: 
//	Somatório: Sua função deverá receber um vetor como parâmetro e retornar
//	a soma de todos elementos do vetor, sendo que as primeiras duas e as
//	últimas posições do vetor de entrada não devem ser consideradas;
	
	public static float soma(int[] valores) {
		int resultado = 0;
		int tamanho_array = valores.length;
		valores[tamanho_array-1] = 0;
		valores[tamanho_array-2]=0;
		valores[0]=0; 
		valores[1]=0;
		for (int cont = 0; cont < tamanho_array; cont++) {
			resultado += valores[cont];
		}
		
		return resultado;
	}
	public static void main(String[] args) {
	
		int[] Teste = {12, 5, 2, 6, 1, 1, 10 };
		
		System.out.println("Somatório dos valores B: " + soma(Teste));
		
	}
}