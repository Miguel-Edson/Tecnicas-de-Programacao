package Lista3N;

public class Lista3NN11 {
	
//	Questão 11: 
//	Potenciação: Sua função deverá receber dois números, a base e o
//	expoente, e retornar a potência da base elevada ao expoente.
	

	public static int potencia(int base, int expoente) {
		int resultado = 0;
		
		if (expoente == 0) {
			resultado = 1;
		}
		
		for (int i = 1; i <= expoente; i++) {
			
			resultado = base*potencia(base, expoente-1);
		}
		return resultado;
	}
	public static void main(String[] args) {

		
		int base = 5;
		int expoente = 3;
		System.out.println(potencia(base, expoente));
	}
	
}