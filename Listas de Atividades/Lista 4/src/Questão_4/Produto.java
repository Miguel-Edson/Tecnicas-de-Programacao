package Questão_4;

public class Produto {
	private String nome;
	private	double preço;
	private int quantidade;
	static double preço_total=0;
	static String Produtos_comprados = "";
	static double Total_Venda=0;
	
	public Produto (String nome, double preço, int quantidade) {
		this.nome = nome;
		this.preço = preço;
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return this.nome;
	}

	public void Comprar_Produto(int quantos) {
		this.quantidade = this.quantidade-quantos;
		Produto.preço_total = this.preço*quantos;
		//Lista_de_Compras();
		Valor_Total(Produto.preço_total);
		Produtos_comprados = this.nome.concat("x"+ quantos +". "+Produtos_comprados);

	}

//	public void Lista_de_Compras() {
//		//Produtos_comprados = this.nome.concat("x"+ quantos +". "+Produtos_comprados);
//	}
	
	public void Valor_Total(double preço) {
		Total_Venda = preço + Total_Venda;
	}
	
	public static double Desconto () {
		double Valor_Desconto = Total_Venda;
		if (Total_Venda >=100 && Total_Venda<=200) {
			Valor_Desconto = Total_Venda * 0.9;
			return Valor_Desconto;
		}else if (Total_Venda >=200 && Total_Venda<=500) {
			Valor_Desconto = Total_Venda * 0.8;
			return Valor_Desconto;
		} if (Total_Venda>=500) {
			Valor_Desconto = Total_Venda * 0.75;
			return Valor_Desconto;
		}
		return Valor_Desconto;
	}
	
}

