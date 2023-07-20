package Lista2N;
import java.util.Scanner;


public class Lista2N8 {
//	Questão 08:
//	Escreva um programa que utilize uma estrutura para determinar se uma
//	expressão matemática contendo parênteses, colchetes e chaves está
//	bem formada (ou seja, se cada símbolo de abertura tem um símbolo de
//	fechamento correspondente).
	
	public static boolean Teste_validade(String expressao_matematica) {
        int parenteses = 0;
        int colchetes = 0;
        int chaves = 0;
        
        int tamanho_expressao = expressao_matematica.length(); 

        for (int i = 0; i < tamanho_expressao; i++) {
            char simbolo = expressao_matematica.charAt(i);

            if (simbolo == '(') {
                parenteses++;
            } else if (simbolo == ')') {
                parenteses--;
            } 
            
            
            if (simbolo == '[') {
                colchetes++;
            } else if (simbolo == ']') {
                colchetes--;
            } 
            

            if (simbolo == '{') {
                chaves++;
            } else if (simbolo == '}') {
                chaves--;
            }

            if (parenteses < 0 || colchetes < 0 || chaves < 0) {
                return false;
            }
        }

        return parenteses == 0 && colchetes == 0 && chaves == 0;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String expressao = scan.nextLine();
        
        if (Teste_validade(expressao) == true) {
        System.out.println(expressao + " é verdadeira");
        } else {
        	 System.out.println(expressao + " está incorreta");
        }
        scan.close();
	}
}
