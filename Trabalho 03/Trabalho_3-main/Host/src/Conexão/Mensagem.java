package Conexão;

import java.util.ArrayList;

import Negócio.Eventos;

public class Mensagem {

	private Eventos evento;
	private ArrayList<String> dados; 
	
	public Mensagem(Eventos evento) {
		this.evento = evento;
		this.dados = new ArrayList<String>();
	}
	
	public Mensagem(Eventos evento, ArrayList<String> dados) {
		this.evento = evento;
		this.dados = dados;
	}

	public Eventos getEvento() {
		return this.evento;
	}
	
	public ArrayList<String> getDados() {
		return this.dados;
	}
	
	public String toString() {
		String dados = "";
		
		for (String dado : this.dados) {
			dados += dado + "\n";
		}
		
		return this.getEvento() + "\n" + dados;
	}
	
}
