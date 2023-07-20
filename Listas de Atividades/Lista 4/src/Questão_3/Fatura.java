package Questão_3;

public class Fatura {
	
	private int numero_item_faturado;
	private String descricao;
	private int quantidade;
	private double preco;
//	private int preco_total;
	
	// Construtor
	public Fatura (int numero_item_faturado, String descricao, int quantidade, double preco ) {
		this.numero_item_faturado = numero_item_faturado;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	//Gets
	public int getItemFaturado() {
		return numero_item_faturado;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getQuantidade() {
			if (this.quantidade<0) {
				this.quantidade = 0;
			}
		return quantidade;
	}

	public double getpreco () {
			if (this.preco<0) {
				this.preco = 0.0;
			}
		return preco;
	}
	
	
	//Sets
	public void setItemFaturado(int numero_item_faturado) {
		this.numero_item_faturado=numero_item_faturado;
	}
	
	public void setDescricao(String descricao) {
		this.descricao=descricao;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade=quantidade;
	}
	
	public void setPreco(int preco) {
		this.preco=preco;
	}
	
	
	// Métodos
	public double ValorFatura() {
		double fatura = preco*quantidade;
		return fatura;
	}
	
	
	public double Desconto (int porcentagem) {
		double fatura = preco*quantidade;
		double descontado = fatura*porcentagem/100;
		return descontado;
	}
	
	
	
//	public int getValorFatura() {
//		return double preco = preco*quantidade;
//	}
//	
//		
//	public int getPreçoTotal() {
//		return double preco;
//	}
//
//
}
