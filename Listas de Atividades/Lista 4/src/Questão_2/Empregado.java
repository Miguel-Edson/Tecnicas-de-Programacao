package Questão_2;

public class Empregado {
	private String primeiro_nome;
	private	String sobrenome;
	private double salario_mensal;
	
	public Empregado (String primeiro_nome, String sobrenome, double salario_mensal) {
		this.primeiro_nome = primeiro_nome;
		this.sobrenome = sobrenome;
		this.salario_mensal = salario_mensal;
	}

	public String getPrimeiroNome() {
		return this.primeiro_nome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public double getSalario() {
		return this.salario_mensal;
	}
	
	public double setAumento() {
		return this.salario_mensal = salario_mensal+salario_mensal*0.1;
	}
	
	public void setPrimeiroNome(String primeiro_nome) {
		this.primeiro_nome = primeiro_nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void setSalario(double salario_mensal) {
		this.salario_mensal = salario_mensal;
	}
	
	public double getAumento() {
		return salario_mensal;
	}
	
	
	public void ImprimirAumento () {
		System.out.println("Aumento: \n" + getAumento());
	}
	
	public void Imprimir() {
		System.out.println("Salario Atual: \n" + salario_mensal);
		
	}
}
	