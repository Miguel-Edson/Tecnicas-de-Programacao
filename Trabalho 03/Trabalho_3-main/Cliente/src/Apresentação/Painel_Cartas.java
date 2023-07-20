package Apresentação;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import Negócio.Carta;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

	public class Painel_Cartas extends JPanel  {
		private ArrayList<Carta> cartasSelecionadas = new ArrayList<>();
		private Carta carta;
	
	
		public  Painel_Cartas () {
			super();
			this.Configurar_Painel();
			this.Add_cartas();
		}
	
		public  Painel_Cartas (Carta carta) {
			super();
			this.Configurar_Painel();
			this.Add_cartas();
			this.carta=carta;
		}
	
		private void Configurar_Painel() {
			setLayout(new FlowLayout());
			setPreferredSize(new Dimension(80, 80));
	        Color corDeFundo = new Color(197, 156, 100);
	        this.setBackground(corDeFundo);
	        
		}
	
			
			public  void Add_cartas () {
				sortearNovasCartas();
		        }
			
			
			public void sortearNovasCartas() {
			    // Lista de todos os números de cartas disponíveis
			    List<Integer> numerosDisponiveis = new ArrayList<>();
			    for (int i = 1; i <= 16; i++) {
			        numerosDisponiveis.add(i);
			    }
			    
			    // Limpar o painel atual
			    removeAll();
			    
			    // Sortear 6 novas cartas sem repetições
			    Collections.shuffle(numerosDisponiveis);
			    for (int i = 0; i < 6; i++) {
			        int numeroCarta = numerosDisponiveis.get(i);
			        Carta novaCarta = new Carta(numeroCarta);
			        add(novaCarta);
			        cartasSelecionadas.add(novaCarta);
			    }
			    
			    // Atualizar o painel
			    revalidate();
			    repaint();
			}
			

			public void Expor_Selecionadas() {
				for (int i = 0; i < carta.cartasSelecionadas_2.size(); i++) {
					System.out.println(carta.cartasSelecionadas_2.size());
				    Carta carta = cartasSelecionadas.get(i);
				    add(carta);
				    int id = carta.getId();
				    System.out.println("Carta selecionada - ID: " + id);
				}
			}

				
			
			public void removerCartasSelecionadas() {
			    cartasSelecionadas.clear();
			}
			
			
			
			public Carta getCarta() {
				return carta;
			}
	
	
			public void setCarta(Carta carta) {
				this.carta = carta;
			}

			
			
			}
	
