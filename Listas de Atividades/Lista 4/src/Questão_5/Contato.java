package Questão_5;

public class Contato {
	private int codigo;
	private String nome;
	private String e_mail;
	private int telefone;
	private String obs;
	
	public Contato (int codigo) {
		this.codigo = codigo;
	}
	
	public Contato (int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Contato (int codigo, String nome, String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.e_mail = email;
	}
	
	public Contato (int codigo, String nome, String email, int telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.e_mail = email;
		this.telefone = telefone;
	}

	public String getEmail () {
		return e_mail;
	}

	public void Imprimir (String Obs) {
		System.out.printf("Código: %d %n", this.codigo);
		System.out.printf("Nome: %s%n", this.nome);
		System.out.printf("email: %s%n", this.e_mail);
		System.out.printf("Código: %d%n", this.telefone);
		System.out.printf("Observação: %s%n", Obs);
		
	}

	public boolean  Validar_Codigo () {
		if (this.codigo>=1000 && this.codigo<=9999) {
			System.out.println("Código válido");
			return true;
		}else {
			System.out.println("Código não é válido");
			return false;
		}
	}
}


