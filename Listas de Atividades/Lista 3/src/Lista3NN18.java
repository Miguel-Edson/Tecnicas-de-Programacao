package Lista3N;


public class Lista3NN18{
//	18)Cálculo de juros compostos: Sua função deverá receber um valor inicial,
//	uma taxa de juros e um número de períodos. A função deve retornar o valor
//	final após a aplicação dos juros compostos. Exemplo: 1000, 0.05, 3 ->
//	1157.63
	public static double calcular_taxa(double capital, double taxa, double tempo) {
		double montante = capital;
		
		for(int i = 1; i <= tempo; i++) {
			montante *= 1 + taxa;
		}
		
		return montante;
	}
	
	public static void main(String[] args) {

		System.out.println("O valor apos o acrescimo dos juros compostos: " + calcular_taxa(500, 0.05, 3));
		
	}
}