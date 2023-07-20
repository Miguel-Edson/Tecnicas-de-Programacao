package Questão_2;


public class Teste {
	public static void main (String[] args) {
	
	Empregado Empregado1= new Empregado ("João", "Silva", 2500);
	Empregado Empregado2= new Empregado ("João", "Silva", 2500);
	
//	Empregado1.setEmpregado("João", "Silva", 2500);
//	Empregado2.setEmpregado("Marcos", "Andrade", 1400);
	
	Empregado2.setPrimeiroNome("Jorge");
	Empregado2.setSobrenome("Abreu");
	Empregado2.setSalario(3500);
//	System.out.printf(Empregado2.getPrimeiroNome());
	
	Empregado1.Imprimir();
	Empregado2.Imprimir();
	
	Empregado1.setAumento();
	Empregado2.setAumento();
	
	
	Empregado1.ImprimirAumento();
	Empregado2.ImprimirAumento();
	
	System.out.printf("\nO funcionário %s %s ",Empregado1.getPrimeiroNome() , Empregado1.getSobrenome() + " recebe atualmente: R$ " + Empregado1.getSalario()) ;
	System.out.printf("\nO funcionário %s %s ",Empregado2.getPrimeiroNome() , Empregado2.getSobrenome() + " recebe atualmente: R$ " + Empregado2.getSalario()) ;
	}
	
	
}
