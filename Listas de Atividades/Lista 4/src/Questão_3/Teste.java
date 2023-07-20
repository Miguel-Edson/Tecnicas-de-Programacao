package Questão_3;

public class Teste {

	public static void main(String[] args) {
		Fatura Fatura_Teste = new Fatura(123312, "pono de prato", 2, 4);
		
//		Fatura_Teste.Fatura();
		
		System.out.println("Valor da Fatura: \n" + Fatura_Teste.ValorFatura());
		
		System.out.println("Valor com desconto \n" + Fatura_Teste.Desconto(50));
	}

}