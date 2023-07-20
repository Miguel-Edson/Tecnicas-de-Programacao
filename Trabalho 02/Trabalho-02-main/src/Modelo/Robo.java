package Modelo;

import Apresentação.Icone;

public abstract class Robo   {
	private int x;
	private int y;
	private int pontos;
	private Icone icone;
	private Celula localizacao_celula;
	protected String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	
	public Celula getLocalizacao() {
		return localizacao_celula;
	}
	public void setLocalizacao(Celula localizacao) {
		this.localizacao_celula = localizacao;
	}
	
	
	public void GanharPontos () {
		pontos +=10;
	}
	public void PerderPontos () {
		pontos -=15;	
	}
	
	
	public Icone getIcone () {
		return icone;
	}
	public void setIcone (Icone icone) {
		this.icone = icone;
	}
	
	

}
