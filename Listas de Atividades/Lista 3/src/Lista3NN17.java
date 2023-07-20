package Lista3N;


public class Lista3NN17{
//	17)Inversão de string: Sua função deverá receber uma string e retornar a
//	mesma string invertida. Exemplo: "hello" -> "olleh".
	
	public static String inverter(String palavra) {
		char[] matriz_letras = palavra.toCharArray();
		int tam= matriz_letras.length;
		char[] palavra_invertida = new char[matriz_letras.length];
		
		for (int i = 0, j = tam - 1; i < tam; i++, j--) {
			palavra_invertida[i] = matriz_letras[j];
			}
		return new String(palavra_invertida);
		}
	
		
		

	
	public static void main(String[] args) {

		String teste1= "carro";
		String teste2= "arara";
		String teste3= "uouou";
		System.out.println(inverter(teste1));
		System.out.println(inverter(teste2));
		System.out.println(inverter(teste3));
	}
}