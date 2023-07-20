package Questão_4;

public class Teste {
	public static void main (String[] args) {
		
		Produto Bacia= new Produto ("Bacia", 2.00 , 2);
		Produto Vassoura= new Produto ("Vassoura", 400 , 5);
		Produto Rodo= new Produto ("Rodo", 3.00 , 5);
		
		
		Bacia.Comprar_Produto(2);
		
		Vassoura.Comprar_Produto(1);
		
		Rodo.Comprar_Produto(3);
		
		
		System.out.println("Lista de Compras: "+ Produto.Produtos_comprados);
		//System.out.println("Valor Total da Compra: " +Produto.Total_Venda);
	
		System.out.printf("O valor Final da Compra é: R$%.2f", Produto.Desconto ());

	}
}
