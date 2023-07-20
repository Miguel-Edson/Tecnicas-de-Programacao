package Apresentação;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JPanel;
import Negócio.Carta;


public class Painel_Votação extends JPanel{
	private ArrayList<Carta> cartasSelecionadas = new ArrayList<>();
	private Carta carta;


	public  Painel_Votação () {
		super();
		this.Configurar_Painel();
		this.Add_cartas();
	}

	public  Painel_Votação (Carta carta) {
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
		    // Lista de todos os números de cartas selecionadas
		    List<Integer> cartasSelecionadas = new ArrayList<>();
		    for (int i = 1; i <= 16; i++) {
		    	cartasSelecionadas.add(i);
		    	  Carta novaCarta = new Carta(i);
			        add(novaCarta);
		    }
		    
		    // Atualizar o painel
		    revalidate();
		    repaint();
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

