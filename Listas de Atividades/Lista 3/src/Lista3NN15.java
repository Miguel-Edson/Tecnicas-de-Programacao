package Lista3N;


public class Lista3NN15 {
//	15)Verificação de palíndromo: Sua função deverá receber uma string e
//	verificar se ela é um palíndromo, ou seja, se pode ser lida da mesma forma
//	de trás para frente. Exemplo: "ana" -> True.
	
	public static boolean teste_palindromo(String palavra) {
		char[] matriz_letras = palavra.toCharArray();
		int tam= matriz_letras.length;
		for (int i = 0, j = tam - 1; i < tam; i++, j--) {
			if (matriz_letras[i] != matriz_letras[j]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {

		String teste1= "carro";
		String teste2= "arara";
		String teste3= "uouou";
		System.out.println(teste_palindromo(teste1));
		System.out.println(teste_palindromo(teste2));
		System.out.println(teste_palindromo(teste3));
	}
}