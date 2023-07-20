package Negócio;

import java.util.Random;

import java.util.ArrayList;
import java.util.List;
import Conexão.*;


public class Servidor {
	private int porta; 
	private Conexão_Thread thread;
	private ArrayList<Cliente> clientes;
	
	public Servidor(int porta) {
		this.porta = porta;
		this.thread = new Conexão_Thread(this);
		this.clientes = new ArrayList<Cliente>();
	}
	
	public ArrayList<String> getIdsCartasCartas() {
		
		ArrayList<String> cartasSorteadas = new ArrayList<String>();
		
		Random sorteador = new Random();
		
		for(int i = 0; i < 6; i++) {
			cartasSorteadas.add(String.valueOf(sorteador.nextInt(24)));
		}
		
		return cartasSorteadas;
	}

	public static List<List<Integer>> agruparIds(List<Integer> ids) {
		List<List<Integer>> deckPorJogador = new ArrayList<>();
		int tamanhoDoDeck = 6;
		int quantidadeDeck = 4;
		
		for (int i = 0; i < quantidadeDeck; i ++) {
			deckPorJogador.add(new ArrayList<>());
		}
		
		int deckVazio = 0;
		for (Integer id : ids) {
			deckPorJogador.get(deckVazio).add(id);
			
			if (deckPorJogador.get(deckVazio).size() >= tamanhoDoDeck)
				deckVazio = (deckVazio + 1) % quantidadeDeck;
		}
		
		return deckPorJogador;
	}

	public static boolean verificarDecksIguais(List<List<Integer>> deckPorJogador) {
		for (int i = 0; i < deckPorJogador.size(); i++) {
			List<Integer> deck = deckPorJogador.get(i);
			for (int j = 0; j < deckPorJogador.size(); j++) {
				List<Integer> outroDeck = deckPorJogador.get(i);
				for (int k = 0; k < deck.size(); k++) {
					Integer id = deck.get(k);
					if(outroDeck.contains(id)) {
						for (int l = 0; l < 24;) {
							if(!deck.contains(l) && !outroDeck.contains(l))
								deck.set(k, l);
							break;
						}
					}
				}
			}
		}
		return true;
	}

	
	public int getPorta() {
		return this.porta;
	}
	
	public void ouvir() {
		this.thread.start();
		
		this.dinamicaDoJogo();
	}
	
	public ArrayList<Cliente> getClientes() {
		return this.clientes;
	}
	
	public void dinamicaDoJogo() {
		while(true) {
			if (this.clientes.size() == 1) {
				
				for (Cliente cliente : this.clientes) {
					cliente.getSocket().enviarMensagem(
						Eventos.CARTAS_SORTEADAS, 
						this.getIdsCartasCartas()
					);
					
				}
				
				break;
			}
		}
	}
	
}