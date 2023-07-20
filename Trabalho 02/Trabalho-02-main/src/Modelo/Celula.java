package Modelo;

import javax.swing.JButton;

public class Celula {
	private int x;
	private int y;
	private Robo robo;
	private Elemento conteudo;
	public JButton Botao = new JButton();
	
	public Celula (int x, int y) {
		this.x = x;
		this.y = y;
		
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
	
	public Elemento getConteudo () {
		return conteudo;
	}
	
	public void setConteudo (Elemento conteudo) {
		this.conteudo = conteudo;
	}
	
	public void setRobo (Robo robo) {
		this.robo = robo;
	}
	
	public Robo getRobo () {
		return robo;
	}
}
